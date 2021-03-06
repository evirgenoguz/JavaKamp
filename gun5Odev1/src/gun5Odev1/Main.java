package gun5Odev1;

import java.util.Scanner;

import gun5Odev1.business.concretes.AuthManager;
import gun5Odev1.business.concretes.UserManager;
import gun5Odev1.dataAccess.concretes.DbSimulation;
import gun5Odev1.dataAccess.concretes.HibernateUserDao;
import gun5Odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		UserManager userManager = new UserManager(new HibernateUserDao(new DbSimulation()), null);
		AuthManager authManager = new AuthManager(userManager);
		
		System.out.println("G?n 5 Odev 1");
		
		int userInput = 5; //while girmesi i?in
		
		while (userInput != 0) {
			
			System.out.println("1 - Giri? Yap");
			System.out.println("2 - Kay?t Ol");
			System.out.println("0 - ??k?? Yap");
			
			
			userInput = scanner.nextInt();
			
			System.out.println("***********************************");
			
			
			if (userInput == 1) {
				System.out.println("Giri? Ekran?");
				
				System.out.println("E - Mail : ");
				String mail = scanner.next();
				String password = scanner.next();
				
				authManager.login(mail, password);
					
			}
			else if(userInput == 2) {
				System.out.println("Kay?t Ekran?");
				System.out.println("?sim : ");
				String name = scanner.next();
				
				System.out.println("Soyisim : ");
				String lastName = scanner.next();
				
				System.out.println("Mail : ");
				String email = scanner.next();
				
				System.out.println("?ifre : ");
				String password = scanner.next();
				
				User user = new User(1, name, lastName, email, password); //hepsinde id 1 olacak bunu ??zemedim
				
				authManager.register(user);
				
			}
			else if(userInput == 0) {
				System.exit(0);
			}
		}	
	}
}
