/**
 * Copyright (c) 2015-2017, www.codingraja.com and original author.
 * All rights reserved. Use is subject to license terms.
 */

package com.codingraja.sunelectronics.core.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.sunelectronics.catalog.service.CatalogService;
import com.codingraja.sunelectronics.core.domain.Contactus;
import com.codingraja.sunelectronics.core.service.ContactusService;

/**
 * @author CL Verma
 * @see ProductService, ProductDao
 * @see
 */

@Controller
public class HomeUrlController {

	private static final Logger LOOGER = Logger.getLogger(HomeUrlController.class);

	private static final String LANDING_PAGE = "landingPage";
	private static final String CONTACTUS_PAGE = "contactusPage";

	@Autowired
	private CatalogService productService;

	@Autowired
	private ContactusService contactusService;

	@RequestMapping("/landingPage")
	public String landingPage(Model model) {
		model.addAttribute("newProducts", this.productService.findNewProducts(10));
		LOOGER.info("Landing Page is laoding");

		return LANDING_PAGE;
	}

	@GetMapping("/contactus")
	public ModelAndView contactusPage() {
		return new ModelAndView(CONTACTUS_PAGE, "contactus", new Contactus());
	}

	@PostMapping("/contactus")
	public ModelAndView processContactusPage(@ModelAttribute @Validated Contactus contactus, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return new ModelAndView(CONTACTUS_PAGE);
		}

		model.addAttribute("contactId", this.contactusService.saveContactusForm(contactus));
		return new ModelAndView(CONTACTUS_PAGE, "contactus", new Contactus());
	}
}
