package com.example.KSS.services;

import com.example.KSS.dtos.OrderDTO;
import com.example.KSS.dtos.OrderItemDTO;
import com.example.KSS.dtos.UserDTO;
import com.example.KSS.models.Order;
import com.example.KSS.models.OrderItem;
import com.example.KSS.models.User;
import com.example.KSS.repositories.OrderRepository;
import com.example.KSS.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

@Service
public class OrderService {

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    public void saveOrderDetails(OrderDTO orderDTO) {
        // Convert UserDTO to User entity
        User user = new User();
        user.setName(orderDTO.getUser().getName());
        user.setPhoneNumber(orderDTO.getUser().getPhoneNumber());
        user.setAddress(orderDTO.getUser().getAddress());

        // Save the user entity to the database
        User savedUser = userRepository.save(user);

        // Create an Order entity
        Order order = new Order();
        order.setUser(savedUser);
        order.setTotalPrice(orderDTO.getTotalPrice());
        order.setOrderDate(LocalDateTime.now());

        // Convert OrderItemDTOs to OrderItem entities
        List<OrderItem> orderItems = orderDTO.getOrderItems().stream().map(itemDTO -> {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            orderItem.setWeight(itemDTO.getWeight());
            orderItem.setCoffeeRatio(itemDTO.getCoffeeRatio());
            orderItem.setChicoryRatio(itemDTO.getChicoryRatio());
            return orderItem;
        }).collect(Collectors.toList());

        order.setOrderItems(orderItems);

        // Save the complete order with items
        orderRepository.save(order);
    }


    public List<OrderDTO> getAllOrders(){
        List<Order> orders = orderRepository.findAll();
        List<OrderDTO> orderDTOs = new ArrayList<>();

        // Traditional for loop to map Order to OrderDTO
        for (Order order : orders) {
            OrderDTO orderDTO = new OrderDTO();
            UserDTO userDTO = new UserDTO();

            // Map User to UserDTO
            userDTO.setName(order.getUser().getName());
            userDTO.setAddress(order.getUser().getAddress());
            userDTO.setPhoneNumber(order.getUser().getPhoneNumber());

            // Set the order details
            orderDTO.setUser(userDTO);
            orderDTO.setTotalPrice(order.getTotalPrice());
            orderDTO.setOrderDate(order.getOrderDate());

            // Map OrderItems to OrderItemDTO
            List<OrderItemDTO> orderItemDTOs = new ArrayList<>();
            for (OrderItem orderItem : order.getOrderItems()) {
                OrderItemDTO orderItemDTO = new OrderItemDTO();
                //orderItemDTO.setOrderId(order.getOrderId()); // Set the order ID
                orderItemDTO.setWeight(orderItem.getWeight());
                orderItemDTO.setCoffeeRatio(orderItem.getCoffeeRatio());
                orderItemDTO.setChicoryRatio(orderItem.getChicoryRatio());
                orderItemDTOs.add(orderItemDTO);
            }
            orderDTO.setOrderItems(orderItemDTOs); // Set the order items

            // Add the mapped DTO to the list
            orderDTOs.add(orderDTO);
        }

        return orderDTOs;
    }
}

