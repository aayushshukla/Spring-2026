package com.infosys.jpademo1.Services;


import com.infosys.jpademo1.DAO.UserRepo;
import com.infosys.jpademo1.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void  addNewUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName= scanner.next();

        System.out.println("Enter user email");
        String userEmail= scanner.next();

        User user = new User();
        user.setUserName(userName);
        user.setUserMail(userEmail);
        try {
            userRepo.save(user);
            System.out.println("New user added successfully");
        } catch (Exception e) {
            System.err.println("User object failed to save.Please check for null value"+e);
        }

        // int - nextInt() , float - nextFloat() , doubel  nextDouble
        // boolean  nextBoolean() , String  next()  it will not read space
        // nextLine()

    }

   public void showAllUser()
    {
        Iterable<User>  userList = userRepo.findAll();
        // for(Datatype object : collection/array)
        String data = "";
        for( User user : userList)
        {

            data = data + user.getUserId() + "\t" +user.getUserName() + "\t" + user.getUserMail() + "\n";
        }
        System.out.println(data);
    }

    public  void findUserById(int id)
    {
        User user=null;
         Optional<User> optional =  userRepo.findById(id);
         if(optional.isPresent()){
            user = optional.get();

             System.out.println("username" + user.getUserName());
             System.out.println("usermail" + user.getUserMail());
         }
         else{
             System.err.println("No user found for give user id "+id);
         }

    }

    public  void updateUserEmail(int id)
    {
        Optional<User> userOptional =   userRepo.findById(id); // finding user on basis id
        if(userOptional.isPresent())
        {
            User user = userOptional.get();  // getting user
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter user new  email");
            String userNewEmail= scanner.next();
            user.setUserMail(userNewEmail);
            userRepo.save(user);
            System.out.println("User email id updated");
            showAllUser();
        }
        else{
            System.err.println("No user found for give user id "+id);
        }
    }
}
