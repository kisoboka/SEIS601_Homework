//****************************************************************************************
//  Person.java        SEIS601-02 Foundation Of Software Development Java
//
//  Homework - Inheritance
//
//  Author: Felix Adekola        
//  Due Date: April 18, 2018 by 5;45pm
//*****************************************************************************************

//Implement Class Person(abstract superclass). 
/*Used as the parent of a derived class*/
public abstract class Person {
	protected int id;  //protected member variable id of type int.
	
    //  Constructor: initializes id
	public Person(int newid)
	{
		setID(newid); 
	}
	
	public void setID(int newID) 
	{
		this.id = newID;
	}

}
