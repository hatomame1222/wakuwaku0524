package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String form(Model model,Form form) {
		model.addAttribute("title","サンプルフォーム");
		return "form/input";
	}

}
