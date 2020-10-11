import java.util.Scanner;

public class Calculator {

	// global variables
	private static final Scanner scanner = new Scanner(System.in);

	private static double square(double a) {
		return a * a;
	}

	public static double pythagoras(double a, double b) {
		return Math.sqrt(square(a) + square(b));
	}

	public static void calculate(String calcMethod, String numberOne, String numberTwo, String choice)
			throws NumberFormatException {

		switch (Integer.parseInt(choice)) {
		case 1:
			if (calcMethod.equals("y")) {
				System.out.println("[*] You have chosen floating point ADDITION .... here we go .... ");
				System.out.println("[*] Calculating " + Double.parseDouble(numberOne) + " + "
						+ Double.parseDouble(numberTwo) + " ... ");
				System.out.println(
						"[*] The result is: " + (Double.parseDouble(numberOne) + Double.parseDouble(numberTwo)));
			} else {
				System.out.println("[*] You have chosen integer ADDITION .... here we go .... ");
				System.out.println("[*] Calculating " + Integer.parseInt(numberOne) + " + "
						+ Integer.parseInt(numberTwo) + " ... ");
				System.out.println("[*] The result is: " + (Integer.parseInt(numberOne) + Integer.parseInt(numberTwo)));
			}
			break;
		case 2:
			if (calcMethod.equals("y")) {
				System.out.println("[*] You have chosen floating point SUBTRACTION .... here we go .... ");
				System.out.println("[*] Calculating " + Double.parseDouble(numberOne) + " - "
						+ Double.parseDouble(numberTwo) + " ... ");
				System.out.println(
						"[*] The result is: " + (Double.parseDouble(numberOne) - Double.parseDouble(numberTwo)));
			} else {
				System.out.println("[*] You have chosen integer SUBTRACTION .... here we go .... ");
				System.out.println("[*] Calculating " + Integer.parseInt(numberOne) + " - "
						+ Integer.parseInt(numberTwo) + " ... ");
				System.out.println("[*] The result is: " + (Integer.parseInt(numberOne) - Integer.parseInt(numberTwo)));
			}
			break;
		case 3:
			if (calcMethod.equals("y")) {
				System.out.println("[*] You have chosen floating point DIVISION .... here we go .... ");
				System.out.println("[*] Calculating " + Double.parseDouble(numberOne) + " / "
						+ Double.parseDouble(numberTwo) + " ... ");
				System.out.println(
						"[*] The result is: " + (Double.parseDouble(numberOne) / Double.parseDouble(numberTwo)));
			} else {
				System.out.println("[*] You have chosen integer DIVISION .... here we go .... ");
				System.out.println("[*] Calculating " + Integer.parseInt(numberOne) + " / "
						+ Integer.parseInt(numberTwo) + " ... ");
				System.out.println("[*] The result is: " + (Integer.parseInt(numberOne) / Integer.parseInt(numberTwo)));
			}
			break;
		case 4:
			if (calcMethod.equals("y")) {
				System.out.println("[*] You have chosen floating point MODULO .... here we go .... ");
				System.out.println("[*] Calculating " + Double.parseDouble(numberOne) + " % "
						+ Double.parseDouble(numberTwo) + " ... ");
				System.out.println(
						"[*] The result is: " + (Double.parseDouble(numberOne) % Double.parseDouble(numberTwo)));
			} else {
				System.out.println("[*] You have chosen integer MODULO .... here we go .... ");
				System.out.println("[*] Calculating " + Integer.parseInt(numberOne) + " % "
						+ Integer.parseInt(numberTwo) + " ... ");
				System.out.println("[*] The result is: " + (Integer.parseInt(numberOne) % Integer.parseInt(numberTwo)));
			}
			break;
		case 5:
			System.out.println("[*] You have chosen PYTHAGORAS calculation .... here we go ....");
			System.out.println("[*] Calculating the square root c=(" + Double.parseDouble(numberOne) + "² + "
					+ Double.parseDouble(numberTwo) + "²) ... ");
			System.out.println(
					"[*] The result is: " + (pythagoras(Double.parseDouble(numberOne), Double.parseDouble(numberTwo))));
			// Would be possible to calculate without using any own class methods using
			// Math.sqrt().
			// But hey, practice makes perfect :-)
			break;
		default:
			System.out.println("[*] Your input is invalid. Please mind that only the numbers "
					+ "1 | 2 | 3 | 4 | 5 are allowed! Calculator will be terminated now. Please try again.");
			return;
		}

	}

	// MAIN METHOD BELOW

	public static void main(String[] args) {

		System.out.println("******* Welcome to SimpleConsoleCalculator ********");
		System.out.println();

		boolean terminate = false;
		do {
			System.out.println("[*] Would you like to make floating point calculations?\nType y for yes or something"
					+ " else for integer calculations.");
			String calcMethod = scanner.nextLine();

			System.out.println("[*] Please type in the first number to calculate with ...");
			String numberOne = scanner.nextLine();
			System.out.println("[*] Please type in the second number to calculate with ...");
			String numberTwo = scanner.nextLine();

			System.out.println("[*] What do you want to calculate? Please make a choice and type in the number"
					+ " of the choices below:\n");
			System.out
					.println("[+] 1. Addition\n[-] 2. Subtraction\n[/] 3. Division\n[%] 4. Modulo\n[**] 5. Pythagoras");
			String choice = scanner.nextLine();

//			Calculation algorithm throws an exception if the calculation cannot be made, for example if the users
//			input is not a number. Exception will be handled here ...

			try {
				calculate(calcMethod, numberOne, numberTwo, choice);
			} catch (NumberFormatException e) {
				System.out.println("[*] Error: You have typed in invalid values for the calculation. "
						+ "Make sure to type in only numbers - nothing else is allowed!");
				System.out.println("[*] Calculator will be terminated now. Please try again.");
				return;
			}

			System.out.println();
			System.out.println(
					"Would you like to run the calculator once again?\nPress y for yes or another key to abort.");
			if (!scanner.nextLine().equals("y")) {
				terminate = true;
			}

		} while (!terminate);

		scanner.close();

		System.out.println("Thank you for using the calculator. See you soon!");
	}
}
