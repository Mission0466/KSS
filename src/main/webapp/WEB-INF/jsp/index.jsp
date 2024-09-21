<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>KS Coffee Shop</title>

  <!-- Include Bootstrap from CDN -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

  <!-- Link to custom stylesheets -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />

</head>
<body>
  <!-- Header Section -->
  <header>
    <div class="logo">
      <!-- Dynamic path for logo -->
      <img src="${pageContext.request.contextPath}/images/ks-logo.png" alt="KS Coffee Shop Logo">
    </div>
    <nav>
      <ul>
        <li><a href="${pageContext.request.contextPath}/#home">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/#menu">Menu</a></li>
        <li><a href="${pageContext.request.contextPath}/#about">About Us</a></li>
        <li><a href="${pageContext.request.contextPath}/#contact">Contact</a></li>
      </ul>
    </nav>
  </header>

  <!-- Hero Section -->
  <section id="hero">
    <div class="hero-content">
      <div class="typing">
        <h2>Experience the Premium Coffee in Hyderabad</h2>
      </div>
      <div>
    <a href="${pageContext.request.contextPath}/Products" class="btn btn-primary">Order Now</a>


      </div>
    </div>
  </section>

 <!-- Menu Section -->
<section>
  <div class="menu-bottom-section">
    <div class="d-flex flex-row justify-content-center">
      <!-- Using dynamic paths for images -->
      <div class="menu-card-item">
        <img src="${pageContext.request.contextPath}/images/coffee-powder.jpg" alt="coffee powder" class="coffee-menu-card-image"/>
        <h1 class="menu-card-name"> Coffee Powder</h1>
        <p class="menu-card-price">500 rs</p>
        <a href="${pageContext.request.contextPath}/Products" class="btn btn-primary">Buy Now</a>
      </div>

      <div class="menu-card-item">
        <img src="${pageContext.request.contextPath}/images/coffee-powder.jpg" alt="coffee powder" class="coffee-menu-card-image"/>
        <h1 class="menu-card-name"> Coffee Powder</h1>
        <p class="menu-card-price">500 rs</p>
        <a href="${pageContext.request.contextPath}/Products" class="btn btn-primary">Buy Now</a>
      </div>
    </div>

    <div class="d-flex flex-row justify-content-center">
      <div class="menu-card-item">
        <img src="${pageContext.request.contextPath}/images/coffee-powder.jpg" alt="coffee powder" class="coffee-menu-card-image"/>
        <h1 class="menu-card-name"> Coffee Powder</h1>
        <p class="menu-card-price">500 rs</p>
      <a href="${pageContext.request.contextPath}/Products" class="btn btn-primary">Buy Now</a>
      </div>

      <div class="menu-card-item">
        <img src="${pageContext.request.contextPath}/images/coffee-powder.jpg" alt="coffee powder" class="coffee-menu-card-image"/>
        <h1 class="menu-card-name"> Coffee Powder</h1>
        <p class="menu-card-price">500 rs</p>
        <a href="${pageContext.request.contextPath}/Products" class="btn btn-primary">Buy Now</a>
      </div>
    </div>
  </div>
</section>

  <!-- Footer -->
  <footer>
    <p>Follow Us on Social Media</p>
    <ul>
      <li><a href="#">Facebook</a></li>
      <li><a href="#">Instagram</a></li>
      <li><a href="#">Twitter</a></li>
    </ul>
  </footer>
</body>
</html>
