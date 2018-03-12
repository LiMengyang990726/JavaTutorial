
public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
		
	}
	
	public MyPoint(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY(){
		int[] points = new int[2];
		points[0] = getX();
		points[1] = getY();
		return points;
	}
	
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%d,%d)", x,y);
	}
	
	public double distance(int x,int y) {
		double distance = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
		return distance;
	}
	
	public double distance(MyPoint another) {
		int anotherX;
		int anotherY;
		double distance;
		
		anotherX = another.getX();
		anotherY = another.getY();
		
		distance = Math.sqrt((x-anotherX)*(x-anotherX)+(y-anotherY)*(y-anotherY));
		
		return distance;
	}
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
}
