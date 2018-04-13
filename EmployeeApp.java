//****************************************************************************************
//  EmployeeApp.java        SEIS601-02 Foundation Of Software Development Java
//
//  Homework - Array. 
//  - Use an Employee array to keep the references to all Employee objects created.
//
//  Author: Felix Adekola        
//  Due Date: April 11, 2018 by 5;45pm
//*****************************************************************************************

import java.util.Scanner;

public class EmployeeApp {
	
	
	public static void main(String[] args) {
		   /*------------------------------------------------------------------------------------------------------------
			In the previous assignment, your program only takes two Employee's data and creates two Employee objects. 
			You need to change that in this assignment. Specifically,
            - Use an Employee array to keep the references to all Employee objects created.
            - Ask the user for the number of Employees to be processed. The Employee array needs to accommodate all data. 
              For example, the user may want to create 10 employee's data. Your Employee array should be able to hold 
              10 Employee object references. 
            - Use a loop to ask employee data, initialize each element in the Employee array.
            - After initializing all elements, print every Employee's information and eligibility for retirement.
		   --------------------------------------------------------------------------------------------------------------*/
		
		String employeeName; int age; double yearsOfService; /*temp variables to store user inputs*/
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("\nEnter the number of employee to be processed: ");
		int NumberOfEmployee = userInput.nextInt();
		
		Employee[] empArray = new Employee[NumberOfEmployee];
		
		for (int i=0; i<empArray.length; i++)
		{
			//Get employee data
			System.out.print("\nEnter Employee " + Math.addExact(i, 1) + " name: ");
			employeeName = userInput.next();
			userInput.nextLine();            //clean up the buffer. Necessary if user enter first last
			
			System.out.print("Enter " + employeeName  + "'s age: ");
			age = userInput.nextInt();
			
			System.out.print("Enter " + employeeName  + "'s years of service: ");
			yearsOfService = userInput.nextDouble();
			
			//Create an object and keep its reference in the empArray
			empArray[i] = new Employee(employeeName,age,yearsOfService );
		}
		
		System.out.println("\n\nNumebr of Employee objects created: " + Employee.numEmployeeObj);
		
		int index = 1;
		for(Employee e : empArray)
		{
			System.out.println("Employee " + index + "'s name: " + e.getName() + 
			", age: " + e.getAge() + 
			", year of service : " + e.getYearOfService() +
			", Eligible for retirement: " + e.isEligibleForRetirement()
			); //end println
			index++;
		}
	   
		userInput.close();
		
	}//end main
}//end EmployeeApp 
