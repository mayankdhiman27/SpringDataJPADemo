package com.mayank.jpa.SpringDataJPADemo.commandLineRunner;

import com.mayank.jpa.SpringDataJPADemo.model.User;
import com.mayank.jpa.SpringDataJPADemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Rod", "Johnson");
        userRepository.save(user1);

        User user2 = new User("Uncle", "Bob");
        userRepository.save(user2);

        List<User> users = userRepository.findAll();

        System.out.println(users);
    }
}
