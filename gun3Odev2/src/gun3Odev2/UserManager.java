package gun3Odev2;

public class UserManager {
	
	
	public void login(User user) {
		System.out.println(user.getName() + " Ho?geldiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getName() + " Yine Bekleriz.");
	}
}
