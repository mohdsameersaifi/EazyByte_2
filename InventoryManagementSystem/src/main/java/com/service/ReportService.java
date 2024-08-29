package com.inventory.service;

import com.inventory.entity.Order;
import com.inventory.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> generateReport(String type, String startDate, String endDate) {
        // Dummy implementation for report generation
        List<Order> allOrders = orderRepository.findAll();
        return allOrders.stream().filter(order -> 
                order.getOrderDate().after(startDate) && order.getOrderDate().before(endDate)
        ).collect(Collectors.toList());
    }
}
