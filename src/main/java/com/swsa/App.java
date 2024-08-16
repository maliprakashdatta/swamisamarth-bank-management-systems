package com.swsa;
import com.swsa.service.AccountService;
import com.swsa.service.CardService;
import com.swsa.service.ConnectionService;
import com.swsa.service.CustomerService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

    private static final ConnectionService connectionService = new ConnectionService();

    public static void main(String[] args) throws IOException, SQLException {

        CardService cardService=new CardService();
        CustomerService customerService=new CustomerService();
        AccountService accountService=new AccountService();
        Scanner scanner = new Scanner(System.in);
        int  choice = 0;
        do {

            System.out.println("*** SWAMISAMARTH BANK MANAGEMENT SYSTEM ***");
            System.out.println("_______________________________");
            System.out.println("Select operation:");
            System.out.println("1. Applying Card");
            System.out.println("2. Open New Customer Account");
            System.out.println("3. Deposit Account ");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Performing RETRIEVE operation on Customer.");
            System.out.println("6. Applying Customer");
            System.out.println("7. Performing RETRIEVE operation on Acount .");
            System.out.println("8. check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            //choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {

                case 1:
                    System.out.println("Applying For Card");
                    cardService.insertCard();
                    break;
                case 2:
                    System.out.println("Applying for new Customer");
                     accountService.insertAccount();
                    break;
                case 3:
                    System.out.println("Deposit Account/Debit ");
                    accountService.insertdepositMoney();
                    break;
                case 4:
                    System.out.println("Withdraw Account/Credit ");
                     accountService.insertwithdrawMoney();
                    break;

                case 5:
                    System.out.println("Performing RETRIEVE operation on Customer..");
                    customerService.retrieveCustomer().forEach(customer -> {
                        System.out.println("customerId ID: " + customer.getCustomerId() + ", Name: " + customer.getName() + ", MobileNo: " + customer.getMobileNo()+ ", Address: " + customer.getAddress()+ ", emailId: " + customer.getEmailId()+ ", aadhaarNo: " + customer.getAadhaarNo());
                    });
                    break;
                case 6:
                   System.out.println("Applying Customer ");
                   customerService.insertNewCustomer();
                    break;

                case 7:
                    System.out.println("Performing RETRIEVE operation on Account..");
                    accountService.retrieveAccount().forEach(Account -> {
                        System.out.println("Account Number: " + Account.getAccountNumber()+ ", AccountHolderName: " +Account.getAccountHolderName() + ", Balance: " + Account.getBalance()+ ", customer: " + Account.getCustomer().getCustomerId());
                    });

                case 8:
                    accountService.getBalance();
                    break;

                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        scanner.close();
    }

    }

