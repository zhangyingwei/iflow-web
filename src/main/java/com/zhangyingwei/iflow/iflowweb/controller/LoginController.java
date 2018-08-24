package com.zhangyingwei.iflow.iflowweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String index() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam(name = "password")String password, Model model) {
        if ("admin".equals(username) && "admin".equals(password)) {
            return "redirect:/index";
        } else {
            model.addAttribute("msg", "用户名或密码不正确");
            return "login";
        }
    }
}