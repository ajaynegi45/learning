package com.security.Event.Listener;

import com.security.Entity.User;
import com.security.Event.RegistrationCompleteEvent;
import com.security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;


    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the Verification token for the user with link
         User user = event.getUser();
         String token = UUID.randomUUID().toString();
         userService.saveVerificationTokenForUser(token,user);
        // send mail to user

    }
}
