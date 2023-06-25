<h2>
<%
 String user = request.getParameter("txt_uid");
 String pass = request.getParameter("txt_pwd");
 
 out.println("user name = " + user + "<br>");
 out.println("password = " + pass);
%>
<br><br>
server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
method = <%=request.getMethod() %> <br>
Protocol = <%=request.getProtocol() %> <br>
content type = <%=request.getContentType() %> <br>
content length = <%=request.getContentLength() %> <br>
application name = <%=request.getContextPath() %>
</h2>