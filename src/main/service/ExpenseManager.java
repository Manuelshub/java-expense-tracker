package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Category;
import model.Expense;

public class ExpenseManager {
    private final List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>(); 
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return new ArrayList<>(expenses); // Defensive copy
    }

    public List<Expense> getExpensesByCategory(Category category) {
        return expenses.stream()
                .filter(e -> e.getCategory() == category)
                .collect(Collectors.toList());
    }

    public List<Expense> getExpensesByMonth(int month, int year) {
        return expenses.stream()
                .filter(e -> e.getDate().getMonthValue() == month &&
                             e.getDate().getYear() == year)
                .collect(Collectors.toList());
    }

    public double getTotalAmountSpent() {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public double getTotalByCategory(Category category) {
        return expenses.stream()
                .filter(e -> e.getCategory() == category)
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}