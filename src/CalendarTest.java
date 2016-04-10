import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarTest {
	
	public static void main(String[] args){
		//construct d as current date
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		// set d to start date of the month
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		// get first day of week (Sunday in the U.S.)
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		// determine the required indentation for the first line
		int indent = 0;
		
		while(weekday != firstDayOfWeek){
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
	}
	public CalendarTest() {
		// TODO Auto-generated constructor stub
	}

}
