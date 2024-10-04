<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Page</title>
    <!-- Include Bootstrap CSS from CDN -->

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>

   <section class="form-background">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Contact US</h2>
        <p> For Further Deatils call to us on 123445667 and email address is krish@outlook.com</p>
        <p> Please fill the form we will get back to you. Have a great day.</p>
        <form:form method="POST" action="/showContactForm" modelAttribute="contactDTO" class="border p-4 bg-light rounded">
            <div class="form-group row">
                <label for="firstName" class="col-sm-4 col-form-label">Enter Your First Name:</label>
                <div class="col-sm-8">
                    <form:input path="firstName" id="firstName" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="lastName" class="col-sm-4 col-form-label">Enter your Last Name:</label>
                <div class="col-sm-8">
                    <form:input path="lastName" id="lastName" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-4 col-form-label">Enter your Email Id:</label>
                <div class="col-sm-8">
                    <form:input path="email" id="email" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="phoneNumber" class="col-sm-4 col-form-label">Please Enter your Contact Number:</label>
                <div class="col-sm-8">
                    <form:input path="phoneNumber" id="phoneNumber" class="form-control" />
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
