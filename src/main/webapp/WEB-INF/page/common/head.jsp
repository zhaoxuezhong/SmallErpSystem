<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="author" content="zhaoxuezhong">
<!-- http://davidbcalhoun.com/2010/viewport-metatag -->
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- For all browsers -->
<link rel="stylesheet"
	href="<%=path%>/statics/css/reset.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/style.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/colors.css?v=1">
<link rel="stylesheet" media="print"
	href="<%=path%>/statics/css/print.css?v=1">
<!-- For progressively larger displays -->
<link rel="stylesheet" media="only all and (min-width: 480px)"
	href="<%=path%>/statics/css/480.css?v=1">
<link rel="stylesheet" media="only all and (min-width: 768px)"
	href="<%=path%>/statics/css/768.css?v=1">
<link rel="stylesheet" media="only all and (min-width: 992px)"
	href="<%=path%>/statics/css/992.css?v=1">
<link rel="stylesheet" media="only all and (min-width: 1200px)"
	href="<%=path%>/statics/css/1200.css?v=1">
<!-- For Retina displays -->
<link rel="stylesheet"
	media="only all and (-webkit-min-device-pixel-ratio: 1.5), only screen 
	and (-o-min-device-pixel-ratio: 3/2), only screen and (min-device-pixel-ratio: 1.5)"
	href="<%=path%>/statics/css/2x.css?v=1">

<!-- Additional styles -->
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/agenda.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/dashboard.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/form.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/modal.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/progress-slider.css?v=1">
<link rel="stylesheet"
	href="<%=path%>/statics/css/styles/switches.css?v=1">

<!-- JavaScript at bottom except for Modernizr -->
<script
	src="<%=path%>/statics/js/libs/modernizr.custom.js"></script>

<!-- For Modern Browsers -->
<link rel="shortcut icon"
	href="<%=path%>/statics/img/favicons/favicon.png">
<!-- For everything else -->
<link rel="shortcut icon"
	href="<%=path%>/statics/img/favicons/favicon.ico">
<!-- For retina screens -->
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<%=path%>/statics/img/favicons/apple-touch-icon-retina.png">
<!-- For iPad 1-->
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<%=path%>/statics/img/favicons/apple-touch-icon-ipad.png">
<!-- For iPhone 3G, iPod Touch and Android -->
<link rel="apple-touch-icon-precomposed"
	href="<%=path%>/statics/img/favicons/apple-touch-icon.png">

<!-- iOS web-app metas -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- Startup image for web apps -->
<link rel="apple-touch-startup-image"
	href="<%=path%>
    /statics/img/splash/ipad-landscape.png"
	media="screen and (min-device-width: 481px) 
    and (max-device-width: 1024px) and (orientation:landscape)">
<link rel="apple-touch-startup-image"
	href="<%=path%>
    /statics/img/splash/ipad-portrait.png"
	media="screen and (min-device-width: 481px) 
    and (max-device-width: 1024px) and (orientation:portrait)">
<link rel="apple-touch-startup-image"
	href="<%=path%>
    /statics/img/splash/iphone.png"
	media="screen and (max-device-width: 320px)">

<!-- Microsoft clear type rendering -->
<meta http-equiv="cleartype" content="on">
<script>
	var ctx = "<%=path%>";
</script>
