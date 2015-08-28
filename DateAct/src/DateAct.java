import java.text.DateFormat;
import java.util.Date;

public class DateAct {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat today = DateFormat.getDateInstance(DateFormat.LONG);
		String formattedDate = today.format(now);
		System.out.println("Today is " +formattedDate);
		DateFormat format = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println("The time is " + format.format(now));
	}

}