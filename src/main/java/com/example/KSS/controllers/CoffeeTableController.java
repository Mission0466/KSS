package com.example.KSS.controllers;


import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.models.CoffeeTable;
import com.example.KSS.services.CoffeePowderRegistrationService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;


@Controller
public class CoffeeTableController {

    private CoffeePowderRegistrationService coffeePowderRegistrationService;

    public CoffeeTableController(CoffeePowderRegistrationService coffeePowderRegistrationService){
        this.coffeePowderRegistrationService = coffeePowderRegistrationService;
    }

    @GetMapping("/coffeepowderform")
    public String showCoffeeRegForm(Model model) {
        model.addAttribute("coffeeTableDTO", new CoffeeTableDTO());
        return "coffeepowderform";
    }

    @PostMapping("/submitCoffeeDetails")
    public String submitCoffeeDetails(@ModelAttribute CoffeeTableDTO coffeeTableDTO) {

        coffeePowderRegistrationService.saveCoffee(coffeeTableDTO.getWeight(),
                                                coffeeTableDTO.getCoffeeRatio(),
                                                coffeeTableDTO.getChicoryRatio(),
                                                coffeeTableDTO.getPrice()
                );
        return "redirect:/coffeepowderform";
    }

    @GetMapping("/coffeeProducts")
    public String showCoffeeProducts(Model model) {
        List<CoffeeTable> coffeeTableList = coffeePowderRegistrationService.getAllCoffeeProducts(); // Assume this method fetches data
        if (coffeeTableList == null || coffeeTableList.isEmpty()) {
            System.out.println("No coffee products found.");
        } else {
            System.out.println("Number of coffee products found: " + coffeeTableList.size());
        }

        model.addAttribute("coffeeTableList", coffeeTableList);
        return "productsPage"; // Resolves to /WEB-INF/views/coffeeProducts.jsp
    }

}
