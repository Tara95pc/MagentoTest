

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Magentotest 
{
	@Test
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.com/");
	Welcome w=new Welcome(driver);
	w.clickOnMyAccount();
	
	Login l=new Login(driver);
	l.typeEmail("taraprasad2017@gmail.com");
	l.typePassword("Tara1995");
	l.login();
	Home h=new Home(driver);
	h.clickLogout();
}
}
