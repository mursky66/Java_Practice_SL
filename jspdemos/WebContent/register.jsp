<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <form action="" method="post">
		 EnterName:<input type="text" name="fname"><br/>
		 EnterAge:<input type="text" name="age"><br/>
		 EnterEmail:<input type="text" name="email"><br/>
		 EnterPassword:<input type="password" name="password"><br/>
		 Gender: <input type="radio" name="gender" value="female"/>female
		 				&nbsp;&nbsp;&nbsp;&nbsp;
		 		<input type="radio" name="gender" value="male"/>male<br/>
		 Hobbies:	 <input type="checkbox" name="hobby" value="reading">Reading	
						&nbsp;&nbsp;&nbsp;&nbsp;
			    <input type="checkbox" name="hobby" value="browsing">Browsing	
						&nbsp;&nbsp;&nbsp;&nbsp;
			    <input type="checkbox" name="hobby" value="gaming">Gaming
					    &nbsp;&nbsp;&nbsp;&nbsp;
			    <input type="checkbox" name="hobby" value="cooking">Cooking	<br/>
		Country: <select name="country">
			<option value="SELECT">SELECT COUNTRY </option>					 		
			<option value="INDIA">INDIA </option>					 		
			<option value="USA">USA </option>					 		
			<option value="UK">UK </option>					 		
			<option value="GERMANY">GERMANY </option>					 		
			<option value="CANADA">CANADA </option>					 		
			<option value="OTHERS"> OTHERS </option>	
			</select> <br/> <br/>
					 		
		 <input type="Submit" name="register" value="Register Details"/>
		 
	 </form>
	
	
	 <%  if(request.getParameter("register") !=null) {%>
	 	<jsp:useBean id="user" class="com.to.User" scope="request"></jsp:useBean>
	 	<jsp:setProperty property="*" name="user"/>
	 	<jsp:forward page="RegisterServlet"></jsp:forward>
	 
	<% } %> 
	
		
	



	<%@include file="footer.html" %>	



	
</body>
</html>