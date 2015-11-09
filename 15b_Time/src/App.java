
public class App {

	public static void main(String[] args) {
		/*
		Create a class "Time" that allows us to create a time from hour, min, sec (in numbers) 
		and return the time in a human string format hh:mm:ss 
		We do not want to allow the creation of a Time class without all his properties
		(hours, minutes and seconds).
		
		Example:
		*/
        Time time = new Time(9,20,0); //9 hours, 20 min, 0 secs
        String humanTime = time.toHumanString(); //humanTime="09:20:00"

        System.out.println(humanTime);
	}

}
