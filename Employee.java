//****************************************************************************************
//  Employee.java        SEIS601-02 Foundation Of Software Development Java
//
//  Homework - Inheritance
//
//  Author: Felix Adekola        
//  Due Date: April 18, 2018 by 5;45pm
//*****************************************************************************************

//Implement Class Employee(subclass of Person)
public class Employee extends Person {
	
	private String name;  int age, numEmployeeObj;  double yearsOfService;  						
	
	
	Employee(String newName, int newid)	{
		super(newid);
		this.name = newName;
	}
	
	Employee(int newid)	{
		super(newid);
	  
	}
	
	/*Define the EMPLOYEE CONSTRUCTOR to accept and initialize instance data.*/
	Employee (String newName, int newAge, double newYearsOfService, int newID)     
	{
		super(newID);
		setAge(newAge);
		setYearOfService(newYearsOfService);
		numEmployeeObj++;                     /* increment number of employee objects every time in the constructor */
	}
	
	public void setName(String newName){name = newName;}
	public void setAge(int newAge){age = newAge;}
	public void setYearOfService(double newEmployeeYearsOfService){	yearsOfService = newEmployeeYearsOfService;}
	
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return (emp.id == age)&& (emp.name == name);
	}
}

/* Revision
 * 1.0 initial submission
 * 1.1 simplified isEligibleForRetirment implementation: 
 * return age + yearsOfService > 60
 * instead of using if-else block
 *  */
