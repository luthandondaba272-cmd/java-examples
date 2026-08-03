import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateExample
{
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		LocalDate birth = LocalDate.of(2007,06,28);
		Period age = Period.between(birth,today);
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy");
		System.out.println("Today:" + today.format(fmt));
		System.out.println("Time:" + now);
		System.out.println("Age:" + age.getYears() + "years");
	}
}