package com.learn.Security.Controller;

import com.learn.Security.Entities.RegistrationRequest;
import com.learn.Security.Model.MyUser;
import com.learn.Security.Service.RegistrationService;
import com.learn.Security.Service.SaveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/")
    public String start(){
        System.out.println("\n\nLoading Welcome Page\n\n");
        return "Welcome to my Web Page";
    }


    @GetMapping("/home")
    public String home(){
        System.out.println("\n\nLoading Home Page\n\n");
        return "This is Home Page";
    }


    @GetMapping("/admin")
    public String admin(){
        System.out.println("\n\nLoading Admin Page\n\n");
        return "This is Admin Page";
    }


    @GetMapping("/user")
    public String user(){
        System.out.println("\n\nLoading User Page\n\n");
        return "This is User Page";
    }


     @Autowired
    public SaveUserService saveUserService;

    @PostMapping("/register")
    public ResponseEntity<Void> saveUser(@RequestBody MyUser saveMyUser){
        System.out.println("Starting Save User Controller");
        try {
            System.out.println("Now I am Going to call save User Service");
            boolean value = saveUserService.saveUser(saveMyUser);

            System.out.println("Returning from Save user Service");
            if(value){
                // After Doing all Check user created in database
                return ResponseEntity.status(HttpStatus.CREATED).build();

                // If Username Already found in database
            }else ResponseEntity.status(HttpStatus.FOUND).build();
        }catch (Exception e){
            System.out.println(" Some Exception arise\n\n\n\n");
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        System.out.println("The End");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }


//    @Autowired
//    private RegistrationService registrationService;
//
//    @PostMapping("/register/ajay")
//    public String register (@RequestBody RegistrationRequest registrationRequest){
//        return registrationService.register(registrationRequest);
//    }
//
//
}