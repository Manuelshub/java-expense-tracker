package model;

import java.time.LocalDate;
import java.util.UUID;

public class Expense {
    private final String id;
    private double amount;
    private String description;
    private LocalDate date;
    private Category category;

    public Expense(double amount, String description, LocalDate date, Category category) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense {" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", category=" + category +
                '}';
    }
}