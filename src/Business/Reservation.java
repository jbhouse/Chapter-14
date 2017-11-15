package Business;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private double rate = 145.00;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
	
	public LocalDate getArrivalDate() {
		return this.arrivalDate;
	}
	public String getArrivalDateFormatted() {
		return this.arrivalDate.format(formatter);
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return this.departureDate;
	}
	public String getDepartureDateFormatted() {
		return this.departureDate.format(formatter);
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public int getNumberOfNights() {
		return Period.between(this.departureDate, this.arrivalDate).getDays();
	}
	public String getPricePerNightFormatted() {
		return currency.format(rate);
	}
	public double getTotalPrice() {
		return getNumberOfNights()*rate;
	}
	public String getTotalPriceFormatted() {
		return currency.format(this.getTotalPrice());
	}
	public void display() {
		System.out.println(this.getArrivalDateFormatted());
		System.out.println(this.getDepartureDateFormatted());
		System.out.println(this.getPricePerNightFormatted());
		System.out.println(this.getTotalPriceFormatted());
	}
	
}
