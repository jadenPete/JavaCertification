public class SwitchStatements {
	public static double calculator (double x, double y, String operation) {
		// Write an arithmetic calculating using a switch statement that supports the following (operation)s:
		// 	"add", "subtract", "multiply", "divide"

		switch (operation) {
			case "add": return x + y;
			case "subtract": return x - y;
			case "multiply": return x * y;
			case "divide": return x / y;
		}

		throw new IllegalArgumentException();
	}

	public static void main (String[] args) {
		System.out.println(calculator(1.2, 3.4, "add"));
		System.out.println(calculator(9.2, 3.5, "divide"));
		System.out.println(calculator(-1.1, -3, "subtract"));
		System.out.println(calculator(100, 0, "multiply"));
	}
}