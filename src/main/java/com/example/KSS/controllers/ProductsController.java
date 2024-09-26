package com.example.KSS.controllers;

import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.dtos.ProductDTO;

import com.example.KSS.services.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductsController {

    private ProductsService productsService;

    public ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }

    // this method helps to get the drop down values (coffeeratio, weights and chicory) from DB
    @GetMapping("/Products")
    public String showCoffeeForm(Model model) {
        ProductDTO productDTO = new ProductDTO();
        model.addAttribute("productDTO", productDTO);

        // Fetch unique values for each column from the database
        List<String> weights = productsService.getUniqueWeights();
        List<String> coffeeRatios = productsService.getUniqueCoffeeRatios();
        List<String> chicoryRatios = productsService.getUniqueChicoryRatios();

        model.addAttribute("weights", weights);
        model.addAttribute("coffeeRatios", coffeeRatios);
        model.addAttribute("chicoryRatios", chicoryRatios);

        return "productsPage"; // The name of your JSP file
    }

//    @PostMapping("/submitProductDetails")
//    public String submitCoffeeDetails(@ModelAttribute("coffeeTableDTO") CoffeeTableDTO coffeeTableDTO, Model model) {
//        // Retrieve the price based on the selected values
//        int price = productsService.getPrice(coffeeTableDTO.getWeight(), coffeeTableDTO.getCoffeeRatio(), coffeeTableDTO.getChicoryRatio());
//
//        // Pass the price to the model to display on the JSP
//        model.addAttribute("price", price);
//        return "showPrice"; // Create a new JSP to display the price
//    }

    @PostMapping("/submitProductDetails")
    @ResponseBody
    public Map<String, Object> submitOrder(@RequestBody List<CoffeeTableDTO> selectedItems){
        // Create a response map to send back as JSON
        Map<String, Object> response = new HashMap<>();
        double totalPrice = 0;

        //calculate the totalPrice based on the selected Items
        for(int i=0; i<selectedItems.size(); i++){
            CoffeeTableDTO item = selectedItems.get(i);
            int price = productsService.getPrice(item.getWeight(), item.getCoffeeRatio(), item.getChicoryRatio());
            response.put("weight", item.getWeight());
            response.put("coffeeRatio", item.getCoffeeRatio());
            response.put("chicoryRatio", item.getChicoryRatio());
            totalPrice += price;
        }
        response.put("totalPrice", totalPrice);

        return response;
    }

    @GetMapping("/showPrice")
    public String showPrice(){
        return "showPrice";
    }

    @GetMapping("/addressForm")
    public String showAddressForm(){
        return "addressForm";
    }


}
