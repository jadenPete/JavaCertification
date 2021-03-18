public class BreakContinue {
	public static void printNames (String[] names) {
		// Write a method that--using both break and continue--prints each name from an array, except:
		// 	- If it contains digit(s), print "Error: Not a name!" and break.
		// 	- If the first character is lowercase, print "Warning: Capitalize names!", but continue.

		for (String name : names) {
			if (name.matches(".*\\d.*")) {
				System.out.println("Error: Not a name!");
				break;
			}

			if (Character.isLowerCase(name.charAt(0))) {
				System.out.println("Warning: Capitalize names!");
				continue;
			}

			System.out.println(name);
		}
	}

	public static void main (String[] args) {
		printNames(new String[] {"Bob", "Joe", "X Æ A-12"}); // Sorry, Elon.
		printNames(new String[] {"Jason", "Clarion", "jaden"});
		printNames(new String[] {"Richie", "Alison", "Tyler"});
	}
}