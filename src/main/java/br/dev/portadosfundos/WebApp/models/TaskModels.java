package br.dev.portadosfundos.WebApp.models;

import java.util.Date;

public class TaskModels {

    private Long id;
    private String name;
    private Date date;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setclearName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    
    
}
