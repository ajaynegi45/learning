package com.learn.Security.Service;

import com.learn.Security.Model.MyUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;


/**
 * The UserDetails interface represents the core user information required for authentication and authorization. It provides methods for retrieving the user's username, password, authorities (roles), and whether the user's account is enabled, expired, locked, etc.
 * A class that implements the UserDetails interface encapsulates this user information. Typically, it's used in conjunction with a custom UserDetailsService to provide user-specific information during authentication.
 * */
public class CustomUserDetails implements UserDetails {

    private MyUser user;

    public CustomUserDetails(MyUser user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(user.getRoles()));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
