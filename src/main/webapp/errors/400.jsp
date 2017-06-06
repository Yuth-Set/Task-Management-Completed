<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Log in with your account</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2 text-center">
				<div class="error-template">
					<h1>Oops!</h1>
					<h2>400 Bad request</h2>
					<div class="error-details">
						<p>
							<%
								java.text.DateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
							%>
							Current Date:
							<%=df.format(new java.util.Date())%>
						</p>
						<br> Sorry, The request had bad syntax or was inherently
						impossible to be satisfied!
					</div>
					<div class="error-actions">
						<a href="<c:url value="/dashboard" />" class="btn btn-primary btn-lg"><span
							class="glyphicon glyphicon-home"></span> Take Me Home </a><a
							href="<c:url value="/dashboard" />" class="btn btn-default btn-lg"><span
							class="glyphicon glyphicon-envelope"></span> Contact Support </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
