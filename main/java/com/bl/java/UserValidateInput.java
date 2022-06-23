package com.bl.java;

import java.util.Scanner;

public class UserValidateInput {
    public static void main(String[] args) {
        UserValidator register = new UserValidator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user first name");
        String userFirstName = sc.nextLine();
        register.userFirstName.test(userFirstName);
        System.out.println("Enter the user last name");
        String userLastName = sc.nextLine();
        register.userLastName.test(userLastName);
        System.out.println("Enter the user Email");
        String userValidMail = sc.nextLine();
        register.userValidMailId.test(userValidMail);
        System.out.println("Enter the user mobile number");
        String userValidMobileNumber = sc.nextLine();
        register.userValidMobileNumber.test(userValidMobileNumber);
        System.out.println("Enter the user password");
        String userValidPassword = sc.nextLine();
        register.userValidPassword.test(userValidPassword);
    }
}
