document.addEventListener("DOMContentLoaded", function() {
   const orderDetails = JSON.parse(sessionStorage.getItem("orderDetails"));
   const totalPrice  = JSON.parse(sessionStorage.getItem("totalPrice"));
   orderDetails.totalPrice = totalPrice;
    console.log(orderDetails);
       // Display the order details in the list
       if (orderDetails) {
           orderDetails.forEach(item => {
               $('#orderDetailsList').append(
                   `<li>Weight: ${item.weight}g, Coffee Ratio: ${item.coffeeRatio}%, Chicory Ratio: ${item.chicoryRatio}%</li>`
               );
           });
       }
    // Listen for form submission
        $('#addressForm').submit(function(event) {
            event.preventDefault(); // Prevent the default form submission

            // Gather user details
            const userDetails = {
                name: $('#customerName').val(),
                address: $('#address').val(),
                phoneNumber: $('#phoneNumber').val(),
                orderDetails: orderDetails,  // Add the order details along with user details
            };


     $.ajax({
                url: `${contextPath}/submitOrderDetails`,
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(orderDetails),
                success: function(response) {
                    alert("Order submitted successfully and will be delivered soon. Thank you for Shopping with us ! Total Price : " + response.totalPrice);
                console.log(response);
                  window.location.href = `${contextPath}/orderConfirmation`;

                },
                error: function(error) {
                    alert("Error submitting order. Please try again.");
                }
            });






});
