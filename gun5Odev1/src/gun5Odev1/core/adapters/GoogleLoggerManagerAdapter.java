package gun5Odev1.core.adapters;

import gun5Odev1.core.abstracts.GoogleLoggerService;
import gun5Odev1.googleLogger.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements GoogleLoggerService {

	@Override
	public void sendMail(String email, String message) {
		// TODO Auto-generated method stub
		GoogleLoggerManager googleLoggerManager = new GoogleLoggerManager();
		googleLoggerManager.send(email, message);
	}

}
