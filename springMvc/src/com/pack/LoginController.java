package com.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/") 
public class LoginController {
   String message;
   
   @Autowired
   Login log;
   
   @RequestMapping("/login")  
   public ModelAndView login(@ModelAttribute("SpringWeb")Login login, 		   
		   ModelMap model, BindingResult res) {;
      if(!res.hasErrors()){
	      if(log.getUsername() != null && 
	    		  !log.getUsername().equals("") 
	    		  && log.getUsername().equals("sab") && 
	    		  log.getPassword() != null && 
	    		  !log.getPassword().equals("") && 
	    		  log.getPassword().equals("123")){
	    	  message = "Welcome " +log.getUsername() + ".";
		      return new ModelAndView("welcome", 
		    		  "message", message);  
	      }
 
      }else{
    	  message = "Wrong username or password.";
    	  return new ModelAndView("welcome", 
    			  "message", message);
      }
      return new ModelAndView("welcome", 
			  "message", message);
   }
}
