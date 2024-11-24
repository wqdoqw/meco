package com.meco.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.meco.main.service.UserService;
import com.meco.main.vo.UserVo;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/userList")
    public String getUserList(Model model) {
        List<UserVo> userList = userService.getUserList();
        model.addAttribute("list", userList);
        return "userList";
    }
    
}