
public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		this.center = new MyPoint(0,0);
		this.radius = 1;
	}
	
	public MyCircle(int x,int y,int radius) {
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center,int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY() {
		int[] centers = new int[2];
		centers[0] = center.getX();
		centers[1] = center.getY();
		return centers;
	}
	
	public void setCenterXY(int x,int y) {
		center.setX(x);
		center.setY(y);
	}
	
	public void setCenter(MyPoint center) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return String.format("MyCircle[radius=%d,center=%s]", radius,center);
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public double distance(MyCircle another) {
		return center.distance(another.getCenter());
	}
}
