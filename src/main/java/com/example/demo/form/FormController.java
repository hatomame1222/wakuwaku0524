package com.example.demo.form;

<<<<<<< HEAD
public class FormController {
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String form(Model model,Form form) {
		model.addAttribute("title","サンプルフォーム");
		return "form/input";
	}
>>>>>>> 1ace0f18674926fdfd5956be5007fe3957ce9f5c

}
