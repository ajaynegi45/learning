package com.learn.Security.Repository;

import com.learn.Security.Model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyUser,Long> {
    MyUser findByUsername(String username);
}
