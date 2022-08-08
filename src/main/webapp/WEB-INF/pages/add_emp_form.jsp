<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<form action="handle-product" method="post">
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="id">Employee id</label>
      <input type="text" class="form-control" name="id" placeholder="Enter id"  >
    </div>
    <div class="col-md-4 mb-3">
      <label for="firstname">First name</label>
      <input type="text" class="form-control" id="firstname" placeholder="Enter First name"  >
    </div>
    <div class="col-md-4 mb-3">
      <label for="lastname">Last name</label>
      <input type="text" class="form-control" id="lastname" placeholder="Enter last name"  >
    </div>
    <div class="col-md-4 mb-3">
      <label for="Username">Username</label>
      
        <input type="text" class="form-control" id="username"  name="username" placeholder=" Enter Username" aria-describedby="inputGroupPrepend2" >
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="password">Password</label>
      <input type="text" class="form-control" id="password" name="password" >
    </div>
    <div class="col-md-3 mb-3">
      <label for="address">Address</label>
      <input type="text" class="form-control" id="address" name="address"  >
    </div>
    <div class="col-md-3 mb-3">
      <label for="contactnum">Contact </label>
      <input type="text" class="form-control" id="contactnum" name="contactnum"  required>
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>
</body>
</html>