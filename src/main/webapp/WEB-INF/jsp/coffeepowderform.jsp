<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Coffee Details Registration Form</title>
</head>
<body>
    <h2>Employee Registration</h2>
    <form:form method="POST" action="/submitCoffeeDetails" modelAttribute="coffeeTableDTO">
        <table>
            <tr>
                <td>Enter the weight of the Coffee Powder Packet: </td>
                <td><form:input path="weight" /></td>
            </tr>
            <tr>
                <td>Enter the preffered Coffee Ratio:</td>
                <td><form:input path="coffeeRatio" /></td>
            </tr>
            <tr>
                <td>Enter the preffered Chicory Ratio:</td>
                <td><form:input path="chicoryRatio" /></td>
            </tr>
            <tr>
                <td>Enter the price you want to show :</td>
                <td><form:input path="price" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
