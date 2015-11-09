
public class Point {
	private static int count=0;
	
	public static int count() {
		return count;
	}
	
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		count++;
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double distanceTo(Point aPoint) {
		int ax = x;
		int ay = y;
		int bx = aPoint.getX();
		int by = aPoint.getY();
		return Math.sqrt(Math.pow(bx-ax,2)+Math.pow(by-ay, 2));
	}

	
	
}
