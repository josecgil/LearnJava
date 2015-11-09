public class App {

	public static void main(String[] args) throws Exception {
		char option=(char)System.in.read();
		switch(option){
			case '1':
				System.out.println("Hello my master");
				break;
			case '2':
				System.out.println("Hello teacher");
				break;
			default:
				System.out.println("Hello");
		}
	}

}
