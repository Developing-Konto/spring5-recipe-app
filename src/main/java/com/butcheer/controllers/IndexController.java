package com.butcheer.controllers;

import com.butcheer.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-12 12:27
 */
@Controller
public class IndexController {


   private RecipeService recipeService;

   public IndexController(
      RecipeService recipeService) {

      this.recipeService = recipeService;
   }


   @RequestMapping({"", "/", "/index", "/index.html"})
   public String getIndexPage(Model model) {
      model.addAttribute("recipes", recipeService.findAll());
      return "index";
   }




}
