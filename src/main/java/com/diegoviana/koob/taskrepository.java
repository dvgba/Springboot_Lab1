package com.diegoviana.koob;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class taskrepository {
    private final List<task> tasks = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public List<task> findAll() {
        return tasks;
    }

    public task findById(long id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public task save(task task) {
        if (task.getId() == 0) {
            task.setId(idGenerator.incrementAndGet());
        } else {
            tasks.removeIf(t -> t.getId() == task.getId());
        }
        tasks.add(task);
        return task;
    }

    public void delete(long id) {
        tasks.removeIf(task -> task.getId() == id);
    }



}
