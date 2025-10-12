package com.example.ToDoListAppWithNoDb.repository;

import com.example.ToDoListAppWithNoDb.model.TaskObj;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class Repo {

     List<TaskObj> Tasks = new ArrayList<>(Arrays.asList(

            new TaskObj(1, "Buy groceries", "Milk, Eggs, Bread", "PENDING", new Date()),

            new TaskObj(2, "Finish project", "Complete the Spring Boot backend module", "IN_PROGRESS", new Date()),

            new TaskObj(3, "Workout", "Evening gym session", "COMPLETED", new Date()),

            new TaskObj(4, "Pay bills", "Electricity and Internet bills", "PENDING", new Date()),

            new TaskObj(5, "Call mom", "Weekend family catch-up", "PENDING", new Date())
    ));

    public List<TaskObj> getAllTask() {
        return Tasks;
    }


    public void addTask(TaskObj taskObj) {
        Tasks.add(taskObj);
    }

    public TaskObj getTask(int taskId) {
        for (TaskObj task : Tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }
}
    

