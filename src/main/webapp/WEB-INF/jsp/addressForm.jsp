<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Address Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   <script src="${pageContext.request.contextPath}/js/addressForm.js"></script>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
       <script>
           var contextPath = "${pageContext.request.contextPath}";
       </script>
         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addressFomStyle.css" />
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Address Form</h2>

    <!-- Display Order Details -->
    <h3>Your Order Details:</h3>
    <ul id="orderDetailsList"></ul>

    <!-- User Address Form -->

        <div class="form-group">
            <label for="customerName">Name:</label>
            <input type="text" id="customerName" name="customerName" class="form-control" required />
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <textarea id="address" name="address" class="form-control" required></textarea>
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone Number:</label>
            <input type="text" id="phoneNumber" name="phoneNumber" class="form-control" required />
        </div>
        <div class="form-group text-center">
            <button id="submitBtn"type="submit" class="btn btn-success">Submit Order</button>
        </div>

</div>


</body>
</html>
