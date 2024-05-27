package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/keijiban")
	public String keijiban(Form form) {
		
		return "form/keijiban";
	}

}
