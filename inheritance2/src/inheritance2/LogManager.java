package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritaban�na Ba�land�");
		}
		else if(logType == 2) {
			System.out.println("Dosyaya Ba�land�");
		}
		else if(logType == 3) {
			System.out.println("Email G�nderildi");
		}
	}
}


// 1 - Database
// 2 - File
// 3 - Email