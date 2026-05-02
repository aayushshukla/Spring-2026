package com.infosys.jpademo1.Services;

import com.infosys.jpademo1.DAO.CustomerRepo;
import com.infosys.jpademo1.Entities.Customers;
import com.infosys.jpademo1.Entities.Order;
import com.infosys.jpademo1.Entities.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public void addCustomer()
    {
        Profile profile = new Profile("123456789"," AI Dev");
        Customers customers = new Customers("Ajit","ajit@infosys.com",profile);
        customerRepo.save(customers); // saving only customer . profile will saved automatically
    }

    public  void addCustomerWithOrders()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of orders");
        int noOfOrders = scanner.nextInt();
        List<Order> orderList = new ArrayList<>();
        for(int i=0;i<noOfOrders;i++)
        {
            System.out.println("Enter product name");
            String pname = scanner.next();
            System.out.println("Enter price of product");
            double price = scanner.nextDouble();
            Order order = new Order(pname,price);
            orderList.add(order);
        }
        Customers customers = new Customers("Nandini","nandini@infosys.com",orderList);
        customerRepo.save(customers);
    }
}
