package com.bryan.mvc_web_app.controllers;

import com.bryan.mvc_web_app.models.UserModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class UserController {

    // http://localhost:3500/details-page
    @GetMapping("/details-page")
    public String details(Model model) {
        UserModel user = new UserModel(1, "Goku", "Perez", 30);
        model.addAttribute("title", "User Details Page");
        model.addAttribute("user", user);
        return "details";
    }
    
    // http://localhost:3500/details-two-page
    @GetMapping("/details-two-page")
    public String detailsTwo(Map<String, Object> model) {
        model.put("title", "User Details Page Two");
        model.put("first_name", "Gohan");
        model.put("last_name", "Perez");
        return "details-two";
    }
    
    // http://localhost:3500/users/list
    @GetMapping("/users/list")
    public String usersList(Model model) {
        List<UserModel> users = new ArrayList<>();
        UserModel userOne = new UserModel(1, "Goku", "Perez", 30, "gperez@gmail.com");
        UserModel userTwo = new UserModel(2, "Gohan", "Perez", 12);
        UserModel userThree = new UserModel(3, "Satoru", "Gojo", 27, "sg@gmail.com");
        users.add(userOne);
        users.add(userTwo);
        users.add(userThree);
        model.addAttribute("title", "Users List");
        model.addAttribute("content", "List of Users");
        model.addAttribute("users", users);
        return "users-list";
    }
}
