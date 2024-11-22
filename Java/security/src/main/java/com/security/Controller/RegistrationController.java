package com.security.Controller;

import com.security.Entity.User;
import com.security.Event.RegistrationCompleteEvent;
import com.security.Model.UserModel;
import com.security.Service.UserService;
import org.springframework.context.ApplicationEventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user, "url"
        ));
        return "SUCCESS";
    }
}
