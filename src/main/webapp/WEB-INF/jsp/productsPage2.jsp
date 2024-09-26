<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Coffee Details Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Coffee Details Form</h2>
        <form:form method="POST" action="/submitProductDetails" modelAttribute="productDTO" class="border p-4 bg-light rounded">
        <div class="form-group row">
            <label for="weight" class="col-sm-4 col-form-label">Select Weight:</label>
            <div class="col-sm-8">
                <form:select path="weight" id="weight" class="form-control">
                    <form:option value="" label="Select Weight" />
                    <form:options items="${weights}" />
                </form:select>
            </div>
        </div>
        <div class="form-group row">
            <label for="coffeeRatio" class="col-sm-4 col-form-label">Select Coffee Ratio:</label>
            <div class="col-sm-8">
                <form:select path="coffeeRatio" id="coffeeRatio" class="form-control">
                    <form:option value="" label="Select Coffee Ratio" />
                    <form:options items="${coffeeRatios}" />
                </form:select>
            </div>
        </div>
        <div class="form-group row">
            <label for="chicoryRatio" class="col-sm-4 col-form-label">Select Chicory Ratio:</label>
            <div class="col-sm-8">
                <form:select path="chicoryRatio" id="chicoryRatio" class="form-control">
                    <form:option value="" label="Select Chicory Ratio" />
                    <form:options items="${chicoryRatios}" />
                </form:select>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-12 text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </form:form>
</div>
</body>
</html>
