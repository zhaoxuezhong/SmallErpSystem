<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IEMobile 7]><html class="no-js iem7 oldie"><![endif]-->
<!--[if (IE 7)&!(IEMobile)]><html class="no-js ie7 oldie" lang="en"><![endif]-->
<!--[if (IE 8)&!(IEMobile)]><html class="no-js ie8 oldie" lang="en"><![endif]-->
<!--[if (IE 9)&!(IEMobile)]><html class="no-js ie9" lang="en"><![endif]-->
<!--[if (gt IE 9)|(gt IEMobile 7)]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<title>ERP系统管理 - 首页</title>
<%@ include file="common/head.jsp" %>
<!-- IE9 Pinned Sites: http://msdn.microsoft.com/en-us/library/gg131029.aspx -->
<meta name="application-name" content="ERP系统管理 - 首页">
<meta name="msapplication-tooltip" content="ERP系统管理  - 首页">
<meta name="msapplication-starturl"
	content="http://192.168.1.100/SmallErpSystem/home/">
<!-- These custom tasks are examples, you need to edit them to show actual pages -->
<meta name="msapplication-task"
	content="name=ERP系统管理;action-uri=http://192.168.1.100/SmallErpSystem/home/;
		icon-uri=http://192.168.1.100/SmallErpSystem/statics/img/favicons/favicon.ico">
<style>
body::-webkit-scrollbar {
	display: none;
}
</style>
<script>
	var ctx = "<%=path%>";
</script>
</head>

