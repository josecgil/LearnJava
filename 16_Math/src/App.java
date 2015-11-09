
public class App {

	public static void main(String[] args) {
		//The Math class provides functions and constants to work with more advanced Maths
		
		//Constants
		double E=Math.E;
		double PI=Math.PI;
		
		//trigonometric calculations
		double cosine=Math.cos(Math.PI); ///cosine=-1		
		double sine=Math.sin(0); //sine = 0.0		
		double tangent=Math.tan(0); //tangent = 0.0
		
		
		//"Round" calculations
		double abs=Math.abs(-3.7); //value without the sign. abs=3.7 
		double roundedToNext=Math.round(2.5); //roundedToNext = 3.0  >=.5 to next integer
		double roundedToPrev=Math.round(2.4); //roundedToPrev = 2.0  <.5 to prev integer
		double ceil=Math.ceil(2.5); //ceil = 3.0  converts to closest upper integer
		double floor=Math.floor(2.5); //ceil = 2.0  converts to closest lower integer

		//min-max
		double max=Math.max(10, 20); //max=20.0
		double min=Math.min(10, 20); //min=10.0
		
		//Square & power
		double squareRoot=Math.sqrt(4); //squareRoot = 2.0
		double pow=Math.pow(2, 3); //same as 2^3=2*2*2. pow=8
		
		System.out.println(pow);
	}

}
