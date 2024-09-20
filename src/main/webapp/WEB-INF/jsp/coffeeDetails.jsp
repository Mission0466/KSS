<%@ taglib uri="http://xmlns.jcp.org/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Coffee Products</title>
    <style>
        table {
            width: 100%; /* Full-width table */
            border-collapse: collapse; /* Optional: removes the double border */
        }
        th, td {
            padding: 15px; /* Uniform padding in all table cells */
            text-align: left; /* Optional: align text to the left */
            border-bottom: 1px solid #ddd; /* Optional: adds a light line between rows */
        }
    </style>
</head>
<body>

<h2>List of Coffee Products</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Weight</th>
        <th>Coffee Ratio</th>
        <th>Chicory Ratio</th>
        <th>Price</th>
    </tr>
    <c:forEach var="coffee" items="${coffeeTable}">
        <tr>
            <td>${coffee.id}</td>
            <td>${coffee.name}</td>
            <td>${coffee.weight}</td>
            <td>${coffee.coffeeRatio}</td>
            <td>${coffee.chicoryRatio}</td>
            <td>${coffee.price}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
