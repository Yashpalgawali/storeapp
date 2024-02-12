package com.example.demo.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Invoice_Product;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model, HttpSession sess)
	{
		sess.removeAttribute("temp_id");
		
		
		
		return "Home";
	}
	
}
