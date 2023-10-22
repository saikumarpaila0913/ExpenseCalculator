package com.expenseApp.ExpenseCalculator.Repository;

import com.expenseApp.ExpenseCalculator.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {
    boolean existsByUseremail(String userEmail);

    User findByUseremail(String email);
}
