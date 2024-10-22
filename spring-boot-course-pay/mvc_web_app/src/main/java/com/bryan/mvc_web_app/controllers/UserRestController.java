package com.bryan.mvc_web_app.controllers;

import com.bryan.mvc_web_app.models.UserModel;
import com.bryan.mvc_web_app.models.dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/users")
public class UserRestController {
 
    // http://localhost:3500/api/users/details
    @GetMapping("/details")
    public ResponseEntity<?> details() {
        UserModel user = new UserModel(1, "Goku", "Perez", 30, "gperez@gmail.com");
        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        return ResponseEntity.ok(body);
    }
    
    // http://localhost:3500/api/users/details-page
    @GetMapping("/details-page")
    public UserDto userDetails() {
        UserDto userDto = new UserDto();
        UserModel user = new UserModel(1, "Goku", "Perez", 30, "gperez@gmail.com");
        userDto.setTitle("User Details");
        userDto.setUser(user);
        return userDto;
    }
    
    // http://localhost:3500/api/users/list
    @GetMapping("/list")
    public ResponseEntity<List<UserModel>> getUsersList() {
        UserModel userOne = new UserModel(1, "Goku", "Perez", 30, "gperez@gmail.com");
        UserModel userTwo = new UserModel(2, "Gohan", "Perez", 12, "gpperez@gmail.com");
        UserModel userThree = new UserModel(3, "Satoru", "Gojo", 27, "sg@gmail.com");
        List users = new ArrayList<>();
        users.add(userOne);
        users.add(userTwo);
        users.add(userThree);
        return ResponseEntity.ok(users);
    }
}
