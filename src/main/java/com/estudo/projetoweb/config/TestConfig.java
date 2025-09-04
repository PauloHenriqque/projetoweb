package com.estudo.projetoweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudo.projetoweb.entities.User;
import com.estudo.projetoweb.repositories.UserRepository;
import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Maria Brown", "maria.brown@example.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex.green@example.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
