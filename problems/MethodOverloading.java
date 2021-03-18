public class MethodOverloading {
	// Write three "plus" methods that add two bytes, ints, or doubles

	public static void main (String[] args) {
		byte x1 = 54;
		byte y1 = 38;

		int x2 = 1001;
		int y2 = 452;

		double x3 = 3.14159;
		double y3 = 2.71828;

		System.out.println(plus(x1, y1));
		System.out.println(plus(x2, y2));
		System.out.println(plus(x3, y3));
	}
}