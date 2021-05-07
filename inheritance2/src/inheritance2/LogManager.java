package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanına Bağlandı");
		}
		else if(logType == 2) {
			System.out.println("Dosyaya Bağlandı");
		}
		else if(logType == 3) {
			System.out.println("Email Gönderildi");
		}
	}
}


// 1 - Database
// 2 - File
// 3 - Email