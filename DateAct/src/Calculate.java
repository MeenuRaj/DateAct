import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Calculate {
	
	public long calculate(int year, int month, int day)
	{
		Calendar calendar = new GregorianCalendar(year, month, day);
		Calendar now = new GregorianCalendar();
		Date startDate = calendar.getTime();
		Date endDate = now.getTime();
		long startDateMS = startDate.getTime();
		long endDateMS = endDate.getTime();
		long elapsedMS = endDateMS - startDateMS;
		long elapsedDays = elapsedMS / (24*60*60*1000);
		return elapsedDays;
	}

}
