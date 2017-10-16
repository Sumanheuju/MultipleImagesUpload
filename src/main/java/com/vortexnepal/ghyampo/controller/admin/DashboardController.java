package com.vortexnepal.ghyampo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class DashboardController {

	
	@GetMapping
	public String dashboard() {
		return "admin/dashboard";
	}
	
	@GetMapping("/calculate")
	public void calculateIncomeForMonth() {
		
	}
}
