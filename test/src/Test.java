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
		System.out.println("�û�����"+user.getUserName()+"���룺"+user.getUserPawd());
	}

}
