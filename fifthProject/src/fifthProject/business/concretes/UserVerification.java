package fifthProject.business.concretes;


import java.util.regex.Pattern;

import fifthProject.business.abstracts.UserVerificationService;
import fifthProject.entities.concretes.User;

public class UserVerification implements UserVerificationService{

	@Override
	public boolean check(User user1, User user2) {
		if ((Pattern.matches("[a-zA-Z0-9]{6,}",user1.getPassword())==false)){
			System.out.println("�ifrenizin 6 karakterden fazla olmas� gerekmektedir"); return false; 
		}else if((Pattern.matches("[a-zA-Z]{2,}", user1.getFirstName())==false)) {
			System.out.println("Is�m ve Soyisim 2 karakterden az olamaz"); return false;
		}else if(Pattern.matches(user1.geteMail(), user2.geteMail())==true) {
			System.out.println("Sistemde var olan bir mail adresi ile kay�t olamazs�n�z!");return false;
		}else {
			System.out.println("Sisteme kay�t olabilirsiniz.");
			return true;}
		
	}
	
	


}
