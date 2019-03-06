package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.LoginPage;

public class ValidLogin extends Base_Test {
	@Test
	public void testcase1() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		Thread.sleep(9000);
		l.signinlink();
		l.usernametextbox("chethansreddy013@gmail.com");
		l.passwordtextbox("c@8970037174");
		Thread.sleep(3000);
		l.submitbutton();
		
	}

}
