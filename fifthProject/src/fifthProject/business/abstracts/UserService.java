package fifthProject.business.abstracts;



import fifthProject.entities.concretes.User;

public interface UserService {
	
	
	void verificationResult(User user,User user2);
	
	void signUpWithEmail(User user);
	
	void loginWithEmail(User user);
	
	void emailVerificationNumber(User user,String message);
	
	void sendVerificationLink(User user);
	
	
	
	

}
