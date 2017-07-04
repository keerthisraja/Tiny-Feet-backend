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
  <form action="addNewUser" method="post" onsubmit="return formRegister()" class="form-horizontal">
  
    <div class="form-group">
      <br><br><div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="username">UserName:</label></font></div>
      <div class="col-sm-10">
        <input type="text" name="UserName" class="form-control" id="username" placeholder="Enter UserName">
      </div>
    </div>
    
    <div class="form-group">
      <div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="email">EmailId:</label></font></div>
      <div class="col-sm-10">          
        <input type="email" name="EmailId" class="form-control" id="email" placeholder="Enter EmailId">
      </div>
      </div>
      
      <div class="form-group">
     <div class="fnt"><font color="#ce3175"> <label class="control-label col-sm-2" for="password">Password:</label></font></div>
      <div class="col-sm-10">          
        <input type="password" name="Password" class="form-control" id="pass" placeholder="Enter Password">
      </div>
      </div>
      
      <div class="form-group">
      <div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="contactnumber">Contact Number:</label></font></div>
      <div class="col-sm-10">          
        <input type="text" name="ContactNumber" class="form-control" id="contactnumber" placeholder="Enter Contact Number">
      </div>
    </div>
    
    <div class="form-group">
      <div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="address">Address:</label></font></div>
      <div class="col-sm-10">          
        <input type="text" name="Address" class="form-control" id="address" placeholder="Enter Address">
      </div>
    </div>
    
     <div class="form-group">
     <div class="fnt"><font color="#ce3175"><label class="control-label col-sm-2" for="zipcode">Zipcode:</label></font></div>
      <div class="col-sm-10">          
        <input type="text" name="Zipcode" class="form-control" id="zipcode" placeholder="Enter Zipcode">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">SignUp</button>
      </div>
    </div>
    </form>
</div>


</body>
</html>