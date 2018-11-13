/*
		 * 如果您不Ajax调用，只需删除event.preventDefault()部分并让表单提交。
		 */
$(document).ready(function() {
	/*
	 * JS login effect
	 * This script will enable effects for the login page
	 */
	// Elements
	var doc = $('html').addClass('js-login'),
		container = $('#container'),
		formWrapper = $('#form-wrapper'),
		formBlock = $('#form-block'),
		formViewport = $('#form-viewport'),
		forms = formViewport.children('form'),

		// Doors
		topDoor = $('<div id="top-door" class="form-door"><div></div></div>').appendTo(formViewport),
		botDoor = $('<div id="bot-door" class="form-door"><div></div></div>').appendTo(formViewport),
		doors = topDoor.add(botDoor),

		// Switch
		formSwitch = $('<div id="form-switch"><span class="button-group"></span></div>').appendTo(formBlock).children(),

		// Current form
		hash = (document.location.hash.length > 1) ? document.location.hash.substring(1) : false,

		// If layout is centered
		centered,

		// Store current form
		currentForm,

		// Animation interval
		animInt,

		// Work vars
		maxHeight = false,
		blocHeight;

	/******* EDIT THIS SECTION *******/

	function openAlert(msg) {
		$.modal.alert(msg, {
			buttons : {
				'确定' : {
					classes : 'huge blue-gradient glossy full-width',
					click : function(win) {
						win.closeModal();
					}
				}
			}
		});
	}
	;

	/*
	 * Login
	 * These functions will handle the login process through AJAX
	 */
	$('#form-login').submit(function(event) {
		// Values
		var login = $.trim($('#code').val()),
			pass = $.trim($('#password').val()),
			remind=$("#remind")[0].checked,
			vCode=$.trim($("#code-login").val());

		// Check inputs
		if (login.length === 0) {
			// Display message
			displayError('请填写你的通行证');
			return false;
		} else if (pass.length === 0) {
			formWrapper.clearMessages();
			displayError('请填写你的密码');
			return false;
		}  else if (vCode.length === 0) {
			formWrapper.clearMessages();
			displayError('请填写验证码');
			return false;
		}else {
			formWrapper.clearMessages();
			displayLoading('正在登陆...');
			event.preventDefault();
			var user = new Object();
			user.code = login;
			user.password = pass;
			$.ajax({
				url : ctx + "/doLogin.json",
				data : {
					'userStr' : JSON.stringify(user),
					'autoLogin': remind,
					'code':vCode
				},
				dataType: "json",
				success : function(data) {
					formWrapper.clearMessages();
					if (data.status === "success") {
						document.location.href = ctx + '/home';
					} else if(data.status==="not"){
						displayError("验证码输入错误！");
					}else {
						openAlert(data.login_error);
					}
					changeValidateCode($("#login_random").get(0));
				},
				error : function(data) {
					document.location.href = ctx + '/500.html';
				},
				complete : function() {
					setTimeout(function() {
						formWrapper.clearMessages();
					}, 3000)
				}
			});
		}
	});

	/*
	 * Password recovery
	 */

	$("#getCode").on("click", function() {
		// Values
		var mail = $.trim($('#mail').val());
		// Check inputs
		if (mail.length === 0) {
			// Display message
			displayError('请填充有效的邮箱地址');
		} else if (!/^[a-z0-9!#$%&'*+\/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+\/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/.test(mail)) {
			// Remove empty email message if displayed
			formWrapper.clearMessages();

			// Display message
			displayError('邮箱格式错误！');
			return false;
		} else {
			// Remove previous messages
			formWrapper.clearMessages();
			displayLoading('发送中...');

			// Stop normal behavior
			event.preventDefault();
			$(this).attr('disabled', 'disabled');
			$.ajax({
				url : ctx + "/recoveryPassword.json",
				data : {
					'mail' : mail
				},
				dataType : "json",
				success : function(data) {
					formWrapper.clearMessages();
					if (data.status === "success") {
						openAlert("验证码已成功发送到你输入的邮箱中，现在去填写验证码后确定进行下一步");
						$("#send-password").removeAttr("disabled");
					} else if (data.status === "notFound") {
						displayError("没有包含此邮箱的账号，或邮箱输入有误！");
						$("#getCode").removeAttr('disabled');
					} else {
						displayError("出现异常，请联系系统管理员！");
						$("#getCode").removeAttr('disabled');
					}
				},
				error : function(data) {
					$("#getCode").removeAttr('disabled');
					document.location.href = ctx + '/500.html';
				}
			});
		}
	})
	
	$("#send-password").on("click", function() {
		var num = $("#num").val();
		if (num.length === 0) {
			// Display message
			formWrapper.clearMessages();
			displayError('请填写发送到你邮箱的验证码');
		} else {
			$.ajax({
				url : ctx + "/verifyCode.json",
				data : {
					'code' : num
				},
				dataType : "json",
				success : function(data) {
					formWrapper.clearMessages();
					if (data.status === "success") {
						updatePassword(data.v);
					} else if (data.status === "not") {
						displayError("验证码输入有误！");
					} else {
						displayError("出现异常，请联系系统管理员！");
					}
				},
				error : function(data) {
					document.location.href = ctx + '/500.html';
				}
			});
		}
	})

	function updatePassword(v) {
		$.modal({
			content : '<form action="" method="post">'
				+ '<h3 class="thin underline">正在执行找回密码操作，如果不是你本人操作请及时联系网站管理员更新密码保证安全性</h3>'
				+ '<fieldset class="fieldset">'
				+ '<input type="hidden" name="v" id="v" required="required" value="' + v + '">'
				+ '<legend class="legend">重置密码</legend>'
				+ '<p class="button-height inline-label">'
				+ '<label for="password" class="label">新的密码</label>'
				+ '<input type="password" name="password" id="oldpassword" required="required"'
				+ 'class="input full-width" value="">'
				+ '</p>'
				+ '<p class="button-height inline-label">'
				+ ' <label for="repassword" class="label">确认密码</label>'
				+ '<input type="password" name="repassword" id="repassword" required="required"'
				+ '   class="input full-width" value="">'
				+ '</p>'
				+ '</fieldset>'
				+ '<div class="button-height">'
				+ ' <button type="button" id="savePasswordBtn" class="button blue-gradient full-width">确定</button>'
				+ '</div>'
				+ '</form>',
			title : '修改密码',
			width : 550,
			height:300,
			scrolling : false,
			actions : {
				'关闭' : {
					color : 'red',
					click : function(win) {
						win.closeModal();
					}
				}
			},
			buttons : false,
			buttonsLowPadding : true
		});
	};
	
	$(document).on("click", "#savePasswordBtn", function() {
		var password = $("#oldpassword").val();
		var repassword = $("#repassword").val();
		var v = $("#v").val();
		var info = "password=" + password + "&repassword=" + repassword + "&v=" + v;
		$.post(ctx + "/updatePassword.json", info, function(data) {
			if(data.status==="success"){
				openAlert(data.msg);
				setTimeout(function() {
					document.location.href=ctx+"/login.html";
				}, 3000);
			}else if(data.status==="401"){
				document.location.href=ctx+"/401.html";
			}else if(data.status==="500"){
				document.location.href=ctx+"/500.html";
			}else if(data.status==="not"){
				openAlert(data.msg);
			}
		}, "json");
	})

	/*
	 * Register
	 */
	$('#form-register').submit(function(event) {
		// Values
		var name = $.trim($('#name-register').val()),
			mail = $.trim($('#mail-register').val()),
			pass = $.trim($('#pass-register').val()),
			repass = $.trim($('#repass-register').val()),
			phone = $.trim($('#phone-register').val()),
			code= $.trim($("#code-register").val());
		formWrapper.clearMessages();
		// Check inputs
		if (mail.length === 0) {
			displayError('请填写你的邮箱！');
			return false;
		} else if (name.length === 0) {
			displayError('请填写你的姓名！');
			return false;
		}else if (phone.length === 0) {
			displayError('请填写你的手机号！');
			return false;
		} else if(code.length=== 0 ){
			displayError("请填写验证码");
			return false;
		}else if (!/^[a-z0-9!#$%&'*+\/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+\/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/.test(mail)) {
			displayError('邮箱格式错误！');
			return false;
		}else if (pass.length === 0) {
			displayError('请填写你的密码！');
			return false;
		}else if (repass.length === 0) {
			displayError('请确认密码！');
			return false;
		}else if(pass!=repass){
			displayError('两次密码不一致！');
			return false;
		}else {
			displayLoading('申请注册中...');
			event.preventDefault();
			var userStr =new Object();
			userStr.code=name;
			userStr.email=mail;
			userStr.phone=phone;
			userStr.password=pass;
			userStr.enables=0;
			userStr.type=5;
			var url=ctx+"/register.json";
			var val="userStr="+JSON.stringify(userStr)+"&code="+code;
			$.post(url,val,function(data){
				formWrapper.clearMessages();
				if (data.status === "success") {
					openAlert("申请成功,请保管好你的密码,管理员正在审核中,24小时内审核结果会发送到你的邮箱中!");
				}else if(data.status==="not"){
					displayError("验证码输入错误！");
				}else {
					displayError("出现异常，请联系系统管理员！");
				}
				changeValidateCode($("#register_random").get(0));
			},"json");
		}
	});

	/******* END OF EDIT SECTION *******/

	/*
	 * Animated login
	 */

	// Prepare forms
	forms.each(function(i) {
		var form = $(this),
			height = form.outerHeight(),
			active = (hash === false && i === 0) || (hash === this.id),
			color = this.className.match(/[a-z]+-gradient/) ? ' ' + (/([a-z]+)-gradient/.exec(this.className)[1]) + '-active' : '';

		// Store size
		form.data('height', height);

		// Min-height for mobile layout
		if (maxHeight === false || height > maxHeight) {
			maxHeight = height;
		}

		// Button in the switch
		form.data('button', $('<a href="#' + this.id + '" class="button anthracite-gradient' + color + (active ? ' active' : '') + '">' + this.title + '</a>')
			.appendTo(formSwitch)
			.data('form', form));

		// Remove title to prevent tooltip from showing - thanks efreed :)
		this.title = '';

		// If active
		if (active) {
			// Store
			currentForm = form;

			// Height of viewport
			formViewport.height(height);
		} else {
			// Hide for now
			form.hide();
		}
	});

	// Main bloc height (without form height)
	blocHeight = formBlock.height() - currentForm.data('height');

	// Handle resizing (mostly for debugging)
	function handleLoginResize() {
		// Detect mode
		centered = (container.css('position') === 'absolute');

		// Set min-height for mobile layout
		if (!centered) {
			formWrapper.css('min-height', (blocHeight + maxHeight + 20) + 'px');
			container.css('margin-top', '');
		} else {
			formWrapper.css('min-height', '');
			if (parseInt(container.css('margin-top'), 10) === 0) {
				centerForm(currentForm, false);
			}
		}
	};

	// Register and first call
	$(window).bind('normalized-resize', handleLoginResize);
	handleLoginResize();

	// Switch behavior
	formSwitch.on('click', 'a', function(event) {
		var link = $(this);
		switchForm(link);
	});

	function switchForm(link) {
		var form = link.data('form'),
			previousForm = currentForm;
		event.preventDefault();
		if (link.hasClass('active')) {
			return;
		}

		// Refresh forms sizes
		forms.each(function(i) {
			var form = $(this),
				hidden = form.is(':hidden'),
				height = form.show().outerHeight();

			// Store size
			form.data('height', height);

			// If not active
			if (hidden) {
				// Hide for now
				form.hide();
			}
		});

		// Clear messages
		formWrapper.clearMessages();

		// If an animation is already running
		if (animInt) {
			clearTimeout(animInt);
		}
		formViewport.stop(true);

		// Update active button
		currentForm.data('button').removeClass('active');
		link.addClass('active');

		// Set as current
		currentForm = form;

		// if CSS transitions are available
		if (doc.hasClass('csstransitions')) {
			// Close doors - step 1
			doors.removeClass('door-closed').addClass('door-down');
			animInt = setTimeout(function() {
				// Close doors, step 2
				doors.addClass('door-closed');
				animInt = setTimeout(function() {
					// Hide previous form
					previousForm.hide();

					// Show target form
					form.show();

					// Center layout
					centerForm(form, true);

					// Height of viewport
					formViewport.animate({
						height : form.data('height') + 'px'
					}, function() {
						// Open doors, step 1
						doors.removeClass('door-closed');
						animInt = setTimeout(function() {
							// Open doors - step 2
							doors.removeClass('door-down');
						}, 300);
					});
				}, 300);
			}, 300);
		} else {
			// Close doors
			topDoor.animate({
				top : '0%'
			}, 300);
			botDoor.animate({
				top : '50%'
			}, 300, function() {
				// Hide previous form
				previousForm.hide();

				// Show target form
				form.show();

				// Center layout
				centerForm(form, true);

				// Height of viewport
				formViewport.animate({
					height : form.data('height') + 'px'
				}, {

					/* IE7 is a bit buggy, we must force redraw */
					step : function(now, fx) {
						topDoor.hide().show();
						botDoor.hide().show();
						formSwitch.hide().show();
					},

					complete : function() {
						// Open doors
						topDoor.animate({
							top : '-50%'
						}, 300);
						botDoor.animate({
							top : '105%'
						}, 300);
						formSwitch.hide().show();
					}
				});
			});
		}
	}

	// Initial vertical adjust
	centerForm(currentForm, false);

	/*
	 * Center function
	 * @param jQuery form the form element whose height will be used
	 * @param boolean animate whether or not to animate the position change
	 * @param string|element|array any jQuery selector, DOM element or set of DOM elements which should be ignored
	 * @return void
	 */
	function centerForm(form, animate, ignore) {
		// If layout is centered
		if (centered) {
			var siblings = formWrapper.siblings().not('.closing'),
				finalSize = blocHeight + form.data('height');

			// Ignored elements
			if (ignore) {
				siblings = siblings.not(ignore);
			}

			// Get other elements height
			siblings.each(function(i) {
				finalSize += $(this).outerHeight(true);
			});

			// Setup
			container[animate ? 'animate' : 'css']({
				marginTop : -Math.round(finalSize / 2) + 'px'
			});
		}
	}
	;

	/**
	 * Function to display error messages
	 * @param string message the error to display
	 */
	function displayError(message) {
		// Show message
		var message = formWrapper.message(message, {
			append : false,
			arrow : 'bottom',
			classes : [ 'red-gradient' ],
			animate : false // We'll do animation later, we need to know the message height first
		});

		// Vertical centering (where we need the message height)
		centerForm(currentForm, true, 'fast');

		// Watch for closing and show with effect
		message.bind('endfade', function(event) {
			// This will be called once the message has faded away and is removed
			centerForm(currentForm, true, message.get(0));

		}).hide().slideDown('fast');
	}
	;

	/**
	 * Function to display loading messages
	 * @param string message the message to display
	 */
	function displayLoading(message) {
		// Show message
		var message = formWrapper.message('<strong>' + message + '</strong>', {
			append : false,
			arrow : 'bottom',
			classes : [ 'blue-gradient', 'align-center' ],
			stripes : true,
			darkStripes : false,
			closable : false,
			animate : false // We'll do animation later, we need to know the message height first
		});

		// Vertical centering (where we need the message height)
		centerForm(currentForm, true, 'fast');

		// Watch for closing and show with effect
		message.bind('endfade', function(event) {
			// This will be called once the message has faded away and is removed
			centerForm(currentForm, true, message.get(0));

		}).hide().slideDown('fast');
	}
	;
});
function changeValidateCode(obj,flag) {
    //获取当前的时间作为参数，无具体意义
    var timenow = new Date().getTime();
    //每次请求需要一个不同的参数，否则可能会返回同样的验证码
    //这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。
    obj.src = "random.form?flag="+flag+"&d=" + timenow;
}