package com.learn.Security.Service;

import com.learn.Security.Entities.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest registrationRequest) {
        return "its works";
    }
}
