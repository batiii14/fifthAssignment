package fifthProject.business.concretes;


import java.util.regex.Pattern;

import fifthProject.business.abstracts.UserVerificationService;
import fifthProject.entities.concretes.User;

public class UserVerification implements UserVerificationService{

	@Override
	public boolean check(User user1, User user2) {
		if ((Pattern.matches("[a-zA-Z0-9]{6,}",user1.getPassword())==false)){
			System.out.println("Þifrenizin 6 karakterden fazla olmasý gerekmektedir"); return false; 
		}else if((Pattern.matches("[a-zA-Z]{2,}", user1.getFirstName())==false)) {
			System.out.println("Isým ve Soyisim 2 karakterden az olamaz"); return false;
		}else if(Pattern.matches(user1.geteMail(), user2.geteMail())==true) {
			System.out.println("Sistemde var olan bir mail adresi ile kayýt olamazsýnýz!");return false;
		}else {
			System.out.println("Sisteme kayýt olabilirsiniz.");
			return true;}
		
	}
	
	


}
