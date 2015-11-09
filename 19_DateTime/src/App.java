import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) throws ParseException {
		/*
		 * This is the current preferred way to know the current date
		 */
		Calendar nowCal=Calendar.getInstance();
		System.out.println("Day  : "+nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month: "+(nowCal.get(Calendar.MONTH)+1));
		System.out.println("Year : "+nowCal.get(Calendar.YEAR));
		System.out.println("Hour : "+nowCal.get(Calendar.HOUR));
		System.out.println("Min  : "+nowCal.get(Calendar.MINUTE));
		System.out.println("Sec  : "+nowCal.get(Calendar.SECOND));
		
		/*
		 * The other important class is Date, is an older, more deprecated class
		 * Usable to store Date/Time info and to use some other classes that
		 * requires a Date instead of Calendar
		 * You can convert a Calendar to a Date with the .getTime() method of the 
		 * Calendar class.
		 * Or you can create a new Date()
		 */
		Date dateFromCal = nowCal.getTime(); //convert Calendar to Date
		
		Date aNewDate = new Date(); //Stores the current Date/time
		
		//http://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(dateFormat.format(dateFromCal));

		//This is how to parse a Date from String
		Date otherDate=dateFormat.parse("2020-01-22 00:00:00"); //Stores the 2020/01/22 00:00:00
		System.out.println(dateFormat.format(otherDate));

		
		/*
		 * Set a day in the future
		 */
		Calendar dateInTheFuture=Calendar.getInstance();
		dateInTheFuture.set(Calendar.DAY_OF_MONTH, 1);
		dateInTheFuture.set(Calendar.MONTH, 0);
		dateInTheFuture.set(Calendar.YEAR, 2020);

		System.out.println(dateFormat.format(dateInTheFuture.getTime()));

		
		/*
		 * Adds 30 days to the current date
		 */

		Calendar thirtyDaysFromNow=Calendar.getInstance();
		thirtyDaysFromNow.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println(dateFormat.format(thirtyDaysFromNow.getTime()));
		
		/*
		 * Subtract 20 hours to the current date
		 */
		
		Calendar twentyHoursInThePast=Calendar.getInstance();
		twentyHoursInThePast.add(Calendar.HOUR, -20);
		System.out.println(dateFormat.format(twentyHoursInThePast.getTime()));
		
	}
}
