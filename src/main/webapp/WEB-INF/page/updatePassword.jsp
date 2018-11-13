<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>ERP系统管理 - 重置密码</title>
    <meta name="author" content="zhaoxuezhong">
    <meta name="HandheldFriendly" content="True">
    <meta name="MobileOptimized" content="320">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!-- For all browsers -->
    <link rel="stylesheet" href="<%=path%>/statics/css/reset.css?v=1">
    <link rel="stylesheet" href="<%=path%>/statics/css/style.css?v=1">
    <link rel="stylesheet" href="<%=path%>/statics/css/colors.css?v=1">
    <link rel="stylesheet" media="print" href="<%=path%>/statics/css/print.css?v=1">
    <!-- For progressively larger displays -->
    <link rel="stylesheet" media="only all and (min-width: 480px)" href="<%=path%>/statics/css/480.css?v=1">
    <link rel="stylesheet" media="only all and (min-width: 768px)" href="<%=path%>/statics/css/768.css?v=1">
    <link rel="stylesheet" media="only all and (min-width: 992px)" href="<%=path%>/statics/css/992.css?v=1">
    <link rel="stylesheet" media="only all and (min-width: 1200px)" href="<%=path%>/statics/css/1200.css?v=1">
    <!-- For Retina displays -->
    <link rel="stylesheet"
          media="only all and (-webkit-min-device-pixel-ratio: 1.5), only screen and (-o-min-device-pixel-ratio: 3/2), only screen and (min-device-pixel-ratio: 1.5)"
          href="<%=path%>/statics/css/2x.css?v=1">
    <!-- Additional styles -->
    <link rel="stylesheet" href="<%=path%>/statics/css/styles/form.css?v=1">
    
    <link rel="shortcut icon" href="<%=path%>/statics/img/favicons/favicon.png">
    <!-- For everything else -->
    <link rel="shortcut icon" href="<%=path%>/statics/img/favicons/favicon.ico">
    <!-- For retina screens -->
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=path%>/statics/img/favicons/apple-touch-icon-retina.png">
    <!-- For iPad 1-->
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=path%>/statics/img/favicons/apple-touch-icon-ipad.png">
    <!-- For iPhone 3G, iPod Touch and Android -->
    <link rel="apple-touch-icon-precomposed" href="<%=path%>/statics/img/favicons/apple-touch-icon.png">
    <script
		src="<%=path%>/statics/js/libs/jquery-1.8.2.min.js"></script>
    <script src="<%=path%>/statics/js/developr.modal.js"></script>
</head>

<body class="clearfix with-menu with-shortcuts">
<script>
	
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
	
	var message="${message}";
	if(message!=null&&message!=""){
		openAlert(message);
	}
</script>
<!-- Main content -->
<section role="main" id="main">
    <div class="with-padding">
        <div class="new-row-desktop four-columns six-columns-tablet twelve-columns-mobile">
            <form action="<%=path %>/updatePassword.html" method="post">
                <h3 class="thin underline">正在执行找回密码操作，如果不是你本人操作请及时联系网站管理员更新密码保证安全性</h3>
                <fieldset class="fieldset">
                    <legend class="legend">重置密码</legend>
                    <p class="button-height inline-label">
                        <label for="password" class="label">新的密码</label>
                        <input type="password" name="password" id="password" required="required"
                               class="input full-width" value="" data-tooltip-options='{"position":"right"}'>
                    </p>
                    <p class="button-height inline-label">
                        <label for="repassword" class="label">确认密码</label>
                        <input type="password" name="repassword" id="repassword" required="required"
                               class="input full-width" value="" data-tooltip-options='{"position":"right"}'>
                    </p>
                </fieldset>
                <div class="button-height">
                    <button type="submit" class="button blue-gradient full-width">确定</button>
                </div>
            </form>
        </div>
    </div>
</section>
</body>
</html>