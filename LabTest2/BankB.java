package LabTest2;
//Inheritance---parent class Bank inherit to child class BankB
public class BankB extends Bank{
	//override the abstract method
	@Override
	public int getBalance() {
		
		return 1500;
	}

}
