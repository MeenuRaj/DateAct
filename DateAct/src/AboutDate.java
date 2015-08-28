
import java.util.Scanner;


public class AboutDate 
{

	public static void main(String[] args) 
	{
		String ans = "y";
		while(ans.equalsIgnoreCase("y"))
		{
		DatePrompt date = new DatePrompt();
		Calculate numdays = new Calculate();
		Generate weather = new Generate();
		int month;
		int day;
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("What date would you like to know about?   ");
		System.out.println("What month(jan = 0 and dec = 11)? ");
		month = scan.nextInt();
		System.out.println("What day? ");
		day = scan.nextInt();
		System.out.println("What year? ");
		year = scan.nextInt();
		
		numdays.calculate(year, month, day);
		String thedate = date.readDate(year, month, day);
		String rweather = weather.answer();
		long telapsed = numdays.calculate(year, month, day);
		
		System.out.println("The day you inquired about is " +(month+1) + "/" + day + "/" + year);
		System.out.println( thedate + " " +rweather+ " " + "It was " +telapsed+ " days ago.\n" );
		
	
		System.out.println("Would you like to know about another date? (y/n)");
		ans = scan.next();
		}
		
	} 

}


