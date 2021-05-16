package fifthProject.business.abstracts;

import fifthProject.entities.concretes.User;

public interface UserVerificationService {

	boolean check(User user1,User user2);
	
}
