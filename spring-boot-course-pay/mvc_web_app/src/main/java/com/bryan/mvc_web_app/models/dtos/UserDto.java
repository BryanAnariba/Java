package com.bryan.mvc_web_app.models.dtos;

import com.bryan.mvc_web_app.models.UserModel;

public class UserDto {

    private String title;
    private UserModel user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

}
