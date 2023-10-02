package day30_constructor;

public class Car {
	
//  Class − A class can be defined as a template/blueprint 
  //that describes the behavior/state that the object of its type support. 
//  Object − Objects have states and behaviors. 
  //Example: A dog has states - color, name, breed as well as behaviors – wagging the tail, 
  //barking, eating. An object is an instance of a class.
//  In Java, a class provides the blueprint for objects, you create an object from a class.

  
  // instance variables
  
  String model;
  int year;
  String color;
  String brand;
  boolean isElectric;
  
  public Car(String model1) {
	  model = model1;
  }
  
  public Car(String model1, boolean isElectric1) {
	  model = model1;
	  isElectric = isElectric1;
  }
  
  public Car(String brand1, int year1 , String color1 , String model1 , boolean isElectric1) {
	  model = model1;
	  isElectric = isElectric1;
	  year = year1;
	  color = color1;
	  brand = brand1;
	  
  }
  
  public void drive() {
      if (year > 2020) {
      System.out.println("Driving "+ year +" "+ brand + " "+ model);}
  }
  
  
  public void stop() {
      System.out.println( year +" "+ brand + " "+ model +" has stopped");
  }
  
  
  public void start() {
      System.out.println( year +" "+ brand + " "+ model +" has started");
  }
  
  public String getInfo() {
      
      String msg = "Car Class "+
                  " Model : "+ model +
                  " , Brand : "+ brand +
                  " , Color : "+ color +
                  " , Year : "+ year + 
                  " isElectric : "+ isElectric;
      return msg;
  }
  

}
