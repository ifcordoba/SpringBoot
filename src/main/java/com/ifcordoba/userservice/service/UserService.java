package com.ifcordoba.userservice.service;

import com.ifcordoba.userservice.entity.User;
import com.ifcordoba.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //Crea el Contructor
    UserRepository userRepository;

    //LOGICA DEL NEGOCIO (UPDATE, DELETE, CREATE)

    //OBTENER LISTADO DE USUARIO EN BD
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        User userNew = userRepository.save(user);
        return userNew;
    }

    public User getUserById(Integer id){
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

}
