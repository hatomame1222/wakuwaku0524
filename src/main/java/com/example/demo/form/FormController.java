package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String form(Model model) {
		model.addAttribute("title","入部申し込みフォーム");
		return "form/input";

	@RequestMapping("/keijiban")
	public String keijiban(Form form) {
		
		return "form/keijiban";
	}

}
