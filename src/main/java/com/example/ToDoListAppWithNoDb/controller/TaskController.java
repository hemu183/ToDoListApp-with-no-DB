package com.example.ToDoListAppWithNoDb.controller;

import com.example.ToDoListAppWithNoDb.model.TaskObj;
import com.example.ToDoListAppWithNoDb.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {
    @Autowired
    TaskServiceImpl taskService;

    // fetches all tasks
    @GetMapping("Task")
    public List<TaskObj> getAllTask(){
        return taskService.getAllTask();
    }

    // fetches single task
    @GetMapping("Tasks/{taskId}")
    public TaskObj getTask(@PathVariable int taskId){
        return taskService.getTask(taskId);
    }

    //adding a task
    @PostMapping("Task")
    public String addTask(@RequestBody TaskObj taskObj){
        taskService.addTask(taskObj);
        //return taskService.getTask(taskObj.getId());
        return "Added Task";
    }

    //Update a task
    @PutMapping("Task")
    public String updateTask(@RequestBody TaskObj taskobj){
        taskService.updateTask(taskobj);
        return "updated success";
    }

    //Delete a Task
    @DeleteMapping("Task/{id}")
    public String deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
        return "Delete success";
    }
}


