package com.expenseApp.ExpenseCalculator.Service;

import com.expenseApp.ExpenseCalculator.Model.Expense;
import com.expenseApp.ExpenseCalculator.Repository.IExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    IExpenseRepo expRepo;

    public String createExpense(Expense expense) {
        expRepo.save(expense);
        return "expense added";
    }

    public Expense getExp(Long expId) {
       //List<Expense> existing = expRepo.findAllById(expId);
       return expRepo.getReferenceById(expId);
    }

    public String UpdateExp(Expense exp) {
        Expense existing = expRepo.getReferenceById(exp.getExpId());
        existing.setExpTitle(exp.getExpTitle());
        existing.setExpDescription(exp.getExpDescription());
        existing.setExpPrice(exp.getExpPrice());
        existing.setUser(exp.getUser());
        existing.setExpDate(exp.getExpDate());
        existing.setExpTime(exp.getExpTime());
        expRepo.save(existing);
        return "Updated";

    }

    public String DeleteExp(Long expId) {
        expRepo.deleteById(expId);
        return "Deleted";
    }

    public List<Expense> getExpenseBydate(LocalDate date) {
        return expRepo.findAllByExpDate(date);
    }

    public long getExpByMonth(YearMonth month) {
        LocalDate startOfMonth = month.atDay(1);
        LocalDate endOfMonth = month.atEndOfMonth();

        List<Expense> expenses = expRepo.findAllByExpDateBetween(startOfMonth, endOfMonth);

        long totalExpenditure = expenses.stream()
                .mapToLong(Expense::getExpPrice)
                .sum();

        return totalExpenditure;
    }



}
