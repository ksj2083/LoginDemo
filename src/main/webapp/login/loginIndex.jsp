<%--
  Created by IntelliJ IDEA.
  User: ksj20
  Date: 2023-05-04
  Time: 오후 5:11
  To change this template use File | Settings | File Templates.
--%>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/Login.do?cmd=login" method="post">
<input type="text" name="userId" placeholder="아이디">
<input type="text" name="userPw" placeholder="비번">
<input type="submit" id="btn1" value="로그인">
</form>

</body>
</html>
