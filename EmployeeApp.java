//****************************************************************************************
//  EmployeeApp.java        SEIS601-02 Foundation Of Software Development Java
//
//  Homework - Writing Classes. 
//
//  Author: Felix Adekola        
//  Due Date: April 4, 2018 by 5;45pm
//*****************************************************************************************

import java.util.Scanner;

public class EmployeeApp {
	
	
	public static void main(String[] args) {
		   //-----------------------------------------------------------------
		   //  This is the client class for class Employee.
		   //  - Ask user for data for 2 employees
		   //  - Take this user input and invoke the constructor of Employee
		   //    class, passing the user provided input as arguments.
		   //  - print the number of Employee objects created
		   //  - display data for each employee created
		   //  - specify each employee is eligible for retirement or not
		   //-----------------------------------------------------------------
		
		String employeeName; int age; double yearsOfService; /*temp variables to store user inputs*/
		
		/*Ask user for data for 2 employees */
		//Ask for emp1 data		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Employee 1 name: ");
		employeeName = userInput.next();
		System.out.print("Enter Employee 1 age: ");
		age = userInput.nextInt();
		System.out.print("Enter Employee 1 years of service: ");
		yearsOfService = userInput.nextDouble();
		/*Take this user input and invoke the constructor of Employee*/
     	Employee emp1 = new Employee(employeeName,age,yearsOfService );
	
		//Ask for emp2 data
		System.out.print("\nEnter Employee 2 name: ");
		employeeName = userInput.next();
		System.out.print("Enter Employee 2 age: ");
		age = userInput.nextInt();
		System.out.print("Enter Employee 2 years of service: ");
		yearsOfService = userInput.nextDouble();
		/*Take this user input and invoke the constructor of Employee*/
		Employee emp2 = new Employee(employeeName,age,yearsOfService );
		
	    System.out.println("\n\nNumebr of Employee objects created: " + emp1.numEmployeeObj);
	    System.out.println("\nEmployee 1 data:" + "\nName: " + emp1.getName()+ "\nAge: " + emp1.getAge()+ "\nYear Of Service: " + emp1.getYearOfService() + "\nEligible for retirement:" + emp1.isEligibleForRetirement());
	    System.out.println("\nEmployee 2 data:" + "\nName: " + emp2.getName()+ "\nAge: " + emp2.getAge()+ "\nYear Of Service: " + emp2.getYearOfService() + "\nEligible for retirement:" + emp2.isEligibleForRetirement());
	   	   
	}//end main
}//end EmployeeApp 
