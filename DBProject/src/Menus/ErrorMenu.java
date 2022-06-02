package Menus;

import Utils.Utils;

public class ErrorMenu {

	public static void invalidInputError() {

		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                   Please enter a valid option!                   |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.write("Please choose: ");
	}

	public static void invalidDataError() {

		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                     Please enter a valid data!                   |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
	}

	public static void invalidDomain() {

		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                       Invalid email domain                       |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
	}

	public static void invalidUsername() {

		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                      Username already exist                      |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
	}

	public static void invalidEmailUsername() {

		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                      Invalid email username                      |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
	}

}