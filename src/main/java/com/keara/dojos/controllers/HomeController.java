package com.keara.dojos.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keara.dojos.models.Dojo;
import com.keara.dojos.models.Ninja;
import com.keara.dojos.services.DojoService;
import com.keara.dojos.services.NinjaService;

 @Controller
public class HomeController {

	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public HomeController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojo", new Dojo());
		model.addAttribute("ninja", new Ninja());
		model.addAttribute("dojos", dojoService.getAll());
		return "index.jsp";
	}
	
	@PostMapping("/dojo")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("ninja", new Ninja());
			return "index.jsp";
		} else {
			// TODO: check for country uniqueness
			dojoService.create(dojo);
			return "redirect:/";
		}
	}
	
	@PostMapping("/ninja")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojo", new Dojo());
			return "index.jsp";
		} else {
			// TODO: check for destination uniqueness
			ninjaService.create(ninja);
			return "redirect:/";
		}
	}
	
	
	@RequestMapping("/dojos/{id}")
	public String dojoDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.getOne(id));
		model.addAttribute("ninjas", new Ninja());
		return "details.jsp";
	}
	
	
	
	
}