<body class="clearfix with-menu with-shortcuts">

	<!-- Prompt IE 6 users to install Chrome Frame -->
	<!--[if lt IE 7]><p class="message red-gradient simpler">Your browser is <em>ancient!</em> <a href="http://browsehappy.com/">Upgrade to a different browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to experience this site.</p><![endif]-->

	<!-- Title bar -->
	<header role="banner" id="title-bar">
		<h2>ERP 系统</h2>
	</header>

	<!-- Button to open/hide menu -->
	<a href="#" id="open-menu"><span>菜单</span></a>

	<!-- Button to open/hide shortcuts -->
	<a href="#" id="open-shortcuts"><span class="icon-thumbs"></span></a>

	<!-- Main content -->
	<section role="main" id="main">
		<iframe id="mainFrame"
			src="<%=request.getContextPath() %>/home/index.html" width="100%"
			scrolling="no"></iframe>
		<script>
        // document.domain = "caibaojian.com";
        function setIframeHeight(iframe) {
            if (iframe) {
                var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
                if (iframeWin.document.body) {
                    iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
                }
            }
        };

        window.onload = function () {
            setIframeHeight(document.getElementById('mainFrame'));
        };
    </script>
	</section>
	<!-- End main content -->

	<!-- Side tabs shortcuts -->
	<ul id="shortcuts" role="complementary"
		class="children-tooltip tooltip-right">
		<li class="current"><a href="./" class="shortcut-dashboard"
			title="Dashboard">Dashboard</a></li>
		<li><a href="<%=path%>/statics/inbox.html"
			class="shortcut-messages" title="Messages">Messages</a></li>
		<li><a href="<%=path%>/statics/agenda.html"
			class="shortcut-agenda" title="Agenda">Agenda</a></li>
		<li><a href="<%=path%>/statics/tables.html"
			class="shortcut-contacts" title="Contacts">Contacts</a></li>
		<li><a href="<%=path%>/statics/explorer.html"
			class="shortcut-medias" title="Medias">Medias</a></li>
		<li><a href="<%=path%>/statics/sliders.html"
			class="shortcut-stats" title="Stats">Stats</a></li>
		<li class="at-bottom"><a href="<%=path%>/statics/form.html"
			class="shortcut-settings" title="Settings">Settings</a></li>
		<li><a href="<%=path%>/statics/files.html" class="shortcut-notes"
			title="Notes">Notes</a></li>
	</ul>

	<!-- Sidebar/drop-down menu -->
	<section id="menu" role="complementary">

		<!-- This wrapper is used by several responsive layouts -->
		<div id="menu-content">
			<header> &nbsp;${loginUser.typeName } </header>
			<div id="profile">
				<img src="<%=path%>/statics/img/user.png" width="43" height="43"
					alt="用户名" class="user-icon">你好 <span class="name"
					style="margin-top:4px"><b>${loginUser.code} </b></span>
			</div>
			<!-- By default, this section is made for 4 icons, see the doc to learn how to change this, in "basic markup explained" -->
			<ul id="access" class="children-tooltip">
				<li><a href="<%=path%>/" title="待办任务"> <span
						class="icon-bell"></span><span class="count">2</span></a></li>
				<li><a href="<%=path%>/" title="日程"> <span
						class="icon-calendar"></span></a></li>
				<li><a href="<%=path%>/" title="账户信息"> <span
						class="icon-user"></span></a></li>
				<li><a href="<%=path%>/logOut.html" title="退出"> <span
						class="icon-outbox"></span></a></li>
			</ul>

			<section class="navigable">
				<ul class="big-menu">
					<li class="with-right-arrow"><span><span
							class="list-count">11</span>Main styles</span>
						<ul class="big-menu">
							<li><a href="typography.html">Typography</a></li>
							<li><a href="columns.html">Columns</a></li>
							<li><a href="tables.html">Tables</a></li>
							<li><a href="colors.html">Colors &amp; backgrounds</a></li>
							<li><a href="icons.html">Icons</a></li>
							<li><a href="files.html">Files &amp; Gallery</a></li>
							<li class="with-right-arrow"><span><span
									class="list-count">4</span>Forms &amp; buttons</span>
								<ul class="big-menu">
									<li><a href="buttons.html">Buttons</a></li>
									<li><a href="form.html">Form elements</a></li>
									<li><a href="textareas.html">Textareas &amp; WYSIWYG</a></li>
									<li><a href="form-layouts.html">Form layouts</a></li>
									<li><a href="wizard.html">Wizard</a></li>
								</ul></li>
							<li class="with-right-arrow"><span><span
									class="list-count">2</span>Agenda &amp; Calendars</span>
								<ul class="big-menu">
									<li><a href="agenda.html">Agenda</a></li>
									<li><a href="calendars.html">Calendars</a></li>
								</ul></li>
							<li><a href="blocks.html">Blocks &amp; infos</a></li>
						</ul></li>
					<li class="with-right-arrow"><span><span
							class="list-count">8</span>Main features</span>
						<ul class="big-menu">
							<li><a href="auto-setup.html">Automatic setup</a></li>
							<li><a href="responsive.html">Responsiveness</a></li>
							<li><a href="tabs.html">Tabs</a></li>
							<li><a href="sliders.html">Slider &amp; progress</a></li>
							<li><a href="modals.html">Modal windows</a></li>
							<li class="with-right-arrow"><span><span
									class="list-count">3</span>Messages &amp; notifications</span>
								<ul class="big-menu">
									<li><a href="messages.html">Messages</a></li>
									<li><a href="notifications.html">Notifications</a></li>
									<li><a href="tooltips.html">Tooltips</a></li>
								</ul></li>
						</ul></li>
					<li class="with-right-arrow"><span><span
							class="list-count">8</span>Main features</span>
						<ul class="big-menu">
							<li><a href="auto-setup.html">Automatic setup</a></li>
							<li><a href="responsive.html">Responsiveness</a></li>
							<li><a href="tabs.html">Tabs</a></li>
							<li><a href="sliders.html">Slider &amp; progress</a></li>
							<li><a href="modals.html">Modal windows</a></li>
							<li class="with-right-arrow"><span><span
									class="list-count">3</span>Messages &amp; notifications</span>
								<ul class="big-menu">
									<li><a href="messages.html">Messages</a></li>
									<li><a href="notifications.html">Notifications</a></li>
									<li><a href="tooltips.html">Tooltips</a></li>
								</ul></li>
						</ul></li>
					<li class="with-right-arrow"><span><span
							class="list-count">8</span>Main features</span>
						<ul class="big-menu">
							<li><a href="auto-setup.html">Automatic setup</a></li>
							<li><a href="responsive.html">Responsiveness</a></li>
							<li><a href="tabs.html">Tabs</a></li>
							<li><a href="sliders.html">Slider &amp; progress</a></li>
							<li><a href="modals.html">Modal windows</a></li>
							<li class="with-right-arrow"><span><span
									class="list-count">3</span>Messages &amp; notifications</span>
								<ul class="big-menu">
									<li><a href="messages.html">Messages</a></li>
									<li><a href="notifications.html">Notifications</a></li>
									<li><a href="tooltips.html">Tooltips</a></li>
								</ul></li>
						</ul></li>
				</ul>
			</section>

			<ul class="unstyled-list">
				<li class="title-menu">待办任务</li>
				<li>
					<ul class="calendar-menu">
						<li>
							<a href="#" title="See event">
								<time datetime="2018-11-11">
									<b>11</b> 11
								</time>
								<small class="green">10:30</small> 待办任务1
							</a>
						</li>
					</ul>
				</li>
				<li class="title-menu">最新信息</li>
				<li>
					<ul class="message-menu">
						<li>
							<span class="message-status"> 
								<a href="#" class="starred" title="取消收藏">已收藏</a>
								<a href="#" class="new-message" title="标记为已读">new</a>
							</span>
							<span class="message-info">
								<span class="blue">17:12</span>
								<a href="#" class="attach" title="下载附件">附件</a>
							</span>
							<a href="#" title="Read message"> 
								<strong class="blue">发送者/标题</strong><br> 
								<strong>信息内容</strong>
							</a>
						</li>
						<li>
							<span class="message-status"> 
								<a href="#" class="unstarred" title="收藏">收藏</a>
								<a href="#" class="new-message" title="标记为已读">new</a>
							</span>
							<span class="message-info">
								<span class="blue">17:12</span>
							</span>
							<a href="#" title="Read message"> 
								<strong class="blue">发送者/标题</strong><br> 
								<strong>信息内容</strong>
							</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- End content wrapper -->
		<!-- This is optional -->
		<footer id="menu-footer">
			<p class="button-height">
				<input type="checkbox" name="auto-refresh" id="auto-refresh" 
				checked="checked" class="switch float-right">
				<label for="auto-refresh">自动刷新</label>
			</p>
			<div style="width:240px;margin-bottom:20px">
				<p class="inline-medium-label button-height" style="padding-left:0">
					<input style="width:20px;margin-right:10px" type="text"
						name="demo-slider2" id="demo-slider2" value="20"
						class="input demo-slider"
						data-slider-options='
					{"hideInput":false,"size":160,"innerMarks":5,"step":5,"stickToStep":false,"autoSpacing"
					:true,"topMarks":15,"topLabel":"[value]分","max":"60","barClasses":
					"orange-gradient"}'>
				</p>
			</div>
		</footer>
	</section>
	<!-- End sidebar/drop-down menu -->

	<!-- JavaScript at the bottom for fast page loading -->
	<%@ include file="common/footer.jsp" %>
	<script>
		// Call template init (optional, but faster if called manually)
		$.template.init();
	
		// Favicon count
		Tinycon.setBubble(2);
		
		// Progress
		$('.demo-progress').progress();

		// Slider
		$('.demo-slider').slider();
	
		// If the browser support the Notification API, ask user for permission (with a little delay)
		if (notify.hasNotificationAPI() && !notify.isNotificationPermissionSet()) {
			setTimeout(function() {
				notify.showNotificationPermission('Your browser supports desktop notification, click here to enable them.', function() {
					// Confirmation message
					if (notify.hasNotificationPermission()) {
						notify('Notifications API enabled!', 'You can now see notifications even when the application is in background', {
							icon : '<%=path%>/statics/img/demo/icon.png',
							system : true
						});
					} else {
						notify('Notifications API disabled!', 'Desktop notifications will not be used.', {
							icon : '<%=path%>/statics/img/demo/icon.png'
						});
					}
				});
	
			}, 2000);
		}
	
		/*
		 * Handling of 'other actions' menu
		 */
	
		var otherActions = $('#otherActions'),
			current = false;
	
		// Other actions
		$('.list .button-group a:nth-child(2)').menuTooltip('Loading...', {
			classes : [ 'with-mid-padding' ],
			ajax : 'ajax-demo/tooltip-content.html',
	
			onShow : function(target) {
				// Remove auto-hide class
				target.parent().removeClass('show-on-parent-hover');
			},
	
			onRemove : function(target) {
				// Restore auto-hide class
				target.parent().addClass('show-on-parent-hover');
			}
		});
	
		// Delete button
		$('.list .button-group a:last-child').data('confirm-options', {
			onShow : function() {
				// Remove auto-hide class
				$(this).parent().removeClass('show-on-parent-hover');
			},
	
			onConfirm : function() {
				// Remove element
				$(this).closest('li').fadeAndRemove();
	
				// Prevent default link behavior
				return false;
			},
	
			onRemove : function() {
				// Restore auto-hide class
				$(this).parent().addClass('show-on-parent-hover');
			}
		});
	
		// Demo modal
		function openModal() {
			$.modal({
				content : '<p>This is an example of modal window. You can open several at the same time (click links below!), move them and resize them.</p>' +
					'<p>The plugin provides several other functions to control them, try below:</p>' +
					'<ul class="simple-list with-icon">' +
					'    <li><a href="javascript:void(0)" onclick="openModal()">Open new blocking modal</a></li>' +
					'    <li><a href="javascript:void(0)" onclick="$.modal.alert(\'This is a non-blocking modal, you can switch between me and the other modal\', { blocker: false })">Open non-blocking modal</a></li>' +
					'    <li><a href="javascript:void(0)" onclick="$(this).getModalWindow().setModalTitle(\'\')">Remove title</a></li>' +
					'    <li><a href="javascript:void(0)" onclick="$(this).getModalWindow().setModalTitle(\'New title\')">Change title</a></li>' +
					'    <li><a href="javascript:void(0)" onclick="$(this).getModalWindow().loadModalContent(\'ajax-demo/auto-setup.html\')">Load Ajax content</a></li>' +
					'</ul>',
				title : 'Example modal window',
				width : 300,
				scrolling : false,
				actions : {
					'Close' : {
						color : 'red',
						click : function(win) {
							win.closeModal();
						}
					},
					'Center' : {
						color : 'green',
						click : function(win) {
							win.centerModal(true);
						}
					},
					'Refresh' : {
						color : 'blue',
						click : function(win) {
							win.closeModal();
						}
					},
					'Abort' : {
						color : 'orange',
						click : function(win) {
							win.closeModal();
						}
					}
				},
				buttons : {
					'Close' : {
						classes : 'huge blue-gradient glossy full-width',
						click : function(win) {
							win.closeModal();
						}
					}
				},
				buttonsLowPadding : true
			});
		}
		;
	
		// Demo alert
		function openAlert() {
			$.modal.alert('This is an alert message', {
				buttons : {
					'Thanks, captain obvious' : {
						classes : 'huge blue-gradient glossy full-width',
						click : function(win) {
							win.closeModal();
						}
					}
				}
			});
		}
		;
	
		// Demo prompt
		function openPrompt() {
			var cancelled = false;
	
			$.modal.prompt('Please enter a value between 5 and 10:', function(value) {
				value = parseInt(value);
				if (isNaN(value) || (value < 5) || (value > 10)) {
					$(this).getModalContentBlock().message('Please enter a correct value', {
						append : false,
						classes : [ 'red-gradient' ]
					});
					return false;
				}
	
				$.modal.alert('Value: <strong>' + value + '</strong>');
	
			}, function() {
				if (!cancelled) {
					$.modal.alert('Oh, come on....');
					cancelled = true;
					return false;
				}
			});
		}
		;
	
		// Demo confirm
		function openConfirm() {
			$.modal.confirm('Challenge accepted?', function() {
				$.modal.alert('Me gusta!');
	
			}, function() {
				$.modal.alert('Meh.');
			});
		}
		;
	
		/*
		 * Agenda scrolling
		 * This example shows how to remotely control an agenda. most of the time, the built-in controls
		 * using headers work just fine
		 */
	
		// Days
		var daysName = [ 'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday' ],
	
			// Name display
			agendaDay = $('#agenda-day'),
	
			// Agenda scrolling
			agenda = $('#agenda').scrollAgenda({
				first : 2,
				onRangeChange : function(start, end) {
					if (start != end) {
						agendaDay.text(daysName[start].substr(0, 3) + ' - ' + daysName[end].substr(0, 3));
					} else {
						agendaDay.text(daysName[start]);
					}
				}
			});
	
		// Remote controls
		$('#agenda-previous').click(function(event) {
			event.preventDefault();
			agenda.scrollAgendaToPrevious();
		});
		$('#agenda-today').click(function(event) {
			event.preventDefault();
			agenda.scrollAgendaFirstColumn(2);
		});
		$('#agenda-next').click(function(event) {
			event.preventDefault();
			agenda.scrollAgendaToNext();
		});
	
		// Demo loading modal
		function openLoadingModal() {
			var timeout;
	
			$.modal({
				contentAlign : 'center',
				width : 240,
				title : 'Loading',
				content : '<div style="line-height: 25px; padding: 0 0 10px"><span id="modal-status">Contacting server...</span><br><span id="modal-progress">0%</span></div>',
				buttons : {},
				scrolling : false,
				actions : {
					'Cancel' : {
						color : 'red',
						click : function(win) {
							win.closeModal();
						}
					}
				},
				onOpen : function() {
					// Progress bar
					var progress = $('#modal-progress').progress(100, {
							size : 200,
							style : 'large',
							barClasses : [ 'anthracite-gradient', 'glossy' ],
							stripes : true,
							darkStripes : false,
							showValue : false
						}),
	
						// Loading state
						loaded = 0,
	
						// Window
						win = $(this),
	
						// Status text
						status = $('#modal-status'),
	
						// Function to simulate loading
						simulateLoading = function() {
							++loaded;
							progress.setProgressValue(loaded + '%', true);
							if (loaded === 100) {
								progress.hideProgressStripes().changeProgressBarColor('green-gradient');
								status.text('Done!');
								/*win.getModalContentBlock().message('Content loaded!', {
								    classes: ['green-gradient', 'align-center'],
								    arrow: 'bottom'
								});*/
								setTimeout(function() {
									win.closeModal();
								}, 1500);
							} else {
								if (loaded === 1) {
									status.text('Loading data...');
									progress.changeProgressBarColor('blue-gradient');
								} else if (loaded === 25) {
									status.text('Loading assets (1/3)...');
								} else if (loaded === 45) {
									status.text('Loading assets (2/3)...');
								} else if (loaded === 85) {
									status.text('Loading assets (3/3)...');
								} else if (loaded === 92) {
									status.text('Initializing...');
								}
								timeout = setTimeout(simulateLoading, 50);
							}
						};
	
					// Start
					timeout = setTimeout(simulateLoading, 2000);
				},
				onClose : function() {
					// Stop simulated loading if needed
					clearTimeout(timeout);
				}
			});
		}
		;
	</script>

</body>
</html>