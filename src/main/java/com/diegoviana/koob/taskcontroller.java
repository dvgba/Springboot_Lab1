package com.diegoviana.koob;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class taskcontroller {
    private final taskrepository repository;

    public taskcontroller(taskrepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<task> getAllTasks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public task getTask(@PathVariable long id) {
        return repository.findById(id);
    }
    @PostMapping
    public task createtask(@RequestBody task task) {
        return  repository.save(task);
    }
    @PostMapping("/{id}")
    public task updateTask(@PathVariable long id, @RequestBody task updateTask) {
        updateTask.setId(id);
        return repository.save(updateTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        repository.delete(id);
    }
}
