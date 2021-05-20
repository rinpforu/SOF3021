package com.lab.controller;

import com.lab.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
//        User user = new User();
//        user.setName("RinP");
//        model.addAttribute("myUser",user);
//        return "hello";
        return "admin/users/index";
    }

    @RequestMapping("/test")
    public String test(){
        return "redirect:/hello";
    }

    @ResponseBody
    @GetMapping("/demo-api")
    public String demoApi(){
        return "Demo api okey !";
    }
}
