package com.infosys.jpademo1;

import com.infosys.jpademo1.Services.CustomerService;
import com.infosys.jpademo1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Jpademo1Application implements CommandLineRunner {

	@Autowired
	UserService userService;
	@Autowired
	CustomerService customerService;

	public static void main(String[] args)  {

		SpringApplication.run(Jpademo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter 1 to add user");
		System.out.println("Enter 2 to fetch  all user");
		System.out.println("Enter 3 to remove user");
		System.out.println("Enter 4 to update user");
		System.out.println("Enter 5 to fetch specific user");
		System.out.println("Enter 6 to fetch user on basis of name");
		System.out.println("Enter 7 to fetch user on basis of name and email");
		System.out.println("Enter 9 to get all user data using jpql ");
		System.out.println("Enter 10 to get all email list");
		System.out.println("Enter 11 to get user on basis of name using query param");
		System.out.println("Enter 15 to add new customer");
		System.out.println("Enter 16 to add new customer with order");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation to perform");
		int op = scanner.nextInt();
		switch (op)
		{
			case 1:
				userService.addNewUser();
				break;
			case 2:
				userService.showAllUser();
				break;
			case 4:
				System.out.println("Enter user id to search");
				userService.updateUserEmail(scanner.nextInt());
			case 5:
				System.out.println("Enter user id to search");
				userService.findUserById(scanner.nextInt());
				break;
			case 6:
				System.out.println("Enter username to find");
				userService.findUsersOnBasisOfName(scanner.next());
				break;
			case 7:
				System.out.println("Enter username to find");
				String uname = scanner.next();
				System.out.println("Enter username to email");
				String email = scanner.next();
				userService.findOnBasisOfUserNameAndEmail(uname,email);
				break;
			case 8:
				System.out.println("Enter pattern to match");
				String pattern = scanner.next();
				userService.findOnBasisOfLikePattern(pattern);  // %as%
				break;
			case 9:
				userService.getAllUserData();
				break;
			case 10:
                 userService.getAllEmail();
				 break;
			case 11:
				System.out.println("enter username to search for details");
				userService.getUserOnBasisOfName(scanner.next());
				break;
			case 12:
				System.out.println("enter email id");
				String email1 = scanner.next();
				System.out.println("enter user id");
				int uid = scanner.nextInt();
				userService.getUserOnBasisOfEmailAndId(email1,uid);
				break;
			case 13:
				System.out.println("enter username to search for details");
				userService.getUserByNameUsingNameQuery(scanner.next());
                break;
			case 14:
				System.out.println("enter user name");
				String uname1 = scanner.next();
				System.out.println("enter user id");
				int id1 = scanner.nextInt();
				userService.getUserEmailOnBasisOfNameAndId(uname1,id1);
				break;
			case 15:
				customerService.addCustomer();
				break;
			case 16:
				customerService.addCustomerWithOrders();
				break;

			default:
				System.out.println("Please select valid operation.Invalid operation");

		}
	}
}
