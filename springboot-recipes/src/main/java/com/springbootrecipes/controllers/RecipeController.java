package com.springbootrecipes.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootrecipes.model.Recipe;

@EnableAutoConfiguration
@Controller
public class RecipeController {
	
	@PostMapping("/createRecipe")
	public String createRecipe(@ModelAttribute Recipe recipe) {
		
		System.out.println(recipe.getName());
		System.out.println(recipe.getTimeRecipe());
		System.out.println(recipe.getRecipe());
		System.out.println(recipe.getCreatedBy());
		
		return "/index";
	}
	
	
	@GetMapping("/")
	public String viewRecipe(Model model) {
		
		model.addAttribute("recipe", new Recipe());
		return "/index";
	}
	
	

}
