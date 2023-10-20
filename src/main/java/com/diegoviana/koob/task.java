package com.diegoviana.koob;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class task {
    private long id;
    private String title;
    private String description;
    private LocalDate dueDate;

    public task() {
    }

    public task(long id, String title, String description, LocalDate duedate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

}
