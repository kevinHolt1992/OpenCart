package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;
	
	public Pom(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement BtnLogin;
	
	@FindBy(name = "password")
	private WebElement TxtPass;
	
	public WebElement getTxtPass() {
		return TxtPass;
	}

	@FindBy(name = "username")
	private WebElement TxtUserName;
	public WebElement getUserName() {
		return TxtUserName;
	}
	public WebElement getBtnLogin() {
		return BtnLogin;
	}
}
