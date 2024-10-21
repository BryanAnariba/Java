package com.bryan.mvc_web_app.controllers;

import com.bryan.mvc_web_app.models.UserModel;
import java.util.HashMap;
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
        UserModel user = new UserModel(1, "Goku", "Perez", 30);
        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        return ResponseEntity.ok(body);
    }
}
