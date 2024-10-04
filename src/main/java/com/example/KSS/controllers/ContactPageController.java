package com.example.KSS.controllers;

import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.dtos.ContactDTO;
import com.example.KSS.services.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactPageController {

    private ContactService contactService;

    public ContactPageController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/showContactForm")
    public String showContactForm(Model model){
        model.addAttribute("contactDTO", new ContactDTO());
        return "contactForm";
    }

    @PostMapping("/submitContactForm")
    public String submitCoffeeDetails(@ModelAttribute ContactDTO contactDTO) {

        contactService.contactCustomerDetails(
                contactDTO.getFirstName(),
                contactDTO.getLastName(),
                contactDTO.getEmail(),
                contactDTO.getPhoneNumber()
        );
        return "redirect:/coffeepowderform";
    }
}
