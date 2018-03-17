
public class MovablePoint extends Point{
	private float xSpeed;
	private float ySpeed;
	
	public MovablePoint() {
		xSpeed = 0.0f;
		ySpeed = 0.0f;
	}
	
	public MovablePoint(float xSpeed,float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public MovablePoint(float x,float y,float xSpeed,float ySpeed) {
		super.setXY(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float getXSpeed() {
		return xSpeed;
	}
	
	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	public float getYSpeed() {
		return ySpeed;
	}
	
	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xSpeed,float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed() {
		float[] results = new float[2];
		
		results[0] = xSpeed;
		results[1] = ySpeed;
		
		return results;
	}
@Override	
	public String toString() {
		return String.format("%s,speed=(%.1f,%.1f)", super.toString(),xSpeed,ySpeed);
	}

 	public MovablePoint move() {
 		super.setX(getX()+xSpeed);//cannot write super.setX(x+xSpeed) as x is invisible in the subclass
 		super.setY(getY()+ySpeed);
 		return this;
 	}
}
