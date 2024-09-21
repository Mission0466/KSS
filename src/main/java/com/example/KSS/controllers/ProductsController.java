package com.example.KSS.controllers;

import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.dtos.ProductDTO;
import com.example.KSS.models.CoffeeTable;

import com.example.KSS.services.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductsController {

    private ProductsService productsService;

    public ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }

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

    @PostMapping("/submitProductDetails")
    public String submitCoffeeDetails(@ModelAttribute("coffeeTableDTO") CoffeeTableDTO coffeeTableDTO, Model model) {
        // Retrieve the price based on the selected values
        int price = productsService.getPrice(coffeeTableDTO.getWeight(), coffeeTableDTO.getCoffeeRatio(), coffeeTableDTO.getChicoryRatio());

        // Pass the price to the model to display on the JSP
        model.addAttribute("price", price);
        return "showPrice"; // Create a new JSP to display the price
    }

}
