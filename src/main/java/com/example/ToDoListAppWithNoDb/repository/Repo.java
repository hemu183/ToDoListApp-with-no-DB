package com.example.ToDoListAppWithNoDb.repository;

import com.example.ToDoListAppWithNoDb.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class Repo {

     List<Task> Tasks = new ArrayList<>(Arrays.asList(

            new Task(1, "Buy groceries", "Milk, Eggs, Bread", "PENDING", new Date()),

            new Task(2, "Finish project", "Complete the Spring Boot backend module", "IN_PROGRESS", new Date()),

            new Task(3, "Workout", "Evening gym session", "COMPLETED", new Date()),

            new Task(4, "Pay bills", "Electricity and Internet bills", "PENDING", new Date()),

            new Task(5, "Call mom", "Weekend family catch-up", "PENDING", new Date())
    ));


    public List<Task> getTask() {
        return Tasks;
    }

}
