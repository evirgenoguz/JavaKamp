package gun5Odev1.business.abstracts;

import gun5Odev1.entities.concretes.User;

public interface AuthService {
	public void register(User user);
	public void login(String email, String password);
	public boolean userExist(String email);
}
