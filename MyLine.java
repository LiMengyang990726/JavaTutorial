
public class MyLine {
	private MyPoint begin;
	private MyPoint end;
	
	public MyLine(int x1,int y1,int x2,int y2) {
		//begin.setX(x1);
		//begin.setY(y1);
		this.begin = new MyPoint(x1,y1);
		
		//end.setX(x2);
		//end.setY(y2);
		//end.setXY(x1,y1);
		this.end = new MyPoint(x2,y2);
	}
	
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	
	public MyPoint getBegin() {
		return begin;
	}
	
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	
	public MyPoint getEnd() {
		return end;
	}
	
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	
	public void setBeginX(int x) {
		begin.setX(x);
	}
	
	public int getBeginY() {
		return begin.getY();
	}
	
	public void setBeginY(int y) {
		begin.setY(y);
	}
	
	public int getEndX() {
		return end.getX();
	}
	
	public void setEndX(int x) {
		end.setX(x);
	}
	
	public int getEndY() {
		return end.getY();
	}
	
	public void setEndY(int y) {
		end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] cordinates = new int[2];
		cordinates[0] = begin.getX();
		cordinates[1] = begin.getY();
		
		return cordinates;
	}
	
	public void setBeginXY(int x,int y) {
		begin.setX(x);
		begin.setY(y);
	}
	
	public int[] getEndXY() {
		int[] cordinates = new int[2];
		cordinates[0] = end.getX();
		cordinates[1] = end.getY();
		return cordinates;
	}
	
	public void setEndXY(int x,int y) {
		end.setX(x);
		end.setY(y);
	}
	
	public double getLength() {
		return begin.distance(end);
	}
	
	public double getGradient() {
		return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
	}
	
	public String toString() {
		return String.format("MyLine[begin=%s,end=%s]",begin,end);
	}
}