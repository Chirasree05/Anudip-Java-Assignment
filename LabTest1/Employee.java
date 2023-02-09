package LabTest1;
public class Employee extends Person{
	//instance variables
	private String e_id;
	private String dept;
	private int salary;
	
	//default constructor
	public Employee() {
		super();
		
	}
	//parameterized constructor
	public Employee(String e_id, String dept, int salary) {
		super();
		this.e_id = e_id;
		this.dept = dept;
		this.salary = salary;
	}
	//to display the information
	public void displayEmp()
	{
		System.out.println("Employee id :"+e_id);
		System.out.println("Department :"+dept);
		System.out.println("salary :"+salary);
	}
	

}
