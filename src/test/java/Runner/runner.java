package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\LENOVO\\eclipse-workspace\\org.OpenCart\\src\\test\\java\\feature\\feat.feature"
,glue="",dryRun=false)

public class runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void start() {
		//FirefoxDriver op=new FirefoxDriver();
		
		//op.addArguments("--remote-allow-orgins=*");
		driver=new ChromeDriver();
	}
}
