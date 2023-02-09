package LabTest1;
public class Person {
	//instance variables
	private String name;
	private byte age;
	private String address;
	private String mobilenumber;
	//default constructor
	public Person() {
		super();
		
	}
	//parameterized constructor
	public Person(String name, byte age, String address, String mobilenumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobilenumber = mobilenumber;
	}
	//to display the information
	public void display()
	{
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("Address :"+address);
		System.out.println("Mobile Number :"+mobilenumber);
	}
	

}
