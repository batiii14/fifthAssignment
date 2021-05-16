package fifthProject.business.concretes;





import fifthProject.business.abstracts.UserService;
import fifthProject.business.abstracts.UserVerificationService;
import fifthProject.core.GoogleService;
import fifthProject.entities.concretes.User;

public class UserManager implements UserService{
	
	
	private UserVerificationService userVerificationService;
	private GoogleService googleService;
	public UserManager() {}
	
	public UserManager(UserVerificationService userVerificationService,GoogleService googleService) {
		super();
		this.userVerificationService=userVerificationService;
		this.googleService=googleService;
	
}
	
	
	@Override
	public void verificationResult(User user1,User user2) {
		if(userVerificationService.check(user1, user2)==false)
			System.out.println("Sisteme kay�t olamazs�n�z. �artlar� yerine getirdi�inizden emin olunuz : \n1-) �ifrenizin 6 karakterden"
					+ "fazla olmas� gerekir\n2-) Is�m ve Soy�s�m 2 karakterden az olamaz\n3-) Sistemde var olan bir email ile "
					+ "yeni bir kay�t olu�turulamaz!");
		
	}
	
	public void registerWithGoogleAccount(User user) {
		this.googleService.registerWithGoogleAccount(user.geteMail(), user.getPassword());
	}
	
	
	@Override
	public void signUpWithEmail(User user) {
		System.out.println(user.getFirstName()+" Ba�ar� ile kay�t oldunuz. L�tfen mail adresinizi kontrol edip do�rulama kodunu giriniz");
	}

	@Override
	public void loginWithEmail(User user) {
		System.out.println(user.getFirstName()+" Sisteme ba�ar�l� bir �ekilde giri� yapt�n!");
		
	}
	String x="AA239438";

	@Override
	public void sendVerificationLink(User user) {
		
		System.out.println("Hesab�n�z� do�rulama kodunuz : "+x);
		
		
	}
	

	@Override
	public void emailVerificationNumber(User user,String message) {
		if(x==message) {
			System.out.println("Girdi�iniz kod do�ru! Hesab�n�z aktif edilmi�tir!");
		}else 
			System.out.println("Girdi�iniz kod yanl��! Hesab�n�z aktif edilemedi!");
		
		
	}
	



}
