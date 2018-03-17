
public class Point {
	private float x;
	private float y;
	
	public Point() {
		x = 0.0f;
		y = 0.0f;
	}
	
	public Point(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY() {
		float[] result = new float[2];
		
		result[0] = x;
		result[1] = y;
		
		return result;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}
