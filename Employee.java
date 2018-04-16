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
	
	//private String name;  int age, numEmployeeObj;  double yearsOfService;  						
	
	String name;     						/*The class should contain instance variables for employee's name, age, yearsOfService*/
	private int age;						/*allow access only through method call*/
	private double yearsOfService;
	
	static int numEmployeeObj = 0;          /* The class should also keep track of the number of employee objects created using a STATIC VARIABLE.*/ 
	
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
		setName(newName);
		setAge(newAge);
		setYearOfService(newYearsOfService);
		numEmployeeObj++;                     /* increment number of employee objects every time in the constructor */
	}
	
	public boolean isEligibleForRetirement()
	{  
		/* instance method returns "true" if an employee is eligible for retirement, "false" if not. */
		/*To be eligible for retirement, the sum of age and years of service needs to be greater than 60 */
		
		/* double sum = age + yearsOfService;  
		if (sum > 60) return true;
		else return false; */
		
		//rev 1.1: shorter code
		return age + yearsOfService > 60;  

	}
	
	//THE SETTERS
	public void setName(String newName){name = newName;}															//set employee name
	public void setAge(int newAge){age = newAge;}																	//set employee Age
	public void setYearOfService(double newEmployeeYearsOfService){	yearsOfService = newEmployeeYearsOfService;}	//set employee years of service
	
	
	
	//The GETTERS
	public String getName(){return name;}    														                 
	public int getAge(){return age;	}																				// display employee Age 
	public double getYearOfService(){return yearsOfService;} 														//display employee years of service
	static int getNumberOfEmployeeObjects() {return numEmployeeObj;}												//get how many employee created
	public int getID(){return id;	}																				// display employee id 
	
	//overrides equals method of the Object class that compares two employees.
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		/* Two employees are the same if they have same id and name*/
		return emp.id == id && emp.name.equals(name);
	}
}

/* Revision 
 * 1.0 initial submission
 * 1.1 simplified isEligibleForRetirment implementation: 
 * return age + yearsOfService > 60
 * instead of using if-else block
 * 1.3 Implemented inheritance
 * overrides java.lang.Object.equals 
 *  */
