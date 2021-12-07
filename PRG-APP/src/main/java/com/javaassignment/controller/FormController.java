package com.javaassignment.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.javaassignment.model.Txtbox;


@Controller
@RequestMapping("/")
public class FormController {
	
	Txtbox txtboxvalue = new Txtbox();

/**
 * This method will load the form also performing check in case of redirect
 * @param model
 * @return String
 */
	@GetMapping(value = "/form")
	public String getForm(Model model)
	{
		if(!model.asMap().containsKey("txtboxvalue"))
		{
		model.addAttribute("txtboxvalue", txtboxvalue);
		}
		return "form";
	}

/**
 *  This method used to handle the textbox value submission in form
 * @param txtboxvalue
 * @param errors
 * @param model
 * @return
 */
	@PostMapping("/success")
	public String processvalues(@Valid @ModelAttribute("txtboxvalue") Txtbox txtboxvalue,final BindingResult binding,RedirectAttributes attr, Model model)
	{	
		if(binding.hasErrors())
		{
			attr.addFlashAttribute("org.springframework.validation.BindingResult.txtboxvalue", binding);
		    attr.addFlashAttribute("txtboxvalue", txtboxvalue);  
		      
			return "redirect:/form";
		}
		
		return "redirect:/success";
		
	}
	/**
	 * This method will render success view page
	 * @return
	 */
	@GetMapping("/success")
	public String redirectsuccess()
	{
		return "success";
	}
	
}
