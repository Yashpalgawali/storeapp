package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.StoreDetails;
import com.example.demo.service.StoreService;

@Controller
public class StoreController {

	@Autowired
	StoreService storeserv;
	
//	@GetMapping("/addstore")
//	public String addStore()
//	{
//		return "AddStore";
//	}
	
	@RequestMapping("/savestore")
	public String saveStore(@ModelAttribute("StoreDetails")StoreDetails store,RedirectAttributes attr)
	{
		StoreDetails sdetails = storeserv.saveStore(store);
		if(sdetails!=null)
		{
			attr.addFlashAttribute("response", "Store Added Successfully");
			return "redirect:/";
		}
		else
		{
			attr.addFlashAttribute("reserr", "Store is not Added ");
			return "redirect:/";
		}
	}
	
	@GetMapping("/editstorebyid/{id}")
	public String editStoreById(@PathVariable("id") String id,Model model,RedirectAttributes attr)
	{
		StoreDetails store = storeserv.getStoreById(id);
		if(store!=null)
		{
			model.addAttribute("store", store);
			return "EditStore";
		}
		else {
			attr.addFlashAttribute("reserr", "No Store found for given ID");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/updatestore")
	public String updateStore(@ModelAttribute("StoreDetails")StoreDetails details,RedirectAttributes attr)
	{
		int res = storeserv.updateStore(details);
		if(res > 0)
		{
			attr.addFlashAttribute("response","Store detail(s) is updated successfully");
			return "redirect:/";
		}
		else
		{
			attr.addFlashAttribute("reserr","Store  detail(s) is not updated ");
			return "redirect:/";
		}
	}
}
