package com.example.ToDoListAppWithNoDb.service;

import com.example.ToDoListAppWithNoDb.model.TaskObj;
import com.example.ToDoListAppWithNoDb.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl  {
    @Autowired
    Repo repo;


    public List<TaskObj> getAllTask() {
        return repo.getAllTask();
    }


    public TaskObj getTask(int taskId) {
        return repo.getTask(taskId);

    }

    public void addTask(TaskObj taskObj) {
        repo.addTask(taskObj);
    }

    public void updateTask(TaskObj taskobj) {
        repo.updateTask(taskobj);
    }

    public void deleteTask(int id) {
        repo.deleteTask(id);
    }
}
