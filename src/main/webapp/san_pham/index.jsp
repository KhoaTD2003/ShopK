<%@page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Quản lý sản phẩm</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Mô tả</th>
        <th>Thêm</th>
        <th>Cập nhật</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data.content }" var="sp">
        <tr>
            <td>${ sp.id }</td>
            <td>${ sp.maSP }</td>
            <td>${ sp.ten }</td>
            <td>${ sp.mota }</td>
            <td>${ sp.them }</td>
            <td>${ sp.capnhat }</td>
            <td>
                <a href="/san-pham/edit/${ sp.id }">Update</a>
            </td>
            <td><a href="/san-pham/delete/${ sp.id }">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
