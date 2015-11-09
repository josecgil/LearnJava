
public class App {

	public static void main(String[] args) {
		/*		
			Implement a isBefore method in time that can know if a 
			time happens before another time		
		*/
		
        Time firstTrainOfTheDay = new Time(8,20,0); //8 hours, 20 min, 0 secs
        Time secondTrainOfTheDay = new Time(8,40,0); //8 hours, 40 min, 0 secs
        
        boolean isBefore=firstTrainOfTheDay.isBefore(secondTrainOfTheDay); //isBefore=true
        
        /*
        		TODO for advanced students:
        		
        			Create a constructor to create times with human strings:
        			Time alarm=new Time("09:50:00");
        			
        			Create an isAfter(Time) and isEqual(Time) methods
        		
         */
        
        System.out.println(isBefore);
	}

}
