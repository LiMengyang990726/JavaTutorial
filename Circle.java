
public class Circle {
	private double radius = 1.0;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return String.format("Circle[radius=%.1f]", radius);
	}
}
