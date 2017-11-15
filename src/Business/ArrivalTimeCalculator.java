package Business;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ArrivalTimeCalculator {

	LocalDate ArrivalDate;
	LocalTime ArrivalTime;
	double hours;
	double minutes;
	//////////////////////////////////////////
	public ArrivalTimeCalculator() {
		
	}
	//////////////////////////////////////////
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public LocalDate getArrivalDate() {
		return ArrivalDate;
	}
	public String getFormattedArrivalDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return ArrivalDate.format(formatter);
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public LocalTime getArrivalTime() {
		return ArrivalTime;
	}
	public String getFormattedArrivalTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		return ArrivalTime.format(formatter);		
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public double getMinutes() {
		return minutes;
	}
	public void setMinutes(double minutes) {
		this.minutes = minutes;
	}

	public void calculateTravel(String date, String time, double miles, double speed) {
		long extraMinutes = (long) Math.ceil((miles/speed)*60);
		this.ArrivalDate = LocalDate.parse(date);
		this.ArrivalTime = LocalTime.parse(time).plusMinutes(extraMinutes);
		this.hours = Math.floor((miles/speed)%60);
		this.minutes = Math.ceil(((miles/speed)-Math.floor((miles/speed)%60))*60);
	}
	
}
