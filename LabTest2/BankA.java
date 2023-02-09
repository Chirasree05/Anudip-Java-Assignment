package LabTest2;
//Inheritance---parent class Bank inherit to child class BankA
public class BankA extends Bank{
	//override the abstract method
	@Override
	public int getBalance() {
		
		return 1000;
	}

}
