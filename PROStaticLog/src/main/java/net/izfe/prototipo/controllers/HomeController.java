package net.izfe.prototipo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	
	private static final Logger  log = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping("home")
    public ModelAndView home() {
        
        log.debug("mensaje de error");

        return new ModelAndView("home");
    }
    @RequestMapping("/")
    public ModelAndView inicio() {
        return new ModelAndView("home");
    }
    
}