<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>

  <div id="naveen">
    <table id="loginform">
        <tbody>
        <form action="loginServlet" method="post">
         <tr>
             <td colspan="2"><h2><center>Login Form</center></h2></td>
     
         </tr>
         <tr>
             <td><label for="email">E-Mail</label></td>
             <td><input type="email" name="email" placeholder="Enter" id="username"></td>
         </tr>
         <tr>
             <td><label for="Password">Password</label></td>
             <td><input type="password" name="password" placeholder="Enter" id="password"></td>
         </tr>
        
         <tr>
             
             <td><a href="index.jsp"><center><button type="button" id="signup">Sign Up</button></center></a></td>
             <td ><center><button type="submit" id="submit">Sign in</button></center></td>
         </tr>
        
        
        </form>
        
        </tbody>
        </table>
  </div>
</body>
</html>