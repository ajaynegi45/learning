package com.learn.Security.Service;

import com.learn.Security.Model.MyUser;
import com.learn.Security.Repository.SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SaveUserService {

    @Autowired
    private SaveRepository saveRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public boolean saveUser(MyUser user){
        System.out.println("\n\nReached to Save User Service Class ");

        if(saveRepository.existsByUsername ( user.getUsername() ) ){
            System.out.println("The data your going to entered is already Present");
            return false;

        }else {

            System.out.println("\n\nGoing to encode Password");
            // Encoding Password
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            System.out.println("\n\nPassword has encoded now going to save it");
            saveRepository.save(user);
            System.out.println("User Have been Saved");
            return true;
        }
    }

}
