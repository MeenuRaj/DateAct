import java.util.Random;
public class Generate {

	public String answer()
	{
		
			Random r = new Random();
			int choice = 1 + r.nextInt(5);
			String weather = "";
			
			if ( choice == 1 )
				weather = "It was a sunny day with average temperate was 82 degrees!";
			else if ( choice == 2 )
				weather = "It was a bleak rainy day, and the average temperate was 56 degrees.";
			else if ( choice == 3 )
				weather = "It was cloudy cloudy cloudy, with an average temperate of 68 degrees.";
			else if ( choice == 4 )
				weather = "There was a terrible snowstorm that day!! The temperature was in the low 20s which a windchill of 20 degrees.";
			else
				weather = "The weather was a cool 72 degrees.";
			return weather;
	}
	
	
}
