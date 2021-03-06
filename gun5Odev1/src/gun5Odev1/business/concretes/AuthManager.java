package gun5Odev1.business.concretes;

import gun5Odev1.business.abstracts.AuthService;
import gun5Odev1.business.abstracts.UserService;
import gun5Odev1.core.utils.Regexs;
import gun5Odev1.entities.concretes.User;

public class AuthManager implements AuthService {

	UserService userService;
	
	
	
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(user != null && userExist(user.getEmail()) && checkPassword(user.getPassword()) 
				&& Regexs.emailValidate(user.getEmail()) ) {
			
			userService.add(user);
		}
		else {
			System.out.println("Kay?t Ba?ar?s?z");
		}
		
		
	}

	@Override
	public void login(String email, String password) {
		User user = userService.getByMail(email);
		
		if(user != null && user.getPassword().equals(user.getPassword())) {
			System.out.println("Giri? Ba?ar?l?");
		}
		else {
			System.out.println("Giri? Ba?ar?s?z");
		}
		
	}

	@Override
	public boolean userExist(String email) {
		if(userService.getByMail(email)!=null) {		
			System.out.println("Kullan?c? zaten var");
			return false;
		}
		return true;
	}
	
	
	
	
	public boolean checkPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmal?d?r.");
			return false;
		}
		return true;
	}

}
