import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
        System.out.println("Type a phrase: ");
        Scanner scanner=new Scanner(System.in);
        String phrase=scanner.nextLine();
        int wordCount = countWords(phrase);
        System.out.println("This phrase has " + wordCount + " words");
        scanner.close();
	}
	
    private static String removeStrangeChars(String phrase)
    {
        String newStr = phrase.replace('¿', ' ');
        newStr = newStr.replace('?', ' ');
        newStr = newStr.replace('!', ' ');
        newStr = newStr.replace('¡', ' ');
        newStr = newStr.replace('.', ' ');
        newStr = newStr.replace(',', ' ');
        newStr = newStr.replace(':', ' ');
        newStr = newStr.replace(';', ' ');
        newStr = newStr.replace('(', ' ');
        newStr = newStr.replace(')', ' ');
        newStr = newStr.replace('[', ' ');
        newStr = newStr.replace(']', ' ');
        newStr = newStr.replace('{', ' ');
        newStr = newStr.replace('}', ' ');
        newStr = newStr.replace('"', ' ');
        newStr = newStr.replace('\'', ' ');
        newStr = newStr.replace('-', ' ');
        newStr = newStr.replace('=', ' ');
        newStr = newStr.replace('\\', ' ');
        return newStr;
    }

    private static String removeExtraSpaces(String phrase)
    {
        while (phrase.indexOf("  ") != -1)
        {
            phrase = phrase.replace("  ", " ");
        }
        phrase = phrase.trim();
        phrase = phrase + " ";
        return phrase;
    }

    private static int countSpaces(String phrase)
    {
        int wordCount = 0;
        for (int i = 0; i < phrase.length(); i++)
        {
            if (phrase.charAt(i) == ' ')
            {
                wordCount++;
            }
        }
        return wordCount;
    }
    
    private static int countWords(String phrase)
    {
        phrase = removeStrangeChars(phrase);
        phrase = removeExtraSpaces(phrase);
        int wordCount = countSpaces(phrase);
        return wordCount;
    }
    
}
