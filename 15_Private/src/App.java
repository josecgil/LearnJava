
public class App {

	public static void main(String[] args) {
		
		/*
			Methods and variables can have modifiers to indicate 
			the type of access you allow from outside of the class
			These access keywords (for now) are:
			
				public - access allowed from the outside
				private - access permitted only from within the class
			        
			These mechanisms allows us to hide irrelevant details
			(the one's you don't want other programmers to have access)
			
			This concept is called "Encapsulation"

			Encapsulation is the packing of data and functions into a single component, 
			selectively hiding properties and methods of a class by building an impenetrable wall 
		*/
		
		Client client1=new Client("Connor, Sara");
		//client1.name  //not possible now		
		client1.getName();
		client1.getFullName();
		
	}

}
