package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

class UserService{
	public String findUserNameByUserId(int id) throws SQLException, IOException {
		System.out.println("logic to get the user name from DB");
		return "Sanjay";
	}
}
public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		
		int uid = 101;
		String uName="";
		try {
			uName = uService.findUserNameByUserId(uid);
		} catch (SQLException | IOException e) {			
			e.printStackTrace();
		}
		System.out.println("user name = " + uName);
		System.out.println();
		
		System.out.println("please wait for 5 seconds!!!");
		Thread.sleep(5000); //5000ms
		System.out.println("thanks for waiting!!!....  let's go");
	}

}
