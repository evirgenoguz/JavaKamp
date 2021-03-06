package gun5Odev1.business.concretes;

import java.util.List;

import gun5Odev1.business.abstracts.UserService;
import gun5Odev1.core.abstracts.GoogleLoggerService;
import gun5Odev1.dataAccess.abstracts.UserDao;
import gun5Odev1.dataAccess.concretes.DbSimulation;
import gun5Odev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private DbSimulation dbSimulation;
	private GoogleLoggerService googleLoggerService;
	
	public UserManager(UserDao userDao, GoogleLoggerService googleLoggerService) {
		super();
		this.userDao = userDao;
		this.googleLoggerService = googleLoggerService;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if(user.getName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("?sim ve soyisim 2 karakterden fazla olmal?d?r");
			return;
		}
		this.userDao.add(user);
		this.googleLoggerService.sendMail(user.getEmail(), "Kullan?c? Eklendi");
	}

	@Override
	public User getByMail(String email) {
		
		return userDao.getByMail(email); 
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
