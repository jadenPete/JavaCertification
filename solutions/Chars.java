public class Chars {
	private static String incrementChars (String s) {
		// Write a method that increments the value of each character in a String s.

		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			chars[i]++;
		}

		return new String(chars);
	}

	public static void main (String[] args) {
		System.out.println(incrementChars("I`u`^hr^etm "));
		System.out.println(incrementChars("Vgdm^xnt^qdldladq^rdlhbnknmr-"));
	}
}