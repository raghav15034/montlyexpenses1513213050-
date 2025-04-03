package com.monthlyexpenses.controller;

import com.monthlyexpenses.model.Expenses;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {
    @Autowired
    ExpenseService expenseService;
    @PostMapping("/save")
    public ResponseEntity saveExpense(@RequestBody List<Expenses> expensesList){
       Response response=expenseService.saveExpense(expensesList);
        return ResponseEntity.ok(response);
    }
}
