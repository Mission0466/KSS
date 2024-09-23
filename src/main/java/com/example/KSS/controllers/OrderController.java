package com.example.KSS.controllers;

import com.example.KSS.dtos.CoffeeTableDTO;
import com.example.KSS.dtos.OrderDTO;
import com.example.KSS.models.User;
import com.example.KSS.services.OrderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {

    private  OrderService orderService;

    @Autowired
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
}
