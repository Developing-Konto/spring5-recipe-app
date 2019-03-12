package com.butcheer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-12 12:27
 */
@Controller
public class IndexController {


   @RequestMapping({"", "/", "/index", "/index.html"})
   public String getIndexPage(){
 
      return "index";
   }

}
