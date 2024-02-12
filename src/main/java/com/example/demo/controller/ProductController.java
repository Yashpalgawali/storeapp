package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.exportexcel.ExcelExport;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
@CrossOrigin("*")
public class ProductController {

	
	@GetMapping("/addproduct")
	public String addProduct()
	{
		return "AddProduct";
	}
	
	@Autowired
	ProductService prodserv;
	
	@RequestMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("Product") Product prod,RedirectAttributes attr)
	{	
		float cgst = prod.getGsttax() / 2;
		
		float igst = prod.getGsttax();
		
		prod.setCgst_per(cgst);
		prod.setSgst_per(cgst);
		prod.setIgst_per(igst);
	
		Product product = prodserv.saveProduct(prod) ;
		
		if(product!=null)
		{
			attr.addFlashAttribute("response", "Product "+prod.getProd_name()+" saved successfully");
			return "redirect:/viewproducts";
		}
		else
		{	
			attr.addFlashAttribute("reserr", "Product "+prod.getProd_name()+" is not saved ");
			return "redirect:/viewproducts";
		}
	}
	
	@RequestMapping("/saveproductrestcall")
	@ResponseBody
	public String saveProductRestCall(@ModelAttribute("Product") Product prod)
	{	
		float cgst = prod.getGsttax() / 2;
		
		float igst = prod.getGsttax();
		
		prod.setCgst_per(cgst);
		prod.setSgst_per(cgst);
		prod.setIgst_per(igst);
	
		Product product = prodserv.saveProduct(prod) ;
		
		if(product!=null)
		{
			return "redirect:/viewproducts";
		}
		else
		{	
			return "redirect:/viewproducts";
		}
	}
	
	@GetMapping("viewproducts")
	public String viewProducts(Model model)
	{
		List<Product> plist = prodserv.getAllProducts();
		
		model.addAttribute("plist", plist);
				
		return "ViewProducts";
	}
	
	@RequestMapping("editprodbyid/{id}")
	public String editProducById(@PathVariable("id") String id,Model model,RedirectAttributes attr)
	{
		Product prod = prodserv.getProductById(id);
		if(prod!=null)
		{
			model.addAttribute("prod", prod);
			return "EditProduct";
		}
		else
		{
			attr.addFlashAttribute("reserr", "No product found for given ID");
			return "redirect:/viewproducts";
		}
	}
	@PostMapping("/updateproduct")
	public String updateProductById(@ModelAttribute("Product")Product prod,RedirectAttributes attr)
	{
		System.out.println("Prod Name=> "+prod.getProd_name()+"\n Prod Unit "+prod.getProd_unit()+"\n Price => "+prod.getProd_price()
					+"\n HSN => "+prod.getProd_hsn()+"\n PROD ID is=> "+prod.getPid());
		
		int value = prodserv.updateProduct(prod);
		if(value > 0)
		{
			attr.addFlashAttribute("response", "Product "+prod.getProd_name()+" is Updated successfully ");
			return "redirect:/viewproducts";
		}
		attr.addFlashAttribute("reserr", "Product "+prod.getProd_name()+" is not Updated");
		return "redirect:/viewproducts";
	}
	
//	@RequestMapping("/product/excelexport")
//	public ModelAndView exportToExcel()
//	{
//		
//		System.out.println("\n\n Inside excelexport method \n");
//		
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setView(new ExcelExport() );
//		
//		List<Product> plist = prodserv.getAllProducts();
//		
//		mav.addObject("list", plist);
//		
//		return mav;
//	}
	
}
