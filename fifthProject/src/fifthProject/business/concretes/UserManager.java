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
			System.out.println("Sisteme kayýt olamazsýnýz. Þartlarý yerine getirdiðinizden emin olunuz : \n1-) Þifrenizin 6 karakterden"
					+ "fazla olmasý gerekir\n2-) Isým ve Soyýsým 2 karakterden az olamaz\n3-) Sistemde var olan bir email ile "
					+ "yeni bir kayýt oluþturulamaz!");
		
	}
	
	public void registerWithGoogleAccount(User user) {
		this.googleService.registerWithGoogleAccount(user.geteMail(), user.getPassword());
	}
	
	
	@Override
	public void signUpWithEmail(User user) {
		System.out.println(user.getFirstName()+" Baþarý ile kayýt oldunuz. Lütfen mail adresinizi kontrol edip doðrulama kodunu giriniz");
	}

	@Override
	public void loginWithEmail(User user) {
		System.out.println(user.getFirstName()+" Sisteme baþarýlý bir þekilde giriþ yaptýn!");
		
	}
	String x="AA239438";

	@Override
	public void sendVerificationLink(User user) {
		
		System.out.println("Hesabýnýzý doðrulama kodunuz : "+x);
		
		
	}
	

	@Override
	public void emailVerificationNumber(User user,String message) {
		if(x==message) {
			System.out.println("Girdiðiniz kod doðru! Hesabýnýz aktif edilmiþtir!");
		}else 
			System.out.println("Girdiðiniz kod yanlýþ! Hesabýnýz aktif edilemedi!");
		
		
	}
	



}
