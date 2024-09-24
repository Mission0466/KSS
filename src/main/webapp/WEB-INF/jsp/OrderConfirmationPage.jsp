<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Confirmation Page</title>

    <!-- Include Bootstrap from CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

</head>
<body class="bg-light">
    <div class="container mt-5">
        <!-- Order Confirmation Card -->
        <div class="card shadow-sm">
            <div class="card-body text-center">
                <h1 class="card-title text-success">Order Placed Successfully!</h1>
                <p class="card-text lead mt-3">Your order has been placed and will be delivered soon.</p>
                <p class="card-text">Thank you for shopping with us!</p>
            </div>
        </div>
    </div>

    <!-- Optional custom styling -->
    <style>
        body {
            background-color: #f8f9fa; /* Light gray background */
        }
        .card {
            max-width: 600px;
            margin: 0 auto; /* Center the card */
            border-radius: 10px;
            padding: 20px;
        }
    </style>
</body>
</html>
