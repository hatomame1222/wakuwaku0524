package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/")
	public String keijiban(Form form) {
		
		return "form/keijiban";
	}
	
	@RequestMapping("/form")
	public String requestform(Form form1) {
		
		return "form/input";
	}

}
