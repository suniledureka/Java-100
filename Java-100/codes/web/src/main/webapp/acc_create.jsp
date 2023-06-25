<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>account creation</title>
</head>
<body>
 <jsp:useBean id="acc" class="co.edureka.web.models.Account"></jsp:useBean>
 <jsp:setProperty property="*" name="acc"/>
 <h2>
	Account No: <jsp:getProperty property="accountNo" name="acc"/> <br>
	Account Name: <jsp:getProperty property="accountName" name="acc"/> <br>
	Account Balance: <jsp:getProperty property="accountBal" name="acc"/> 
 </h2>
</body>
</html>