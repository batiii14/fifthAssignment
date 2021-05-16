package fifthProject;




import fifthProject.business.concretes.UserManager;
import fifthProject.business.concretes.UserVerification;
import fifthProject.core.GoogleRegisterManagerAdapter;
import fifthProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"BATUN","IDIKURT","abcd@gmail.com","Batun00023");
		User user2=new User(2,"AHMET","SAKIP","abc@gmail.com","Ahmet00132");
		
		
		UserVerification userVerification=new UserVerification();
		
				
		
		UserManager userManager=new UserManager(userVerification,new GoogleRegisterManagerAdapter ());
		userManager.verificationResult(user1, user2);
		userManager.signUpWithEmail(user1);
		userManager.sendVerificationLink(user1);
		userManager.emailVerificationNumber(user1,"AA239438");
		
		userManager.registerWithGoogleAccount(user1);
		
		


		
		

	}
	
}
