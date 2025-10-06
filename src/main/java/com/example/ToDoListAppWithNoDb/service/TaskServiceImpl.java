package com.example.ToDoListAppWithNoDb.service;

import com.example.ToDoListAppWithNoDb.model.Task;
import com.example.ToDoListAppWithNoDb.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl  {
    @Autowired
    Repo repo;


    public List<Task> getTask() {
        return repo.getTask();
    }

}
