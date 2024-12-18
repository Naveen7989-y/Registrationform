<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
      <table  id="signupform">
        
            <center><h1 id="heading">Registration Form</h1></center>
        <tbody>
           <form action="SaveUser" method="post">
           		 <tr>
                <td><label for="firstname">FIRSTNAME</label></td>
                <td><input type="text" name="firstname" placeholder="Enter" id="firstname" ></td>
            </tr>
            <tr>
                <td><label for="lastname">LASTNAME</label></td>
                <td><input type="text" name="lastname" placeholder="Enter" id="lastname" ></td>
            </tr>
            <tr>
                <td><label for="dob">DATEOFBIRTH</label></td>
                <td><input type="date" name="dob" placeholder="Enter" id="dob" ></td>
            </tr>
            <tr>
                <td><label for="createpassword">CREATE PASSWORD</label></td>
                <td id="pwbox">
                    <input type="password" name="createpassword" placeholder="Enter" id="createpassword" >
                    <span id="see"><button id="seebtn">see</button></span>
                </td>
            </tr>
            <tr>
                <td><label for="email">E-MAIL</label></td>
                <td><input type="email" name="email" placeholder="Enter" id="email" ></td>
            </tr>
            <tr>
                <td><label for="contactno">CONTACT NO</label></td>
                <td><input type="tel" name="contactno" placeholder="Enter" id="mobile" maxlength="10" size="10" ></td>
            </tr>
            <tr>
                <td><center><button id="generate">Already a user?</button></center></td>
			<td>
			        <a href="login.jsp"><button type="button" id="loginButton">Login</button></a>
			  </td>
            </tr>
            <tr >
                <td colspan="2">
                    <center><input id="createacc" type="submit" name="submit" value="Submit" placeholder="Submit"></center></a>
                </td>
            </tr>
           		
           </form>
        </tbody>
      </table>
</body>
</html>