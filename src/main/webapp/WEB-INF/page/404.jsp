<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<!--[if IEMobile 7]><html class="no-js iem7 oldie carbon"><![endif]-->
<!--[if (IE 7)&!(IEMobile)]><html class="no-js ie7 oldie carbon" lang="en"><![endif]-->
<!--[if (IE 8)&!(IEMobile)]><html class="no-js ie8 oldie carbon" lang="en"><![endif]-->
<!--[if (IE 9)&!(IEMobile)]><html class="no-js ie9 carbon" lang="en"><![endif]-->
<!--[if (gt IE 9)|(gt IEMobile 7)]><!--><html class="no-js carbon" lang="en"><!--<![endif]-->

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>400 - 页面找不到</title>
	<meta name="description" content="">
	<meta name="author" content="">

	<!-- http://davidbcalhoun.com/2010/viewport-metatag -->
	<meta name="HandheldFriendly" content="True">
	<meta name="MobileOptimized" content="320">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

	<!-- For all browsers -->
	<link rel="stylesheet" href="<%=path%>/statics/css/reset.css?v=1">
	<link rel="stylesheet" href="<%=path%>/statics/css/style.css?v=1">
	<link rel="stylesheet" href="<%=path%>/statics/css/colors.css?v=1">

	<!-- Webfonts -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300' rel='stylesheet' type='text/css'>

	<!-- Error pages styles -->
	<link rel="stylesheet" media="screen" href="<%=path%>/statics/css/error.css?v=1">

	<!-- JavaScript at bottom except for Modernizr -->
	<script src="<%=path%>/statics/js/libs/modernizr.custom.js"></script>

	<!-- For Modern Browsers -->
	<link rel="shortcut icon" href="<%=path%>/statics/img/favicons/favicon.png">
	<!-- For everything else -->
	<link rel="shortcut icon" href="<%=path%>/statics/img/favicons/favicon.ico">
	<!-- For retina screens -->
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=path%>/statics/img/favicons/apple-touch-icon-retina.png">
	<!-- For iPad 1-->
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=path%>/statics/img/favicons/apple-touch-icon-ipad.png">
	<!-- For iPhone 3G, iPod Touch and Android -->
	<link rel="apple-touch-icon-precomposed" href="<%=path%>/statics/img/favicons/apple-touch-icon.png">

	<!-- Microsoft clear type rendering -->
	<meta http-equiv="cleartype" content="on">
</head>

<body class="clearfix">

	<!-- Prompt IE 6 users to install Chrome Frame -->
	<!--[if lt IE 7]><p class="message red-gradient simpler">Your browser is <em>ancient!</em> <a href="http://browsehappy.com/">Upgrade to a different browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to experience this site.</p><![endif]-->

	<div id="container">
		<div class="scratch-metal">
			<h1>404</h1>
			<h2>页面找不到</h2>
		</div>
		<button class="button huge anthracite-gradient glossy full-width" id="button" onclick="window.history.back();">返回</button>
	</div>

	<!-- Scripts -->
	<script src="<%=path%>/statics/js/libs/jquery-1.8.2.min.js"></script>
	<script src="<%=path%>/statics/js/setup.js"></script>

</body>
</html>