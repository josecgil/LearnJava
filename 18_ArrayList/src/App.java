import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		/*
			The ArrayList class allows us to work with collections of objects
			similar to the arrays but more easily

			Benefits:
		        1. It hasn't a maximum predetermined size. It reserves more memory space as you need it
		        2. It includes a number of common method which allow operations with collections
		*/
		
		//You must declare the type of values it can store
		//(Integer in this case)
        ArrayList<Integer> aNumberList = new ArrayList<Integer>();
        aNumberList.add(19);
        aNumberList.add(76);
        aNumberList.add(9);
        aNumberList.add(23);
        aNumberList.add(456);
        aNumberList.add(3);

        //you can add repeated items
        aNumberList.add(3);


        //Gets the value of the first position
        int numero=aNumberList.get(0);

        //change the value of the first position to 2
        aNumberList.set(0, 2);

        //gets the size of the values in the list
        int cantidadNums=aNumberList.size();


        //Remove the first element
        aNumberList.remove(0);

        //check if an element is in the list
        boolean contains9 = aNumberList.contains(9); //contains9=true
        boolean contains5 = aNumberList.contains(5); //contains5=false

        //returns the index of the value in the list
        int position9=aNumberList.indexOf(9); //position9=1

        
        //To sort & reverse we use the Collections class, passing our list
        //sort the results
        Collections.sort(aNumberList);

        //reverse the current order of the elements
        Collections.reverse(aNumberList);
        
        //you can use for to iterate the list in a simple way
		System.out.println("-");
        for (int item:aNumberList) {
        		System.out.println(item);
        }
        
	}
}