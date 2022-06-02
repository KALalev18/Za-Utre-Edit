package Menus;

import Utils.Utils;

public class AdminMenu {
	
	public static void adminMenu() {
		
		Utils.readNewLine("+------------------------------------------------------------------+");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                              ADMIN                               |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("+------------------------------------------------------------------+");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                 Please choose what you want to do:               |");
		Utils.readNewLine("|        __________________________________________________        |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                           USER ACCOUNTS                          |");
		Utils.readNewLine("|              ______________________________________              |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                       1. Edit personal account                   |");
		Utils.readNewLine("|                       2. Edit user account                       |");
		Utils.readNewLine("|                       3. Make a user admin                       |");
		Utils.readNewLine("|                       4. Delete user account                     |");
		Utils.readNewLine("|                       5. Delete personal account                 |");
		Utils.readNewLine("|                       6. View all users                          |");
		Utils.readNewLine("|                       7. View all admins                         |");
		Utils.readNewLine("|                       8. LOG OUT                                 |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|        __________________________________________________        |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                         SPORTS REQUESTS                          |");
		Utils.readNewLine("|              ______________________________________              |");
		Utils.readNewLine("|                                                                  |");
		Utils.readNewLine("|                       9. View sport requests                     |");
		Utils.readNewLine("|                      10. Remove sport requests                   |");
		Utils.readNewLine("+------------------------------------------------------------------+");		
		
		Utils.write("Please choose: ");
	}
}
