import java.time.LocalDate;

public class ReservationApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator\n");
		boolean condition = true;
		while (condition) {
			Reservation userReservation = new Reservation();
			userReservation.setArrivalDate(getDate("Arrival"));
			userReservation.setDepartureDate(getDate("Departure"));
			userReservation.display();
			condition = Console.promptToContinue("Continue? (y/n) : ");
//			String s = Console.getString("type a letter");
//			System.out.println(s);
		}
	}
	
	public static LocalDate getDate(String type) {
		int month = Console.getInt("Enter the "+type+" month (1-12) : ", 0, 13);
		int day=0;
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			day = Console.getInt("Enter the "+type+" day (1-31) : ", 0, 32);
		} else if (month==2) {
			day = Console.getInt("Enter the "+type+" day (1-28) : ", 0, 29);
		} else {
			day = Console.getInt("Enter the "+type+" day (1-30) : ", 0, 31);
		}
		int year = Console.getInt("Enter the "+type+" year: ");
		return LocalDate.of(year, month, day);
	}

}
