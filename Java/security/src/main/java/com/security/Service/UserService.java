package com.security.Service;

import com.security.Entity.User;
import com.security.Model.UserModel;

public interface UserService {

    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);
}
