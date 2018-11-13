<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!--[if IEMobile 7]><html class="no-js iem7 oldie linen"><![endif]-->
<!--[if (IE 7)&!(IEMobile)]><html class="no-js ie7 oldie linen" lang="en"><![endif]-->
<!--[if (IE 8)&!(IEMobile)]><html class="no-js ie8 oldie linen" lang="en"><![endif]-->
<!--[if (IE 9)&!(IEMobile)]><html class="no-js ie9 linen" lang="en"><![endif]-->
<!--[if (gt IE 9)|(gt IEMobile 7)]><!-->
<html class="no-js linen" lang="en">
<!--<![endif]-->
<head>
<title>登陆</title>
<%@ include file="common/head.jsp"%>
<!-- Login pages styles -->
<link rel="stylesheet" media="screen"
	href="<%=path%>/statics/css/login.css?v=1">
<!-- IE9 Pinned Sites: http://msdn.microsoft.com/en-us/library/gg131029.aspx -->
<meta name="application-name" content="ERP系统管理  - 登陆">
<meta name="msapplication-tooltip" content="ERP系统管理  - 登陆">
<meta name="msapplication-starturl"
	content="http://192.168.1.100/SmallErpSystem/login.html">
<!-- These custom tasks are examples, you need to edit them to show actual pages -->
<meta name="msapplication-task"
	content="name=ERP系统管理;action-uri=http://192.168.1.100/SmallErpSystem/login.html;
	icon-uri=http://192.168.1.100/SmallErpSystem/statics/img/favicons/favicon.ico">
<style>
 span.login_span {
	display: inline-block;
	width: 10px;
}
</style>
<script>
	var ctx = "<%=path%>";
	var message = "${message}";
	if (message != null && message != "") {
		openAlert(message);
	}
</script>
</head>

<body>

	<div id="container">
		<div id="login-title" class="large-margin-bottom">
			<h1 class="login-title-image">ERP管理系统</h1>
			<h5>&copy; &nbsp;&nbsp;ERP管理系统</h5>
		</div>
		<div id="form-wrapper">

			<div id="form-block" class="scratch-metal">
				<div id="form-viewport">
					<form method="post" action="" id="form-login" onsubmit="return false;"
						class="input-wrapper blue-gradient glossy" title="登录">
						<ul class="inputs black-input large">
							<!-- The autocomplete="off" attributes is the only way to prevent webkit browsers from filling the inputs with yellow -->
							<li><span class="login_span icon-user mid-margin-right"></span>
								<input type="text" name="code" id="code" value=""
								class="input-unstyled" placeholder="员工编号/邮箱"
								autocomplete="off"></li>
							<li><span class="login_span icon-lock mid-margin-right"></span>
								<input type="password" name="password" id="password" value=""
								class="input-unstyled" placeholder="密码" autocomplete="off"></li>
							<li style="padding-right:4px"><input type="text" name="code" id="code-login" value="" class="input-unstyled" 
								placeholder="验证码" autocomplete="off" style="width:50%">
								<span style="float:right;"><img onclick="changeValidateCode(this,'login')" 
								style="margin-left: 5%;vertical-align: middle;"
								 src="random.form?flag=login" id="login_random" title="点击刷新验证码"alt="验证码"></span> 
                     		</li>
						</ul>

						<p class="button-height">
							<button type="submit" class="button glossy float-right"
								id="loginBtn">登录</button>
							<input type="checkbox" name="remind" id="remind" value="1"
								checked="checked"
								class="switch tiny replacement checked" title="自动登陆">
							<label for="remind">记住密码</label>
						</p>
					</form>

					<form method="post" action="" id="form-password" onsubmit="return false;"
						class="input-wrapper orange-gradient glossy" title="忘记密码？">
						<p class="message">
							如果你记不住你的密码，请将你的电子邮件填写在下面，我们会给你发送一个验证码，你根据提示修改密码。 <span class="block-arrow"><span></span></span>
						</p>
						<ul class="inputs black-input large">
							<li><span class="login_span icon-mail mid-margin-right"></span> <input
								type="email" name="mail" id="mail" value=""
								class="input-unstyled" placeholder="填写邮箱获取验证码" autocomplete="off">
							</li>
							<li><span class="login_span icon-info mid-margin-right"></span> <input
								type="text" name="num" id="num" value=""
								class="input-unstyled" placeholder="输入验证码点击继续" autocomplete="off">
							</li>
						</ul>
						<button type="button" class="button green-gradient" style="width:39%"
							id="getCode">获取验证码</button>
						<button type="button" class="button glossy" style="width:39%" disabled="disabled"
							id="send-password">继续</button>
					</form>

					<form method="post" action="" id="form-register" onsubmit="return false;"
						class="input-wrapper green-gradient glossy" title="注册">
						<p class="message">
							注册新用户？在开始之前，请告诉我们一些关于你的事情。 <span class="block-arrow"><span></span></span>
						</p>
						<ul class="inputs black-input large">
							<li><span class="login_span icon-mail mid-margin-right"></span> <input
								type="email" name="mail" id="mail-register" value=""
								class="input-unstyled" placeholder="你的邮箱" autocomplete="off"></li>
							<li><span class="login_span icon-card mid-margin-right"></span> <input
								type="text" name="name" id="name-register" value=""
								class="input-unstyled" placeholder="你的账号" autocomplete="off"></li>
							<li><span class="login_span icon-phone mid-margin-right"></span> <input
								type="tel" name="phone" id="phone-register" value=""
								class="input-unstyled" placeholder="手机号码" autocomplete="off"></li>
							<li><span class="login_span icon-lock mid-margin-right"></span> <input
								type="password" name="password" id="pass-register" value=""
								class="input-unstyled" placeholder="输入密码" autocomplete="off"></li>
							<li><span class="login_span icon-lock mid-margin-right"></span> <input
								type="password" name="repassword" id="repass-register" value=""
								class="input-unstyled" placeholder="确认密码" autocomplete="off"></li>
							<li style="padding-right:4px"><input type="text" name="code" id="code-register" value="" class="input-unstyled" 
								placeholder="验证码" autocomplete="off" style="width:50%">
								<span style="float:right;"><img onclick="changeValidateCode(this,'register')" 
								style="margin-left: 5%;vertical-align: middle;"
								 src="random.form?flag=register" id="register_random" title="点击刷新验证码"alt="验证码"></span> 
                     		</li>
						</ul>
						<button type="submit" class="button glossy full-width"
							id="send-register">申请注册</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Scripts -->
	<%@ include file="common/footer.jsp"%>

	<script type="text/javascript" src="<%=path%>/statics/localJs/login.js"></script>

</body>
</html>