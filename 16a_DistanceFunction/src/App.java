
public class App {

	public static void main(String[] args) {
		//Create a function to calc the distance between two points
		
		//http://www.mathwarehouse.com/algebra/distance_formula/index.php
		
		//distance between point a and point b
		//distance=√( (x2−x1)^2+(y2−y1)^2 )
		Point bcn=new Point(10,10);
		Point paris=new Point(11,0);
		double distanceBcnToParis=distanceTo(bcn, paris);
		System.out.println(distanceBcnToParis);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	private static double distanceTo(Point a, Point b) {
		int ax = a.getX();
		int ay = a.getY();
		int bx = b.getX();
		int by = b.getY();
		return Math.sqrt(Math.pow(bx-ax,2)+Math.pow(by-ay, 2));
	}

}
