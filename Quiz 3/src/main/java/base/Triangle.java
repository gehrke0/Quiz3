package base;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double P;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	private double getSide1() {
		return side1;
	}

	private void setSide1(double side1) {
		this.side1 = side1;
	}

	private double getSide2() {
		return side2;
	}

	private void setSide2(double side2) {
		this.side2 = side2;
	}

	private double getSide3() {
		return side3;
	}

	private void setSide3(double side3) {
		this.side3 = side3;
	}


	public double getArea() {
		double hP = this.getPerimeter()/2;
		return Math.sqrt(hP * (hP - side1) * (hP - side2) * (hP - side3));
	}
	public double getPerimeter() {
		P = side1 + side2 + side3;
		return P;
	}

	public String toString() {
		return "Triangle has sides of " + side1 + ", " + side2 + ",and " + side3;
	}
}
