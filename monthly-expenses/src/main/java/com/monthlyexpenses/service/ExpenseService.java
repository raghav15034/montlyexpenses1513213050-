package com.monthlyexpenses.service;

import com.monthlyexpenses.model.Expenses;
import com.monthlyexpenses.model.Response;

import java.util.List;

public interface ExpenseService {
    public Response saveExpense(List<Expenses> expensesList);
}
