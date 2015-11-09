import java.util.Scanner;

public class App {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
        System.out.println("Type a phrase: ");
        Scanner scanner=new Scanner(System.in);
        String phrase=scanner.nextLine();
        int countAs=countAs(phrase);
        System.out.println("This phrase has " + countAs + " A");
        scanner.close();
	}

	private static int countAs(String phrase) {
		int num=0;
		for(char c:phrase.toLowerCase().toCharArray()) {
			if (c=='a') num++;
		}
		return num;
	}

	
	
}
