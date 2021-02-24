package com.login.loginpage.controller;

import com.login.loginpage.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("user",new User());
        return "login";
    }
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String loginuser(User user){
        if(user.getUsername().equals("admin")&& user.getPassword().equals("admin123"))
            return "redirect:/userpage";
        else
            return "/login";
    }
    @RequestMapping("/userpage")
    public String userspage(User user){
        return "userpage";
    }
}
