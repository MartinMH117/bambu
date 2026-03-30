package com.example.tasks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private Long user;
}