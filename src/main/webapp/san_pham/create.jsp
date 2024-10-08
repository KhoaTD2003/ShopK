<%@page pageEncoding="UTF-8" language="java" %>

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

<form method="POST" action="/san-pham/store">
    <div>
        <label>Mã</label>
        <input type="text" name="ma" value="${data.maSP}"/>
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${data.ten}"/>
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${data.mota}"/>
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${data.them}"/>
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" value="${data.capnhat}"/>
    </div>
    <div>
        <button>Lưu</button>
    </div>
</form>

</body>
</html>