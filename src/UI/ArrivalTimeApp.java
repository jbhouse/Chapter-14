package UI;
import Business.ArrivalTimeCalculator;
import Business.Console;

public class ArrivalTimeApp {

	public static void main(String[] args) {
		System.out.println("Arrival Time Estimator");
		boolean condition = true;
		while (condition) {
			ArrivalTimeCalculator myCalculator = new ArrivalTimeCalculator();
			String departureDate = Console.getString("Departure date (YYY-MM-DD) : ");
			String departureTime = Console.getString("Departure time (HH:MM) : ");
			double miles = Console.getInt("Number of miles: ");
			double mph = Console.getInt("Miles per hour: ");
			myCalculator.calculateTravel(departureDate, departureTime, miles, mph);
			System.out.println();
			System.out.println("Estimated Travel Time");
			System.out.println("Hours: "+String.valueOf(myCalculator.getHours()).substring(0, 1));
			System.out.println("Minutes: "+String.valueOf(myCalculator.getMinutes()).substring(0, 1));
			System.out.println("Estimated date of arrival: "+myCalculator.getFormattedArrivalDate());
			System.out.println("Estimated time of arrival: "+myCalculator.getFormattedArrivalTime());
			System.out.println();
			condition = Console.promptToContinue("Continue? (y/n) : ");
		}
		System.out.println("Bye");
	}

}
