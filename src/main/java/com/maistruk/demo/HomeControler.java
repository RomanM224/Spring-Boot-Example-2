package com.maistruk.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
    
    @RequestMapping("home")
    public ModelAndView home(User user) {
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        
        modelAndView.setViewName("home");  
        return modelAndView;
    }
    
    
//    @RequestMapping("home")
//    public String home(HttpServletRequest request, HttpServletResponse response) {
//        HttpSession session = request.getSession();
//        String name = request.getParameter("name"); 
//        System.out.println("hi " + name);
//        session.setAttribute("name", name);
//        
//        return "home";
//    }

}
