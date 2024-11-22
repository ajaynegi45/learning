package com.learn.Security.Service;

import com.learn.Security.Model.MyUser;
import com.learn.Security.Repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * <p>
 * The {@code UserDetailsService}  interface is used to load user-specific data during authentication. It has a single method called {@code  loadUserByUsername}, which takes a username (typically an email or username) as a parameter and returns an object that implements the UserDetails interface. This object contains information about the user, such as their username, password, roles, and other relevant security-related information.
 * </p>
 * <p>
 * When a user tries to log in, Spring Security uses the UserDetailsService to load the user's details from a data source (usually a database). This allows Spring Security to perform authentication by comparing the provided credentials with the stored credentials for that user.
 * <p/>
 * */
@Service
public class CustomUserDetailsService implements UserDetailsService {




    @Autowired
    private MyRepository myRepository;


     // UserDetailsService has a single method called loadUserByUsername, which takes a username (typically an email or username) as a parameter and returns an object that implements the UserDetails interface.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUser user = myRepository.findByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("The username you provided is not found in database");
        }

        // This object contains information about the user, such as their username, password, roles, and other relevant security-related information.
        return new CustomUserDetails(user);
    }




















/*
    private final static String USER_NOT_FOUND = "user with email %s not found";

    private final MyRepository myRepository;
    public CustomUserDetailsService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return myRepository.findByUsername(username).orElseThrow(()-> throw new UsernameNotFoundException(String.format(USER_NOT_FOUND, username)));
    }




*/

}
