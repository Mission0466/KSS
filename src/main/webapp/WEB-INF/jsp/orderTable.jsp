<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order List</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- JQuery DataTable CSS -->
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center">Order Details</h2>
    <table id="orderTable" class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>User Name</th>
                <th>Address</th>
                <th>Phone Number</th>
                <th>Total Price</th>

                <th>Order Items</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="order" items="${orders}">
                <tr>
                    <td>${order.user.name}</td>
                    <td>${order.user.address}</td>
                    <td>${order.user.phoneNumber}</td>
                    <td>${order.totalPrice}</td>

                   <td>
                        <ul>
                                <c:forEach var="item" items="${order.orderItems}">
                                <li>Weight: ${item.weight}, Coffee Ratio: ${item.coffeeRatio}%, Chicory Ratio: ${item.chicoryRatio}%</li>
                                </c:forEach>
                        </ul>
                   </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<!-- JQuery and Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>

<!-- JQuery DataTable JS -->
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('#orderTable').DataTable();
    });
</script>
</body>
</html>
