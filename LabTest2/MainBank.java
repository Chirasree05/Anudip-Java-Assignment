package LabTest2;

public class MainBank {

	public static void main(String[] args) {
		//create the instances of BankA,BankB and BankC
		Bank bA=new BankA();
		Bank bB=new BankB();
		Bank bC=new BankC();
		//Print the methods
		System.out.println("The amount deposited in Bank A: "+(bA.getBalance()));
		System.out.println("The amount deposited in Bank B: "+(bB.getBalance()));
		System.out.println("The amount deposited in Bank C: "+(bC.getBalance()));

	}

}
