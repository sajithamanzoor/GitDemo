package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		System.out.println("in landing page");
		System.out.println("in landing page");
		
	}




	public WebElement getLogin()
	{
<<<<<<< HEAD
	
=======
		System.out.println("in getLogin page");
		System.out.println("in landing page");
>>>>>>> 37d65547a8ca65e228aa9f039cf7d53e5aa24973
		return driver.findElement(signin);
		
	}
	public WebElement getNavigationBar()
	{
		System.out.println("in getNavigationBar page");
		return driver.findElement(NavBar);
	}
	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
}
