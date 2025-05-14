<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DUONG
  Date: 14/05/2025
  Time: 5:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách sản phẩm</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
        }
        .container {
            background-color: white;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f8f9fa;
            font-weight: bold;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        .total-value {
            font-weight: bold;
            text-align: right;
            margin-top: 20px;
            font-size: 18px;
        }
        .product-link {
            color: #007bff;
            text-decoration: none;
        }
        .product-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Danh sách sản phẩm</h1>

    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Tên sản phẩm</th>
            <th>Mô tả</th>
            <th>Giá</th>
            <th>Số lượng</th>
            <th>Trạng thái</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.product_id}</td>
                <td>${product.product_name}</td>
                <td>${product.product_description}</td>
                <td>${product.product_price} $</td>
                <td>${product.product_quantity}</td>
                <td>${product.product_status ? 'Đang hoạt động' : 'Ngưng hoạt động'}</td>            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
