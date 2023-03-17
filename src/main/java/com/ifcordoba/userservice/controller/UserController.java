package com.ifcordoba.userservice.controller;

import com.ifcordoba.userservice.entity.User;
import com.ifcordoba.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

     @Autowired //Genera el constructor
    UserService userService;

     @GetMapping()
     public ResponseEntity<List<User>> getUserAll(){

         List<User> users =userService.getAllUser();
         if (users.isEmpty()){
             return ResponseEntity.noContent().build();
         }
         return ResponseEntity.ok(users);
     }

    @GetMapping({"/{id}"})
    public  ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
         User user = userService.getUserById(id);
         if(user == null){
             return  ResponseEntity.notFound().build();
         }
        return ResponseEntity.ok(user);
    }


     @PostMapping
     public ResponseEntity<User> saveUser(@RequestBody User user){ //Revisa el cuerpo de la solicitud
            User userNew = userService.saveUser(user);

            if (userNew == null){
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok(userNew);

     }
}
