package com.example.Parkplus_App.Driver.Services;

import com.example.Parkplus_App.Driver.Model.User;

public interface UserService {
    void deleteUser(Integer userId);
    User updatePassword(Integer userId, String password);
    void register(String name, String phoneNumber, String password);
}
