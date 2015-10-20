import com.sun.beans.User1;
import com.sun.service.UserService;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 user=new User1();
		user=new UserService().getUser();
		System.out.println("ÓÃ»§Ãû£º"+user.getUserName()+"ÃÜÂë£º"+user.getUserPawd());
	}

}
