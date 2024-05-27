package com.example.demo.form;

<<<<<<< HEAD
public class FormController {
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/keijiban")
	public String keijiban(Form form) {
		
		return "form/keijiban";
	}
>>>>>>> 1ace0f18674926fdfd5956be5007fe3957ce9f5c

}
