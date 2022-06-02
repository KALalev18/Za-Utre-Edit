package Controllers;

import Utils.Utils;

import java.sql.SQLException;

import Services.UserService;

public class UserController {
	private UserService userService;

	public UserController(UserService userService)
	{
		this.userService = userService;
	}
	
	public void display() throws SQLException {
		String data = userService.display();
		Utils.writeConsoleLine("Displaying data from database: " + data);
        Utils.writeConsoleLine("Write your name:");
        final String name = Utils.read();
        Utils.writeConsoleLine("Your name is:" + name);
	}
}

