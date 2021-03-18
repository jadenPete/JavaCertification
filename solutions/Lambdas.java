import java.util.Arrays;

public class Lambdas {
	public static void printElements (Iterable<?> i) {
		// Write a method that uses a lambda to print "This is an element: (element)"
		// for each element in an Iterable i.

		i.forEach((x) -> System.out.println("This is an element: " + x));
	}

	public static void main (String[] args) {
		printElements(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55));
		System.out.println();
		printElements(Arrays.asList(1, 0, 0, 1, 1, 2, 0, 2, 1, 3));
	}
}