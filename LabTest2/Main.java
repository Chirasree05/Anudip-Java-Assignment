package LabTest2;

public class Main {

	public static void main(String[] args) {
		//create the instance of Area class
		Shape s=new Area(30,15,12,8);
		//call the methods through instance
		s.rectangleArea();
		s.squareArea();
		s.circleArea();

	}

}
