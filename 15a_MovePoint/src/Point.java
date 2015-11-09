
public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveX(int delta) {
		x=x+delta;
	}
	
	public void moveY(int delta) {
		y=y+delta;
	}

	public void move(int deltaX, int deltaY) {
		x=x+deltaX;
		y=y+deltaY;
	}

}
