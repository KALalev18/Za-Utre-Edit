package Services;

import java.util.List;
import java.util.stream.Collectors;
import java.sql.SQLException;
import java.util.Collections;

import Models.User_Info;
import Repositorities.UserRepository;
import Utils.PasswordManager;

public class UserService {

	private static UserService instance = null;
	private final UserRepository usersRepository;

	private UserService() throws SQLException {
		this.usersRepository = UserRepository.getInstance();
	}

	public static UserService getInstance() throws SQLException {

		if (UserService.instance == null) {
			UserService.instance = new UserService();
		}

		return UserService.instance;
	}

	public User_Info getRegisteredUser(String username, String password) {

		User_Info user = usersRepository.getRegisteredUser(username);

		if (user != null) {
			boolean hashPassword = PasswordManager.isExpectedPassword(password.toCharArray(), user.getUser_Email(),
					user.getUser_Password().toCharArray());

			if (hashPassword == false) {
				return null;
			}
		}

		return user;
	}

	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

}
