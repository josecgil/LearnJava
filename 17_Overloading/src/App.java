
public class App {

	public static void main(String[] args) {
		/*
		 * In OOP 'overload' is a term that refers to the possibility of having two or more methods
		 * with the same name but different functionality.
		 * That is, two or more methods with the same name that perform different actions.
		 * The compiler will use one or another depending on the parameters and types of the caller
		 */

		BankAccount account = new BankAccount(); //we use the empty constructor
        account.deposit(100); //it will call the deposit(int) method
        account.deposit(25.5); //it will call the deposit(double) method
        account.deposit(230.9, "dollar"); //it will call the deposit(double, String) method
	}

}
