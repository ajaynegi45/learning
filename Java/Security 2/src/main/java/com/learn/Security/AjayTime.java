package com.learn.Security;

import org.springframework.security.core.GrantedAuthority;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Collection;

public class AjayTime {
    public static void main(String[] args) {

            System.out.println(LocalDateTime.now(Clock.systemDefaultZone()));

//        2023-08-27 T 06:58:39.978914    LocalDateTime.now(Clock.systemUTC())
//        2023-08-27 T 12:30:19.567602    LocalDateTime.now()
//        2023-08-27 T 12:32:05.594618    LocalDateTime.now(Clock.systemDefaultZone())

    }
}





/*

Returns the authorities granted to the user. Cannot return null.
    Collection<? extends GrantedAuthority> getAuthorities();


Returns the password used to authenticate the user.
    String getPassword();


Returns the username used to authenticate the user. Cannot return null
    String getUsername();


Indicates whether the user's account has expired. An expired account cannot be authenticated.
return true if the user's account is valid (ie non-expired), false if no longer valid (ie expired).

    boolean isAccountNonExpired();


Indicates whether the user is locked or unlocked. A locked user cannot be authenticated.
return true if the user is not locked, false otherwise.

    boolean isAccountNonLocked();


Indicates whether the user's credentials (password) has expired. Expired credentials prevent authentication.
return true if the user's credentials are valid (ie non-expired), false if no longer valid (ie expired)

    boolean isCredentialsNonExpired();


Indicates whether the user is enabled or disabled. A disabled user cannot be authenticated.
return true if the user is enabled, false otherwise

    boolean isEnabled();


*/