
public class App {

	public static void main(String[] args) {
		/*
			The static modifier is used to indicate that a method, variable or property doesn't belong
			to every object of that class (each instance) but to the class itself.
			This means that to use a method or static variable isn't necessary to instantiate an object
			Examples of static methods of different classes:
		*/

		//Isn't necessary to do Math math=new Math(); before calling sqrt()
		double result = Math.sqrt(2); 

		//Isn't necessary to do Character c = new Character(); and then c.IsLetter();
        boolean isLetter = Character.isLetter('g');

        /*
         	Static methods make sense when operations do not depends on the data stored in an object.
         	
         	Variables and static properties may only use variables, properties and methods of the class
         	that are also static methods
         	
         	Variables and properties they are not static can use statics normally
         	
         	static void main() method is static because it is impossible that and object exists before
         	it's execution. It's the entry point of the program, the first method to be called
         */
        
        /* 
         	An Example
         	Let's modify the Point Class to know how many Point are in our Program
         */
        
        System.out.println("Number of points created so far:"+Point.count());

        //We create 3 points       
        Point p1=new Point(1,1);
        Point p2=new Point(2,2);
        Point p3=new Point(3,3);

        System.out.println("Number of points created so far:"+Point.count());
	}

}
