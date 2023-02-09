package LabTest1;
public class Main {
	public static void main(String[] args) {
		//create an instance of person class
		Person p=new Person("Chirasree Sur",(byte)21,"Kolkata","7044913166");
		//call the display function of person class using instance
		p.display();
		//create an instance of employee class
		Employee e=new Employee("A00_565","Manager",25000);
		//call the display function of employee class using instance
		e.displayEmp();
	}

}
