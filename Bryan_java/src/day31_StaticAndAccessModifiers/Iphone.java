package day31_StaticAndAccessModifiers;

public class Iphone {

    /*
    Iphone:
        attributes:
                instance: model, color, price, storage
                static: brand, operating system, madeIn, designated

     */
	
	
	String model;
	String color;
	double price;
	int storage;
	
	static String brand = "Iphone";
	static String OS = "IOS 16.12";
	static String madeId = "India";
	static String designated = "USA";
	
	
	
//public Iphone() {
//		
//	}
//
//
//
//public Iphone(String model, String color, double price, int storage) {
//	
//	this.model = model;
//	this.color = color;
//	this.price = price;
//	this.storage = storage;
//}



	public Iphone() {
		
	}
	
	public Iphone(String model1 , String color1 , double price1 , int storage1) {
		model = model1;
		color = color1;
		price = price1;
		storage = storage1;
	}
	
	
	
	@Override
	public String toString() {
		return "Iphone [model=" + model + ", color=" + color + ", price=" + price + ", storage=" + storage + "]";
	}
		
	// Create IphoneObject class and create 10 iphone and calculate total price of all the iphone.
	
	
}
