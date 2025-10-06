package com.example.ToDoListAppWithNoDb.controller;

import com.example.ToDoListAppWithNoDb.model.Task;
import com.example.ToDoListAppWithNoDb.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TaskController {
    @Autowired
    TaskServiceImpl taskService;

    //to get all tasks
    @GetMapping("Task")
    public List<Task> getTask(){
        return taskService.getTask();
    }
}


