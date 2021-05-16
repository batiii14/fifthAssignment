package fifthProject.dataAccess.concretes;

import fifthProject.dataAccess.abstracts.UserDao;
import fifthProject.entities.concretes.User;

public class DataUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" Baþarý ile database e eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Baþarý ile database den silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" Baþarý ile bilgilerin databasede güncellendi ");
		
	}

}
