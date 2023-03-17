package com.ifcordoba.userservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //CONTRUCTOR VACIO
@Data //GENERA LOS GET AND SET
@NoArgsConstructor //CREAR EL CONSTRUCTOR
@Table(name="users") //GENERAR NOMBRE EN A BASE DE DATOS
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String mail;


}
