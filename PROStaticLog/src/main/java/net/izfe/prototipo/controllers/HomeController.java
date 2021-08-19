package net.izfe.prototipo.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	
	private static final Log log = LogFactory.getLog(HomeController.class);
	
    @RequestMapping("home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
    @RequestMapping("/")
    public ModelAndView inicio() {
        return new ModelAndView("home");
    }
    
}