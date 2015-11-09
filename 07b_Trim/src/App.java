// Create 3 functions

// 1 - Remove spaces from the beginning of a string. Example: "    hello world" -> "hello world"
// 2 - Remove trailing spaces from a string. Example: "hello world    " -> "hello world"
// 3 - Remove spaces from the beginning and end of a string. Example: "    hello world     " -> "hello world"

public class App {

    private static String RemoveSpacesLeft(String str) {
        String newStr = "";
        //Once the first non-space character is found, do not check more, 
        //add the remaining characters
        boolean firstCharFound = false;        
        for (int i = 0; i < str.length(); i++)
        {
            char caracter = str.charAt(i);
            if ( (caracter == ' ') && (!firstCharFound) ) {
                // move to the next iteration of the
            		//loop without adding any characters
                continue;
            }
            firstCharFound=true;
            newStr = newStr + caracter;
        }
        return newStr;
    }

    //same as above, but starting the loop from the end to the beginning
    private static String RemoveSpacesRight(String str)
    {
        String newStr = "";
        //Once the first non-space character is found, do not check more, 
        //add the remaining characters
        boolean firstCharFound = false;
        
        for (int i = str.length()-1; i >= 0; i--)
        {
            char caracter = str.charAt(i);
            if ((caracter == ' ') && (!firstCharFound))
            {
                // move to the next iteration of the loop without adding any characters
                continue;
            }
            firstCharFound = true;
            // add the character first, as we walk the string backwards       
            newStr = caracter+ newStr ; 
        }
        return newStr;
    }

    private static String RemoveSpaces(String str)
    {
        String newStr = RemoveSpacesLeft(str);
        newStr = RemoveSpacesRight(newStr);
        return newStr;
    }
	
	
	public static void main(String[] args) {
        System.out.println("'" + RemoveSpacesLeft("   Hello world!    ") + "'");
        System.out.println("'" + RemoveSpacesRight("   Hello world!     ") + "'");
        System.out.println("'" + RemoveSpaces("   Hello world!     ") + "'");
	}

}
