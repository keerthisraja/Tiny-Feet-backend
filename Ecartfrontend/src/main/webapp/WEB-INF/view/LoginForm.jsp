<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <form action="isvaliduser" method="post"  class="form-horizontal">
    <div class="form-group">
     <br><br> <div class="fnt"><font color="#ce3175"> <label class="control-label col-sm-2" for="emailid">EmailId:</label></font></div>
      <div class="col-sm-10">
        <input type="email" name="EmailId" class="form-control" id="emailid" placeholder="Enter email">
      </div>
    </div>
    <div class="form-group">
       <div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="pwd">Password:</label></font></div>
      <div class="col-sm-10">          
        <input type="password" name="Password" class="form-control" id="pwd" placeholder="Enter password">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
       <c:if test="${not empty error}">
				<div class="error"><b>${error}</b></div>
	 			</c:if> 
				<c:if test="${not empty logout}">
			<div class="msg"><b>${logout}</b></div>
				</c:if>				
				<b>${message}</b>
        <br><br><button type="submit" class="btn btn-default">Login</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>