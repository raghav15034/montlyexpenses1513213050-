package com.monthlyexpenses.serviceimpl;

import com.monthlyexpenses.model.Expenses;
import com.monthlyexpenses.model.Response;
import com.monthlyexpenses.repositories.ExpencesRepositories;
import com.monthlyexpenses.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    ExpencesRepositories expensesRepositories;
    @Override
    public Response saveExpense(List<Expenses> expensesList) {
        Response response=new Response();
        if(expensesList!=null){
            expensesRepositories.saveAll(expensesList);
            response.setStatus("success");
            response.setMessage("Expenses Data save successfully! ");
        }
        else{
            response.setStatus("error");
        }
        return response;
    }
}
