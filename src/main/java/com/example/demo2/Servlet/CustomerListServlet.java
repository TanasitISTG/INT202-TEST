package com.example.demo2.Servlet;

import com.example.demo2.Entities.Customer;
import com.example.demo2.Repositories.CustomerRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerListServlet", value = "/034/customer-list")
public class CustomerListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerRepository customerRepository = new CustomerRepository();
        List<Customer> customers = customerRepository.findAll();
        request.setAttribute("customers", customers);
        getServletContext().getRequestDispatcher("/customer-list.jsp").forward(request, response);
    }
}
