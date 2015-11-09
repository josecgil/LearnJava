public class Client {
	
	//If we set this to private, the only
	//way to set this properties is by
	//the constructor now
	private String name;
	private String surname;
	
	public Client(String fullName) {
		String[] parts=fullName.split(",");
		surname=parts[0].trim();
		name=parts[1].trim();
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getFullName() {
		String fullName=surname+", "+name;
		return fullName;
	}
	
}
