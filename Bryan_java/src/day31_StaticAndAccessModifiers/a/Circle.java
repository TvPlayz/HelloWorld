package day31_StaticAndAccessModifiers.a;

public class Circle {
	 /*
    1. create a custom class called Circle
                Attributes:
                    radius, diameter, area, perimeter

                methods:
                    calculateArea: returns the area of the circle

                    calculatePerimeter: returns the perimeter of the circle

                    setInfo: initializes all the instance of the Circle

                    toString methods
     */
	
//	String
	
	public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;

    }

    public void setInfo(double radius, double diameter) {
//        this.radius = radius;
//        this.diameter = diameter;
    }
}
//    
//    public String toStringmethod() {
//        String msg = "Area of circie is: " + area + " and perimeter is " + perimeter;
//        return msg;
//    }
//}
