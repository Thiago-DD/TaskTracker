package task.tracker.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.status = "all";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:mm");
        LocalDateTime now = LocalDateTime.now();

        this.createdAt = dtf.format(now);
        this.updatedAt = dtf.format(now);
    }

    public void imprime(){
        System.out.println(getId());
        System.out.println(getDescription());
        System.out.println(getStatus());
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Pesquisar mais sobre Json depois.
    public String ToJsonString(){
        return String.format("{\"id\":%d,\"description\":\"%s\",\"status\":\"%s\",\"createdAt\":\"%s\",\"updatedAt\":\"%s\"}",
                id, description, status, createdAt, updatedAt);
    }
}