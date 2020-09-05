package com.sem4.Controller;

import com.sem4.Model.Entities.UserEntity;
import com.sem4.Repositories.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    employeeRepo emRe;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(){
//        UserEntity em= new UserEntity();
//        model.addAttribute("employee",em);
        return "admin/login";
    }
    @RequestMapping(value = "/Index", method = RequestMethod.POST)
    public String test(@RequestParam("username") String name,@RequestParam("password") String pass,Model model){
        model.addAttribute("user",name);
        model.addAttribute("pass",pass);
        return "admin/Index";
    }
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String doRegister(@ModelAttribute("user") UserEntity em){
        return "admin/register";
    }
}
