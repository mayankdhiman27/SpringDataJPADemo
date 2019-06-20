package com.mayank.jpa.SpringDataJPADemo.repository;

import com.mayank.jpa.SpringDataJPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
