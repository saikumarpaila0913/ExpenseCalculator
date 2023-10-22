package com.expenseApp.ExpenseCalculator.Service;

import com.expenseApp.ExpenseCalculator.Model.AuthenticationToken;
import com.expenseApp.ExpenseCalculator.Model.User;
import com.expenseApp.ExpenseCalculator.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo UserRepo;

    public String SignUp(User user) {
        if(UserRepo.existsByUseremail(user.getUseremail())){
            return "User Already exists";
        }

        UserRepo.save(user);
        return "signed Up";
    }


    public String SignIn(User user) {
        User existingUser=UserRepo. findByUseremail(user.getUseremail());
        if(existingUser==null){
            return "UserNotFound";
        }
        AuthenticationToken Token = new AuthenticationToken(user);
        return Token.getToken();

    }


    public String UpdatePassword(User user) {
        User existingUser=UserRepo. findByUseremail(user.getUseremail());
        existingUser.setUserPassword(user.getUserPassword());
        UserRepo.save(existingUser);
        return "Updated";

    }
}
