package LabTest2;
//Inheritance---parent class Bank inherit to child class BankC
public class BankC extends Bank{
	//override the abstract method
	@Override
	public int getBalance() {
		
		return 2000;
	}

}
