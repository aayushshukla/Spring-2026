package com.infosys.jpademo1;

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
			default:
				System.out.println("Please select valid operation.Invalid operation");

		}
	}
}
