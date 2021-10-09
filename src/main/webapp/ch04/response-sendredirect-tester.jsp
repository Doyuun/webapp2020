<%--
  Created by IntelliJ IDEA.
  User: 202012045@office.induk.ac.kr
  Date: 2021-10-02
  Time: 오후 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>response-sendredirect-tester.jsp</title>
</head>
<body>
<%
    String name = "Induk202012045";
    response.sendRedirect("jsp-request-tester.jsp?name=" + name);
%>
</body>
</html>
