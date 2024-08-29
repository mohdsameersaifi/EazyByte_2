package com.inventory.controller;

import com.inventory.entity.Order;
import com.inventory.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public List<Order> generateReport(@RequestParam String type, @RequestParam String startDate, @RequestParam String endDate) {
        return reportService.generateReport(type, startDate, endDate);
    }
}
