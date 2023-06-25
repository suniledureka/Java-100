<%@page isErrorPage="true"%>
<p style="font-size:20px;color:red">
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error: - " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error: - " + exception.getMessage());
 else
	 out.println("Internal Server Error... Try Again Later");
%>
</p>