<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coffee Details Registration Form</title>
    <!-- Include Bootstrap CSS from CDN -->

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
   <section class="form-background">

    <div class="container mt-5">
        <h2 class="text-center mb-4">Coffee Details Registration Form</h2>
        <form:form method="POST" action="/submitCoffeeDetails" modelAttribute="coffeeTableDTO" class="border p-4 bg-light rounded">
            <div class="form-group row">
                <label for="weight" class="col-sm-4 col-form-label">Enter the weight of the Coffee Powder Packet:</label>
                <div class="col-sm-8">
                    <form:input path="weight" id="weight" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="coffeeRatio" class="col-sm-4 col-form-label">Enter the preferred Coffee Ratio:</label>
                <div class="col-sm-8">
                    <form:input path="coffeeRatio" id="coffeeRatio" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="chicoryRatio" class="col-sm-4 col-form-label">Enter the preferred Chicory Ratio:</label>
                <div class="col-sm-8">
                    <form:input path="chicoryRatio" id="chicoryRatio" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="price" class="col-sm-4 col-form-label">Enter the price you want to show:</label>
                <div class="col-sm-8">
                    <form:input path="price" id="price" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12 text-center">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form:form>
    </div>
    </section>

    <!-- Include Bootstrap JS and dependencies (Optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
