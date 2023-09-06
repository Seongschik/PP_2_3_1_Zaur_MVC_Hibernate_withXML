package com.zaurtregulov.spring.mvc_hibernate_aop.controller;

import com.zaurtregulov.spring.mvc_hibernate_aop.dao.UserDAO;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/1234")
    public String showAllUsers(Model model) {

        List<User> allUsers = userDAO.getAllUsers();
        model.addAttribute("allUsers", allUsers);

        return "all-users";
    }
}
