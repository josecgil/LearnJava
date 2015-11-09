//Calculate the first N prime numbers

public class App {
	
	//First 100 prime numbers
	boolean isPrime=isPrime(1);
	
	
	
	
	
	
	
    private static boolean isPrime(int number)
    {
        if (number == 1) return true;
        if (number == 2) return true;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
        int maxNumber = 200000;
        System.out.println("Prime numbers <= "+maxNumber+":");
        System.out.println();

        for (int i = 1; i < maxNumber; i++)
        {
            if (isPrime(i)==true) //Is the same as if (isPrime(i))?
            {
            		System.out.print(i);
            		System.out.print("\t");
            }
        }
	}

}
