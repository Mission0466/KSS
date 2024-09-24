<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Details Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/js/productsPage.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
        var contextPath = "${pageContext.request.contextPath}";
    </script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/productsPageStyle.css" />

   <link>
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Coffee Details Form</h2>

    <!-- Select Weight -->
    <div class="form-group row">
        <label for="weight" class="col-sm-4 col-form-label">Select Weight:</label>
        <div class="col-sm-8">
            <select id="weight" class="form-control">
                <option value="">Select Weight</option>
                <c:forEach var="weight" items="${weights}">
                    <option value="${weight}">${weight}g</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <!-- Select Coffee Ratio -->
    <div class="form-group row">
        <label for="coffeeRatio" class="col-sm-4 col-form-label">Select Coffee Ratio:</label>
        <div class="col-sm-8">
            <select id="coffeeRatio" class="form-control">
                <option value="">Select Coffee Ratio</option>
                <c:forEach var="ratio" items="${coffeeRatios}">
                    <option value="${ratio}">${ratio}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <!-- Select Chicory Ratio -->
    <div class="form-group row">
        <label for="chicoryRatio" class="col-sm-4 col-form-label">Select Chicory Ratio:</label>
        <div class="col-sm-8">
            <select id="chicoryRatio" class="form-control">
                <option value="">Select Chicory Ratio</option>
                <c:forEach var="ratio" items="${chicoryRatios}">
                    <option value="${ratio}">${ratio}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <!-- Add to Cart Button -->
    <div class="form-group row">
        <div class="col-sm-12 text-center">
            <button id="addToCart" class="btn btn-primary">Add to Cart</button>
        </div>
    </div>

    <!-- Display selected items -->
    <h3 class="mt-4">Your Selected Items</h3>
    <ul id="selectedItemsList"></ul>

    <!-- Submit the order button -->
    <div class="form-group row">
        <div class="col-sm-12 text-center">
            <button id="submitOrder" class="btn btn-success">Submit Order</button>
        </div>
    </div>
     <div id="priceDisplay" class="mt-4 text-center" style="font-size: 1.2em; color: green;"></div>
     <!-- Order Now Button (Initially hidden) -->
         <div id="orderNowSection" class="mt-4 text-center" style="display: none;">
             <button id="orderNow" class="btn btn-warning">Order Now</button>
         </div>
</div>

</body>
</html>
