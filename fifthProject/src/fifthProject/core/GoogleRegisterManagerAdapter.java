package fifthProject.core;

import fifthProject.googleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleService{

	@Override
	public void registerWithGoogleAccount(String email, String password) {
		GoogleRegisterManager manager = new GoogleRegisterManager();
		manager.register(email, password);
	}

}
