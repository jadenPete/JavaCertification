public class StringBuilder_ {
	public static String buildString () {
		// Modify the following method to use a StringBuilder.

		String s = "";

		s += "Hello,";
		s += " world!";

		s = s.substring(0, 7) + "Java!";
		s = s.substring(0, 7) + "dear " + s.substring(7);

		return s;
	}

	public static void main (String[] args) {
		System.out.println(buildString());
	}
}