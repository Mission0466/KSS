document.addEventListener("DOMContentLoaded", function() {
    let selectedItems = [];

    const addToCart = document.getElementById('addToCart');
    const submitOrder = document.getElementById('submitOrder');

    // Event listener for the "Add to Cart" button
    addToCart.addEventListener("click", function() {
        const weight = $('#weight').val();
        const coffeeRatio = $('#coffeeRatio').val();
        const chicoryRatio = $('#chicoryRatio').val();



        if(weight && coffeeRatio && chicoryRatio){
            const selectedItem = {
                weight: weight,
                coffeeRatio: coffeeRatio,
                chicoryRatio: chicoryRatio
            };

            selectedItems.push(selectedItem);
            console.log(selectedItems.length);
            $("#selectedItemsList").append(
                `<li>Weight: ${weight}, Coffee Ratio: ${coffeeRatio}%, Chicory Ratio: ${chicoryRatio}% </li>`
            );


            // Reset the form fields
            $("#weight").val("");
            $("#coffeeRatio").val("");
            $("#chicoryRatio").val("");
        } else {
            alert("Please select all fields before adding to the cart.");
        }
    });

    // Event listener for the "Submit Order" button
    submitOrder.addEventListener("click", function() {
        if (selectedItems.length === 0) {
            alert("Please add items to the cart before submitting.");
            return;
        }

        // Make an AJAX call to send the JSON data to the server
        $.ajax({
            url: `${contextPath}/submitProductDetails`,
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(selectedItems),
            success: function(response) {
                alert("Order submitted successfully! Total Price: " + response.totalPrice);
               // Display the total price in a div on the current page
               $("#priceDisplay").html(`The total price for the selected options is: <strong>${response.totalPrice}</strong>`);
            console.log(response);
            $("#orderNowSection").show();

             sessionStorage.setItem("totalPrice", response.totalPrice);

            },

            error: function(error) {
                alert("Avaliable items are 90% coffee with 10% chicory, 80% coffee with 20% chicory and 100% coffee with 0 chicory. Please try again with right ratios");
            }
        });


    });
    document.getElementById('orderNow').addEventListener("click", function() {
        // Convert selected items to a JSON string
        const orderDetails = JSON.stringify(selectedItems);



        // Store the order details in sessionStorage (to pass them to the next page)
        sessionStorage.setItem("orderDetails", orderDetails);

        // Redirect to the address form page
        window.location.href = `${contextPath}/addressForm`;
    });
});
