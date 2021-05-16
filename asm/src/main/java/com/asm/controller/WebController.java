package com.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String trangChu(){
        return "index";
    }
    @GetMapping("/Admin/Login")
    public String loginAdmin(Model model){
        return "/Admin/login";
    }
}
