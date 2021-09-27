<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/27/2021
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <h2>Currency Converter</h2>
    <form action="/convert" method="get">
        <p>Rate : <input type="text" name="rate" placeholder="rate" value="22000"></p>
        <p>USD : <input type="text" name="usd" placeholder="usd" value="0"></p>
        <input type="submit" value="Converter">
    </form>
</body>
</html>
