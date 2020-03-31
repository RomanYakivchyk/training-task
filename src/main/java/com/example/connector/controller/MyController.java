//package com.example.connector.controller;
//
//import com.example.connector.domain.User;
//import com.example.connector.repository.FirestoreUserRepository;
//import com.example.connector.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//import java.util.List;
//
//@RestController
//public class MyController {
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/users")
//    public List<User> users() {
//        long start = System.currentTimeMillis();
//        List<User> users = userService.getUsers(new LinkedMultiValueMap<>()).block();
//        System.out.println(System.currentTimeMillis() - start);
//        return users;
//    }
//}
