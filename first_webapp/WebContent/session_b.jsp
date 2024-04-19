<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% String username=(String)request.getSession().getAttribute("username");%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="ISO-8859-1">
        <title>セッションスコープのテスト</title>
    </head>
    <body>
        <h1>こんにちは、<%=username %>さん！</h1>
        <p><a href="session_c.jsp">次のページへ</a></p>
    </body>
</html>