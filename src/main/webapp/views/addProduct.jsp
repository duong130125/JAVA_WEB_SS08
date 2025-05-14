<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm mới sản phẩm</title>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="number"],
        textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        textarea {
            height: 100px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Thêm mới sản phẩm</h2>
    <form action="product-save" method="post" accept-charset="UTF-8">
        <div class="form-group">
            <label for="product_name">Product Name:</label>
            <input type="text" id="product_name" name="product_name" required>
        </div>

        <div class="form-group">
            <label for="product_description">Description:</label>
            <textarea id="product_description" name="product_description" required></textarea>
        </div>

        <div class="form-group">
            <label for="product_price">Price ($):</label>
            <input type="number" id="product_price" name="product_price" step="0.01" min="0" required>
        </div>

        <div class="form-group">
            <label for="product_quantity">Quantity:</label>
            <input type="number" id="product_quantity" name="product_quantity" min="0" required>
        </div>

        <button type="submit">Thêm mới</button>
    </form>
</div>
</body>
</html>