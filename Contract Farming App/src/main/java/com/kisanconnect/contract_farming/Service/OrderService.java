package com.kisanconnect.contract_farming.Service;

import com.kisanconnect.contract_farming.DTO.OrderRequest;
import com.kisanconnect.contract_farming.Entity.Order;
import com.kisanconnect.contract_farming.Repository.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getOrderById(String orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Order not found with id: " + orderId));
    }

    public List<Order> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        if (orders.isEmpty()) {
            return new ArrayList<>();
        }
        return orders;
    }

    public List<Order> getAllOrdersByUser(String userId) {
        List<Order> orders = orderRepository.findOrdersByUser(userId);
        if (orders.isEmpty()) {
            return new ArrayList<>();
        }
        return orders;
    }

    public Order createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setFarmerAddress(orderRequest.getFarmerAddress());
        order.setBuyerAddress(orderRequest.getBuyerAddress());
        order.setCurrency("INR");
        order.setStatus("created");
        order.setCreatedDate(LocalDate.now());
        order.setCreatedTime(LocalTime.now());
        order.setListingId(orderRequest.getListingId());
        order.setAmount(orderRequest.getAmount());
        order.setQuantity(Long.parseLong(orderRequest.getQuantity()));

        return orderRepository.save(order);
    }
}
