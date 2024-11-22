package com.learn.Security.Repository;

import com.learn.Security.Model.MyUser;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRepository extends JpaRepository<MyUser,Long> {

    boolean findByUsername(String username);

    boolean existsByUsername(String username);
}
