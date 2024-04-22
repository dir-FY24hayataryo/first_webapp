<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="WEB-INF/app.jsp">
    <c:param name="title">インポートのテスト B</c:param>
    <c:param name="content">
        <h1>こんばんは！</h1>
        <p>明日も晴れるといいですね。</p>
    </c:param>
</c:import>