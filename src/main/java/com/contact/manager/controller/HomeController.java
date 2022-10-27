package com.contact.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
	model.addAttribute("title", "Home - Phonebook");
	return "home";
    }

    @RequestMapping("/login")
    public String login(Model model) {
	model.addAttribute("title", "Login - Phonebook");
	return "login";
    }

    @RequestMapping("/register")
    public String register(Model model) {
	model.addAttribute("title", "Register an account - Phonebook");
	return "register";
    }
}
