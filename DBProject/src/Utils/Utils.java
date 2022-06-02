package Utils;

import java.util.Scanner;

import Menus.ErrorMenu;

public class Utils {
	private static final Scanner sc = new Scanner(System.in);

	public static void writeConsoleLine(String line) {
		System.out.println(line);
	}

	public static void write(String line) {
		System.out.print(line);
	}

	public static void readNewLine(String string) {
		System.out.println();
	}

	public static void clear() {
		for (int i = 0; i <= 30; i++) {
			System.out.println();
		}
	}

	public static String read() {
		return sc.nextLine();
	}

	public static int readInteger() {

		int result = 0;

		while (result == 0) {
			try {
				result = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				ErrorMenu.invalidInputError();
			}
		}
		return result;
	}
}