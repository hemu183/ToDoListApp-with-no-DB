package com.example.ToDoListAppWithNoDb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private Date createdAt;
}
