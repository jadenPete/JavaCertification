public class Bytes {
	public static int byteMultiple (int i, int j) {
		// Write a method that adds an int i to itself j times such that it overflows at 256.
		// Can you think of a way to do so without a loop?
		// Can you think of a way to do so without conversions?
	}

	public static void main (String[] args) {
		System.out.println(byteMultiple(127, 11));
		System.out.println(byteMultiple(63, 5));
		System.out.println(byteMultiple(31, 5000));
	}
}