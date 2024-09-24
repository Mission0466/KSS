document.addEventListener("DOMContentLoaded", function () {
    // Retrieve order details from sessionStorage
    const orderDetails = JSON.parse(sessionStorage.getItem("orderDetails"));
    const totalPrice = JSON.parse(sessionStorage.getItem("totalPrice"));

    // Attach the total price to the orderDetails object
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
    $('#submitBtn').click(function(event) {
        event.preventDefault(); // Prevent the default form submission

        // Gather user details
        const userDetails = {
            name: $('#customerName').val(),
            address: $('#address').val(),
            phoneNumber: $('#phoneNumber').val()
        };

        // Create the complete order object
        const orderDetails = JSON.parse(sessionStorage.getItem("orderDetails"));
        const totalPrice = JSON.parse(sessionStorage.getItem("totalPrice"));

        const orderData = {
            user: userDetails,
            orderItems: orderDetails,
            totalPrice: totalPrice,
            orderDate: new Date()
        };

        // Make an AJAX call to submit the data to the server
        $.ajax({
            url: contextPath + "/submitOrderDetails",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(orderData), // Send the complete order data
            success: function(response) {
                alert("Order submitted successfully! Total Price: " + response.totalPrice);
                console.log(response);

                // Clear sessionStorage after successful submission
                sessionStorage.removeItem("orderDetails");
                sessionStorage.removeItem("totalPrice");

                window.location.href = contextPath + "/orderConfirmation";
            },
            error: function(error) {
                alert("Error submitting order. Please try again.");
                console.error(error);
            }
        });
    });

});
