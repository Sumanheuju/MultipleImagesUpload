package com.vortexnepal.ghyampo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/orders")
public class OrderController {
	@GetMapping
	public String order() {
		return "";
	}
	
	public String orderView() {
		return "";
	}
}
