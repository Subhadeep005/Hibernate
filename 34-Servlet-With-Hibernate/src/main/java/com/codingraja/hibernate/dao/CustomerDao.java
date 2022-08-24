package com.codingraja.hibernate.dao;

import java.util.List;

import com.codingraja.hibernate.domain.Customer;

public interface CustomerDao {
	Long saveCustomer(Customer customer);
	void deleteCustomerById(Long id);
	void updateCustomer(Customer customer);
	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
}
