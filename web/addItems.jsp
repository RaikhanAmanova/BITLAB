<%--
  Created by IntelliJ IDEA.
  User: Райхан
  Date: 06.02.2024
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</head>
<body>
<div class ="container">
    <%@include file="navbar.jsp"%>
    <br><br>
    <form action="/addItem" method="post" style="margin-left:100px">
        <label for="idField">
            ID:
            <input name = "id" class="form-control" type="number" id = "idField">
        </label><br><br>

        <label for="nameField">
            NAME:
            <input name = "name" class="form-control" type="text" id = "nameField">
        </label><br><br>
        <label for="priceField">
            PRICE:
            <input name = "price" class="form-control" type="number" id = "priceField">
        </label><br><br>
        <label for="amountField">
            AMOUNT:
            <input name = "amount" class="form-control" type="number" id = "amountField">
        </label><br><br>
        <button type="submit" style="background-color:seagreen">
            ADD ITEM
        </button>
    </form>
</div>

</body>
</html>
