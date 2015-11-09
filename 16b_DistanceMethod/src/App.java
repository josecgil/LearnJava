
public class App {

	public static void main(String[] args) {
		//Change the last assignment to move the calculation of
		//the distance as a method of the Point class
		Point bcn=new Point(10,10);
		Point paris=new Point(11,0);

		//Ask the Bcn point what's the distance between himself and Paris
		//When the function is inside a class it's called a "method"
		//So we say "Point class has a distanceTo method"
		double distanceBcnToParis=bcn.distanceTo(paris);
		System.out.println(distanceBcnToParis);

		/*
		 * As we see, a class not only has data, also has functions (methods)
		 * that use this data. 
		 * 
		 * So, our definition of class must change:
		 *
		 * 		A class is structure that stores data and 
		 * 		has methods that allows to manipulate or use this data
		 * 
		 */
		
	}

}
