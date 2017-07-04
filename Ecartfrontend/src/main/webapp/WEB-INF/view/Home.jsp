<html>
<head>
<%@taglib prefix="c" uri="loginpage"%>
<title>Shopping Cart</title>
	
<style>
.back{
background: white ;
  
}
a{
	color: white;
	text-decoration: none;
}
	a:hover,
	a:active{ text-decoration: none; }
#nav ul {
    list-style-type: none;
    margin:0 0 .5em 0;
    padding: 0;
    background-color: white;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
#page{ margin: 20px; }
</style>
</head>
<body class="back">

			<h1><a><font color="#ff0066">Shopping Cart</font></a></h1>
		


  <c:choose>
     <c:when test="${not empty loginButtonClicked}">    
     
      <%@include file="/WEB-INF/views/LoginForm.jsp" %>
     </c:when>
     
   
     
     
     
</body>
</html>