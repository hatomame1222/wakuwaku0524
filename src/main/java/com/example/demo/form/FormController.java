package com.example.demo.form;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	 private List<String> posts = new ArrayList<>();
	 @RequestMapping("/post")

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("posts", posts);
	        return "index";
	    }

	    @PostMapping("/post")
	    public String addPost(Post post) {
	        post.setCreatedAt(LocalDateTime.now());
	        post.add(post);
	        return "redirect:/";
	    }

}
