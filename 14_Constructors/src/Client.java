public class Client {
	public String name;
	public String surname;
	
	/*
		 A class without constructor has an explicit constructor
		 public Client() {
		 
		 }
		 without params & code
		 
		 If a class has any constructor, it loses it's default constructor
		 unless you create a default constructor 
	 */
	
	
	//This is a "constructor", is an special method
	//without return type and with the same name
	//as the class
	public Client(String fullName) {
		String[] parts=fullName.split(",");
		surname=parts[0].trim();
		name=parts[1].trim();
	}

	public String getFullName() {
		String fullName=surname+", "+name;
		return fullName;
	}
	
}
