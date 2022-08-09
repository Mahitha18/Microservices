package com.web.vendor.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.web.vendor.practice.dao.entity.VentorEntity;
import com.web.vendor.practice.service.VendorService;



@Controller
public class VendorController {

	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreate")
	public String showCreateVendor(@ModelAttribute("vendor") VentorEntity vendor,ModelMap moodelMap) {
		
		return "createVendor";
	}
	
	
	public String saveVendor(@ModelAttribute("vendor") VentorEntity vendor) {
		 service.saveVendor(vendor);
		 return "createVendor";
		
	}
	
	
	@RequestMapping("/showVendors")
	public String displayVendors(ModelMap modelMap) {
		List<VentorEntity> allVendors=service.getAllVendors();
		System.out.println(allVendors);
		modelMap.addAttribute("vendors", allVendors);
		return"displayVendors";
	}
	
	@RequestMapping("/deleteVendors")
	public String deleteVendor(@RequestParam("id")int id,ModelMap modelMap) {
		VentorEntity vendorById = service.getVendorById(id);
		VentorEntity vendor=new VentorEntity();
		vendor.setId(id);
		service.deleteVendor(vendorById);
		List<VentorEntity> allVendors = service.getAllVendors();
		modelMap.addAttribute("vendors", allVendors);
		return "displayVendors";
		}
	
	@RequestMapping("/UpdateVendor")
	public String updateVendors(@RequestParam("id")int id,ModelMap modelMap) {
		VentorEntity vendorById = service.getVendorById(id);
		modelMap.addAttribute("vendor",vendorById);
		
		return "UpdateVendor";
		
		
	}
	
	@RequestMapping("/ShowUpdatedVendor")
	public String UpdatedVendorsPage(@ModelAttribute("vendor") VentorEntity vendor,ModelMap modelMap) {
		
		service.updateVendor(vendor);
		List<VentorEntity> allVendors = service.getAllVendors();
		modelMap.addAttribute("vendors",allVendors);
		return "displayVendors";
	}
}
