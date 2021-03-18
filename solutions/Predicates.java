import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class Predicates {
	public static void printOdd (List<Integer> numbers) {
		// Write a method that uses a predicate to print each odd element in a list of Integers.

		Predicate<Integer> isOdd = x -> x % 2 == 1;

		numbers.stream().filter(isOdd).forEach(System.out::println);
	}

	public static void main (String[] args) {
		printOdd(Arrays.asList(7, 6, 8, 2, 9, 3));
	}
}