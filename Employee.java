//****************************************************************************************
//  Employee.java        SEIS601-02 Foundation Of Software Development Java
//
//  Homework - Writing Classes
//
//  Author: Felix Adekola        
//  Due Date: April 4, 2018 by 5;45pm
//*****************************************************************************************
/*
 *     _____________________________________________________
 *    |                                                     |
 *    |                    Employee                         |  static variable numEmployeeObj
 *    | __________________________________________________  |     ________________________
 *    |                                                     |    |						  |
 *    |   name:  String                                     |    |________________________|
 *    |   age: integer                                      |
 *    |   yearsOfService: double							|
 *    | __________________________________________________  |    instance method
 *    |                                                     |     _________________________
 *    |  getName()                                          |    |                         |
 *    |  getAge()                                           |    | isEligibleForRetirement |
 *    |  getYearOfService()                                 |    |_________________________|
 *    |  setName()                                          |
 *    |  setAge()                                           |
 *    |  setYearOfService()                                 |
 *    | ____________________________________________________|
 *                                                         
 */

public class Employee {
	
	String name;     						/*The class should contain instance variables for employee's name, age, yearsOfService*/
	private int age;						/*allow access only through method call*/
	private double yearsOfService;
	
	static int numEmployeeObj = 0;          /* The class should also keep track of the number of employee objects created using a STATIC VARIABLE.*/ 
	
	/*Define the EMPLOYEE CONSTRUCTOR to accept and initialize instance data.*/
	Employee (String newName, int newAge, double newYearsOfService)     
	{
		setName(newName);
		setAge(newAge);
		setYearOfService(newYearsOfService);
		numEmployeeObj++;                     /* increment number of employee objects every time in the constructor */
	}
		
	public boolean isEligibleForRetirement()
	{  
		/* instance method returns "true" if an employee is eligible for retirement, "false" if not. */
		/*To be eligible for retirement, the sum of age and years of service needs to be greater than 60 */
		double sum = age + yearsOfService;  
		if (sum > 60) return true;
		else return false;
	}

	//The GETTERS
	public String getName(){return name;}    														                // display employee name 
	public int getAge(){return age;	}																				// display employee Age 
	public double getYearOfService(){return yearsOfService;} 														//display employee years of service
	static int getNumberOfEmployeeObjects() {return numEmployeeObj;}												//get how many employee created
	//THE SETTERS
	public void setName(String newName){name = newName;}															//set employee name
	public void setAge(int newAge){age = newAge;}  																	//set employee Age
	public void setYearOfService(double newEmployeeYearsOfService){	yearsOfService = newEmployeeYearsOfService;}	 //set employee years of service

}
