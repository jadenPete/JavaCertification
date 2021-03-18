import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static String formatDateTime () {
		// Write a method that returns a String formatted as:
		//	"Today is day (day of the month) of (month). It is (time)."

		Date date = new Date();

		String day = new SimpleDateFormat("dd").format(date);
		String month = new SimpleDateFormat("MMMM").format(date);
		String time = new SimpleDateFormat("h:m:s a").format(date);

		return "Today is day " + day + " of " + month + ". It is " + time + ".";
	}

	public static void main (String[] args) {
		System.out.println(formatDateTime());
	}
}