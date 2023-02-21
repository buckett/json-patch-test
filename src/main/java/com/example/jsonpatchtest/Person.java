package com.example.jsonpatchtest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Person {

    @Id
    private Long id;
    private String name;
    private LocalDate birthday;
}
