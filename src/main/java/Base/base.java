package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class base {

	WebDriver driver;
	
	public static void snd(WebElement ref,String st) {
		ref.sendKeys(st);
		}
	public static void url(WebDriver driver,String st) {
		driver.get(st);
	}
	public static void clk(WebElement cl) {
		cl.click();		
	}
	public static void clr(WebElement ref) {
		ref.clear();
		
	}
}
