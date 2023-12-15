package com.gl.javafsd.emailapp;

import java.util.Scanner;

import com.gl.javafsd.emailapp.model.Employee;
import com.gl.javafsd.emailapp.service.CredentialServiceImpl;
import com.gl.javafsd.emailapp.service.ICredentialService;

public class EmailApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Email Application");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        System.out.println("Enter your department");
        System.out.println("To specify your department, enter the corresponding department number");

        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int dept = input.nextInt();
        ICredentialService credentialService = new CredentialServiceImpl();		
    
        Employee employeeObject = new Employee(firstName, lastName);
        String email= credentialService.generateEmailAddress(firstName, lastName, dept);
        employeeObject.setEmail(email);
        
        String password= credentialService.generatePassword();
        employeeObject.setPassword(password);
        
        credentialService.showCredentials(employeeObject);
        
        input.close();
	}

}