package ru.creditManager.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.creditManager.web.dtos.CustomerDto;
import ru.creditManager.web.models.customer.Customer;
import ru.creditManager.web.services.customer.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String getCustomersPage(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(CustomerDto customerDto){
        customerService.addCustomer(customerDto);
        return "redirect:/customers";
    }
}
