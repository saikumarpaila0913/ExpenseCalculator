package com.expenseApp.ExpenseCalculator.Repository;

import com.expenseApp.ExpenseCalculator.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Repository
public interface IExpenseRepo extends JpaRepository<Expense,Long> {
   // List<Expense> findAllByexpDate(LocalDate date);
    List<Expense> findAllByExpDate(LocalDate date);

   // Long findTotalExpenditureInMonth(LocalDate month);

   List<Expense> findAllByExpDateBetween(LocalDate startDate, LocalDate endDate);
}
