package base;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double P;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	Triangle myTriangle = new Triangle(side1, side2, side3);
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

	private Triangle getMyTriangle() {
		return myTriangle;
	}

	private void setMyTriangle(Triangle myTriangle) {
		this.myTriangle = myTriangle;
	}

	public double getArea() {
	
		return Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));
	}
	public double getPerimeter() {
		P = side1 + side2 + side3;
		return P;
	}

	public String toString() {
		return "Triangle has sides of " + side1 + ", " + side2 + ",and " + side3;
	}
}
