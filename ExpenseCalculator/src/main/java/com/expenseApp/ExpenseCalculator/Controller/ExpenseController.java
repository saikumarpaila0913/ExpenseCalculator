package com.expenseApp.ExpenseCalculator.Controller;

import com.expenseApp.ExpenseCalculator.Model.Expense;
import com.expenseApp.ExpenseCalculator.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    ExpenseService ExpService;

    //addexp
    @PostMapping("/expense/new")
     public String addExp(Expense expense){
        return ExpService.createExpense(expense);
    }
    //readexp
    @GetMapping("/exp/Id")
    public Expense readExp(Long expId){
        return ExpService.getExp(expId);
    }

    //updateexp
    @PutMapping("/expense/Id")
    public String UpdateExp(Expense exp){
        return ExpService.UpdateExp(exp);
    }
    //deleteexp
    @DeleteMapping("/Expense")
    public String DeleteExp(Long expId){
        return ExpService.DeleteExp(expId);
    }



    //getexpbydate
    @GetMapping("/exp/date")
    public List<Expense> getExpense(LocalDate Date){
        return ExpService.getExpenseBydate(Date);
    }
    //gettotalExpByMonth

    @GetMapping("/expense/month")
    public Long getExpByMonth(YearMonth Month){
        return ExpService.getExpByMonth(Month);

    }





}
