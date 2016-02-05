package Lawson.Customer;

import java.util.Scanner;

public class CustomerApp {


    public static void main(String[] args) {
        String displayAnother = "y";



        // creates scanner for use in input
        Scanner scanner = new Scanner( System.in );

        //Prints initial information and asks for input
        System.out.println("Welcome to the Customer Viewer \n");


        while (displayAnother.equals("y")  || displayAnother.equals("Y")) {
            System.out.print("Enter a Customer Number: ");
            //Get customer number from user
            int intCustomerNumber = scanner.nextInt();
            System.out.print("\n");




            Customer custCurrentCustomer = new Customer();
            custCurrentCustomer = CustomerDB.getCustomer(intCustomerNumber);

            String strOutput = custCurrentCustomer.getNameAndAddress();
            if (custCurrentCustomer.getName() != null) {
                System.out.println(strOutput);
            }
            else {
                System.out.println("There is no customer number " + intCustomerNumber + " in our records.");
            }
            System.out.println();

            System.out.print("Display another customer?  (y/n) :  ");
            displayAnother = scanner.next();






        }









    }

}
