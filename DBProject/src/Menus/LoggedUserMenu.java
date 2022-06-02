package Menus;

import Utils.Utils;

public class LoggedUserMenu {

	public static void loggedUser() {
		Utils.readNewLine("+------------------------------------------------------------------+");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                             SPORTS SYSTEM                        |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("+------------------------------------------------------------------+");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                      Please choose a option                      |");
		Utils.readNewLine("|        __________________________________________________        |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                       1. View all products                       |");
		Utils.readNewLine("|                       2. View your payments                      |");
		Utils.readNewLine("|                       3. View your cart                          |");
		Utils.readNewLine("|                       4. View all field photos                   |");
		Utils.readNewLine("|                       5. View field locations                    |");
		Utils.readNewLine("|        __________________________________________________        |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                             ACCOUNT                              |");
		Utils.readNewLine("|              ______________________________________              |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                       6. Edit account                            |");
		Utils.readNewLine("|                       7. Delete account                          |");
		Utils.readNewLine("|                       8. Log out                                 |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("+------------------------------------------------------------------+");
		
		Utils.write("Please choose: ");
	}
}
