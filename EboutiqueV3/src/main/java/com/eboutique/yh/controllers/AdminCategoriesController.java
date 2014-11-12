package com.eboutique.yh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eboutique.yh.entities.Categorie;
import com.eboutique.yh.metier.IAdminCategoriesMetier;

@Controller
@RequestMapping(value="/adminCat")
public class AdminCategoriesController {
   @Autowired
   private IAdminCategoriesMetier metier;
   @RequestMapping(value="/index")
   public String index(Model model){
	   model.addAttribute("categorie", new Categorie());
	   model.addAttribute("categories",metier.listCategories());
	return "categories";
	   
   }
}
