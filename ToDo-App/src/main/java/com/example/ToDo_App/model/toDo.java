package com.example.ToDo_App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table (name = "toDo")
public class toDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean Completed;


}
