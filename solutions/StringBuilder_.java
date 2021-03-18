public class StringBuilder_ {
	public static String buildString () {
		// Modify the following method to use a StringBuilder.

		// String s = "";

		// s += "Hello,";
		// s += " world!";

		// s = s.substring(0, 7) + "Java!";
		// s = s.substring(0, 7) + "dear " + s.substring(7);

		// return s;

		StringBuilder sb = new StringBuilder();

		sb.append("Hello,");
		sb.append(" world!");

		sb.replace(7, 12, "Java");
		sb.insert(7, "dear ");

		return sb.toString();
	}

	public static void main (String[] args) {
		System.out.println(buildString());
	}
}