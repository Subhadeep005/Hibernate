package com.codingraja.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingraja.hibernate.dao.CustomerDao;
import com.codingraja.hibernate.dao.impl.CustomerDaoImpl;
import com.codingraja.hibernate.domain.Customer;

@WebServlet("/customer/register")
public class CustomerRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CustomerRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String custId = request.getParameter("id");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String mob = request.getParameter("mobile");
		Long mobile = Long.parseLong(mob);
		
		Customer customer = new Customer(firstName, lastName, email, mobile);
		
		CustomerDao customerDao  = new CustomerDaoImpl();
		
		request.getRequestDispatcher("/").forward(request, response);
		if(custId==null || custId==""){
			customerDao.saveCustomer(customer);
			request.getRequestDispatcher("/").forward(request, response);
		//response.sendRedirect(request.getContextPath()+"/");
	}
		else{
			Long id = Long.parseLong(custId);
			customer.setId(id);
			customerDao.updateCustomer(customer);
			//response.sendRedirect(request.getContextPath()+"/");
		}
		//request.getRequestDispatcher("/").forward(request, response);
		//response.sendRedirect(request.getContextPath()+"/");
	}

}
