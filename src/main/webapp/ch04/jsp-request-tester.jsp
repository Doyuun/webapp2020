<%--
  Created by IntelliJ IDEA.
  User: 202012045@office.induk.ac.kr
  Date: 2021-10-02
  Time: 오후 7:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>202012045 JSP Request Tester</title>
</head>
<body>
    getServerPort : <%= request.getServerPort()%> <br/>
    getServerName : <%= request.getServerName()%> <br/>
    getRequestURL : <%= request.getRequestURL()%> <br/>
    getRequestURI : <%= request.getRequestURI()%> <br/>
    getQueryString : <%= request.getQueryString()%> <br/>
    getRemoteAddress : <%= request.getRemoteAddr()%>
</body>
</html>
