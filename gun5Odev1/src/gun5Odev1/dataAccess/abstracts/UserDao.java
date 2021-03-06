package gun5Odev1.dataAccess.abstracts;

import java.util.List;

import gun5Odev1.entities.concretes.User;


public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByMail(String mail);
	List<User> getAll();
}
