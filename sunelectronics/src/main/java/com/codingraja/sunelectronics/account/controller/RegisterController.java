package com.codingraja.sunelectronics.account.controller;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.core.domain.User;
import com.codingraja.sunelectronics.core.domain.UserRole;
import com.codingraja.sunelectronics.core.service.CustomerService;
import com.codingraja.sunelectronics.core.service.UserService;
import com.codingraja.sunelectronics.core.web.dto.CustomerDto;
import com.codingraja.sunelectronics.security.service.LoginService;

@Controller
public class RegisterController {
	private static final String REGISTRATION_PAGE = "account/register";

	@Autowired
	private CustomerService customerService;
	@Autowired
	private UserService userService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@GetMapping("/register")
	public ModelAndView registrationPage() {
		return new ModelAndView(REGISTRATION_PAGE, "customerDto", new CustomerDto());
	}

	@PostMapping("/register")
	public ModelAndView processRegistration(@ModelAttribute @Validated CustomerDto customerDto, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView(REGISTRATION_PAGE);
		} else {
			if (!customerDto.getPassword().equals(customerDto.getConfirmPassword())) {
				result.rejectValue("confirmPassword", "confirmPassword.invalid",
						"Password and Confirm Password did not match!");
				return new ModelAndView(REGISTRATION_PAGE);
			} else {
				Customer customer = new Customer();
				customer.setFirstName(customerDto.getFirstName());
				customer.setLastName(customerDto.getLastName());
				customer.setEmail(customerDto.getEmail());
				customer.setMobile(customerDto.getMobile());
				customer.setCustomerLocale(Locale.ENGLISH);
				customer.setType("ROLE_CUSTOMER");

				if (this.customerService.saveCustomer(customer) > 0) {
					User user = new User();
					user.setUsername(customerDto.getEmail());
					user.setPassword(passwordEncoder.encode(customerDto.getPassword()));
					user.setEnabled(true);

					Set<UserRole> userRoles = new HashSet<UserRole>();
					UserRole userRole = new UserRole();
					userRole.setRole("ROLE_CUSTOMER");
					userRoles.add(userRole);

					user.setUserRoles(userRoles);

					if (this.userService.saveUser(user) > 0)
						this.loginService.autologin(user.getUsername(), user.getPassword());
				}
			}
		}
		return new ModelAndView("redirect:/register");
	}
}
