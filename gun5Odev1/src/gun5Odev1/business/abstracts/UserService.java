package gun5Odev1.business.abstracts;

import java.util.List;

import gun5Odev1.entities.concretes.User;



public interface UserService {
	public void add(User user);
	User getByMail(String email);
	List<User> getAll();
}
