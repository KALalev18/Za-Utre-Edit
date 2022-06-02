package Menus;
import Utils.Utils;
public class WelcomePage {
	public static void welcomePage() {
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                                                                  |");
		Utils.writeConsoleLine("|                    WELCOME TO THE SPORTS SYSTEM                  |");
		Utils.writeConsoleLine("|                                                                  |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		Utils.writeConsoleLine("|                                                                  |");
		Utils.writeConsoleLine("|                      DO YOU HAVE AN ACCOUNT?                     |");
		Utils.writeConsoleLine("|        __________________________________________________        |");
		Utils.writeConsoleLine("|                                                                  |");
		Utils.writeConsoleLine("|                             1. Yes                               |");
		Utils.writeConsoleLine("|                             2. No                                |");
		Utils.writeConsoleLine("|                                                                  |");
		Utils.writeConsoleLine("+------------------------------------------------------------------+");
		
		Utils.write("Please choose: ");
	}
}