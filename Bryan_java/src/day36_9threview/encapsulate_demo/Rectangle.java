package day36_9threview.encapsulate_demo;

public class Rectangle {

	int width;
	int length;
	private double pricePerSqft;
	
	public Rectangle (int width, int length, double pricePerSqft) {
		this.width = width;
		this.length = length;
		this.pricePerSqft = pricePerSqft;
		
		
	}
	
	public int getArea() {
		return this.width * this.length;
	}
	
	public double getTotalPrice() {
		return getArea() * pricePerSqft;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getPricePerSqft() {
		return pricePerSqft;
	}

	public void setPricePerSqft(double pricePerSqft) {
		this.pricePerSqft = pricePerSqft;
	}
	
	
	
	
	
}
