package bankingSystem;
import java.util.Scanner;
import java.io.Console;






public class bankSystem {
	boolean exit;

	public static void main(String[] args) {

		bankSystem bank = new bankSystem();
		bank.runbankSystem();
	}

	public void runbankSystem() {

		printHeader();
		while (!exit) {
			printbankSystem();
			int choice = getInput();
			performAction(choice);
		}

	}

	private void printHeader() {

		System.out.println("+----------------------------------------+");
		System.out.println("|              Welcome To Our            |");
		System.out.println("|           Banking Simulation Menu      |");
		System.out.println("+----------------------------------------+");
		System.out.println("+----------------------------------------+");
		System.out.println("|          Please Log In To Continue     |");
		System.out.println("+----------------------------------------+");
		System.out.println("+----------------------------------------+");
	}

	private void printbankSystem() {

		System.out.println("\nPlease Make A Selection:");
		System.out.println("1) Add/Dock A Ship");
		System.out.println("2) ");
		System.out.println("3) ");
		System.out.println("0) Exit");
	}

	private int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 3) {
			try {
				System.out.print("\nPlease Enter Your Choice:");
				choice = Integer.parseInt(kb.nextLine());
				if (choice < 0 || choice > 3) {

					System.out.println("Invalid Selection. Please Try Again");
				}
			} catch (NumberFormatException e) {

				System.out.println("Invalid selection.Please Try Again");

			}
		}
		return choice;
	}

private void performAction(int choice) {

	switch (choice) {
	case 0:
		exit = true;
		System.out.println("-----Thank You For Using Our Service.-----");
		break;
	case 1:
		break;

	case 2:

		break;
	case 3:

		break;
	default:
		System.out.println("An Unknown Error Has Occured.");

	}

}

}
