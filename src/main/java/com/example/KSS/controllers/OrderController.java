package com.example.KSS.controllers;


import com.example.KSS.dtos.OrderDTO;
import com.example.KSS.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController {

    private  OrderService orderService;

    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/submitOrderDetails")
    @ResponseBody
    public Map<String, Object> submitOrderDetails(@RequestBody OrderDTO orderDTO) {
        // Save the order details using the service
        orderService.saveOrderDetails(orderDTO);

        // Create a response map
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("totalPrice", orderDTO.getTotalPrice());

        return response;

    }

    @GetMapping("/orderConfirmation")
    public String orderConfirmation(){
        return "OrderConfirmationPage";
    }
}
