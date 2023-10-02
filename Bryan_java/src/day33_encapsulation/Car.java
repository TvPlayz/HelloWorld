package day33_encapsulation;

public class Car {

	
// 	instance variables	
	private String make;
	private String model;
	private int year;
	private String color;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make1) {
		make = make1;
	}
	
	public String getModel() {
        return model;
    }
    
	public void setModel(String model1) {
        model = model1;
    }
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year1) {
		year = year1;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color1) {
		color = color1;
	}
	
	
	
	
    
    
	
	public Car() {} // no arguments constructor
	
	// parameterized constructor
	
	public Car (String make1) {
		make = make1;
	}
	
	public Car(String make1, String model1, int year1, String color1) {
		make = make1;
		model = model1;
		year = year1;
		color = color1;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
	}
	
	
}
