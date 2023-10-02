package day06_operators;

public class Task4 {

	public static void main(String[] args) {
		
//	    BMI Calculator: 
//	    Write a Java program that calculates the Body Mass Index (BMI) of a person
//	    based on their weight and height using arithmetic operators.
//	    // Calculate BMI using arithmetic operators
//	            double bmi = weight / (height * height);
		
		// Ternary Operator
		// variable = (Condition) ? true block : false block;
		double weight = 180;
		double height = 5.8;
				
		double bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		
		String msg = (bmi < 18.5 ) ? "Underweight" : "";
		String msg2 =  (bmi > 18.5 && bmi < 24.9) ? "Normal weight" : "";
		String msg3 =  (bmi > 25 && bmi < 29) ? "Overweight" : "";
		
		System.out.println(msg);
		

	}

}
