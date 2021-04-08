package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Todo {

    @Id
    private String id;

    private String description, priority, responsible, status;

    Date dueDate;

    public Todo() {
    }

    public Todo(String description, String priority, String responsible, String status, Date dueDate) {
        this.description = description;
        this.priority = priority;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Todo[" +
                "description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", responsible='" + responsible + '\'' +
                ", status='" + status + '\'' +
                ", dueDate=" + dueDate +
                ']';
    }
}
