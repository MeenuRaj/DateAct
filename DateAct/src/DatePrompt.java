import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePrompt {

	public String readDate(int year, int month, int day)
	{
		Calendar calendar = new GregorianCalendar(year, month, day);
		Calendar now = new GregorianCalendar();
		String dayis = "";
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek == 1)
				dayis = "That was a Sunday.";
			else if(dayOfWeek == 2)
				dayis = "That was a Monday.";
			else if(dayOfWeek == 3)
				dayis = "That was a Tuesday.";
			else if(dayOfWeek == 4)
				dayis = "That was a Wednesday.";
			else if(dayOfWeek == 5)
				dayis = "That was a Thursday.";
			else if(dayOfWeek == 6)
				dayis = "That was a Friday.";
			else
				dayis = "That was a Saturday.";
			return dayis;	
	}
		
}
