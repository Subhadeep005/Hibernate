package com.codingraja.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingraja.hibernate.dao.CustomerDao;
import com.codingraja.hibernate.dao.impl.CustomerDaoImpl;
import com.codingraja.hibernate.domain.Customer;

@WebServlet("/customer/update")
public class UpdateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateCustomerController() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String custId = request.getParameter("custId");
			if(custId == "" || custId == null)
				request.getRequestDispatcher("/").forward(request, response); 
			else{
				Long id = Long.parseLong(custId);
				CustomerDao customerDao = new CustomerDaoImpl();
				Customer customer = customerDao.findCustomerById(id);
				customerDao.updateCustomer(customer);
				request.setAttribute("customer", customer);
				request.getRequestDispatcher("/").forward(request, response);
			}
	}
}
