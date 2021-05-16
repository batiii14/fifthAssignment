package fifthProject.dataAccess.abstracts;

import fifthProject.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	void delete(User user);
	
	void update(User user);
	

}
