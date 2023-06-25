<%@page import="java.util.Date" info="Directives in Java Server Pages" language="java" %>

<h2 style="text-align:center">
<%
 Date today = new Date();
 out.println(today);
%>
<br><br>
<%=getServletInfo() %>
</h2>