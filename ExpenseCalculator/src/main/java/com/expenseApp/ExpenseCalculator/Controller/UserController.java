package com.expenseApp.ExpenseCalculator.Controller;

import com.expenseApp.ExpenseCalculator.Model.User;
import com.expenseApp.ExpenseCalculator.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService Userservice;

    //signup

    @PostMapping("/User/signup")
    public String UserSignUp(User user){
        return Userservice.SignUp(user);
    }
    //signin


    @PostMapping("/User/signIn")
    public String UserSignIn(User user){
        return Userservice.SignIn(user);
    }
    //userUpdate
    @PutMapping("/User/update")
    public String UpdatePassword(User user){
        return Userservice.UpdatePassword(user);
    }


}
