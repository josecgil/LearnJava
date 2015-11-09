
public class App {

	public static void main(String[] args) {
		//Create a Point class with
		
		//2 private fields: "x" and "y" (integer)
		
		//A constructor (x,y)
		Point originPoint=new Point(10,10);
		
		//public methods:
		originPoint.getX();
		originPoint.getY();
		
		originPoint.moveX(2); //now originPoint.getX() returns 12
		originPoint.moveY(-3); //now originPoint.getY() returns 7
		
		originPoint.move(-2, 3); //now originPoint.getX() .getY() returns 10
		
		System.out.println(originPoint.getX());
		System.out.println(originPoint.getY());
	}

}
