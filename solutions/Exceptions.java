public class Exceptions {
	private static int divideElements (int[] array, int i, int j) {
		/*
		 * Write a method that--using try-catch blocks--returns array[i] / array[j].
		 * If division by zero is encountered or either indices are out of bounds, return -1.
		 */

		try {
			return array[i] / array[j];
		} catch (ArithmeticException e) {
			return -1;
		} catch (IndexOutOfBoundsException e) {
			return -1;
		}
	}

	public static void main (String args[]) {
		int[] array = new int[]{0, 1, 2, 3};

		System.out.println(divideElements(array, 3, 1));
		System.out.println(divideElements(array, 2, 0));
		System.out.println(divideElements(array, 4, 1));
	}
}