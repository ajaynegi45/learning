package com.security.Event;

import com.security.Entity.User;
import org.springframework.context.ApplicationEvent;

public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationUrl;


    public RegistrationCompleteEvent(User user, String applicationUrl){
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }

    public User getUser() {
        return user;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }
}
