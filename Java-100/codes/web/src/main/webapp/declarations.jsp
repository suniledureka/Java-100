<%!
 String companyName = "edureka limited"; //instance variable
 
 public int add(int a, int b){
	 return a+b;
 }
%>
<h2>
<%
 int x = 10; //local variable
 int y = 20; //local variable
 
 out.println("company name = " + companyName + "<br><br>");
 out.println(x + " + " + y + " = " + add(x, y));
%>
</h2>