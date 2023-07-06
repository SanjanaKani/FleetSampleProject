package login.register;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RegisterPage_Negative {
	public static WebDriver driver;
	public static void takeScreenShot() throws IOException {
		Date d = new Date();
        String FileName = d.toString().replace(":", "").replace(" ", "") + ".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File F = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("D:\\ScreenShot\\"+FileName);
		FileHandler.copy(F, path);
		
	}
public static void main(String []args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstName.sendKeys("121234567891231231333456789123456789");
	WebElement secondName = driver.findElement(By.xpath("//input[@name='lastname']"));
	secondName.sendKeys("");
	WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("");
	WebElement telephoneNumber = driver.findElement(By.xpath("//input[@name='telephone']"));
	telephoneNumber.sendKeys("1");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("");
	WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirm']"));
	confirmPassword.sendKeys("888sanju");
	WebElement privacyPolicy = driver.findElement(By.xpath("//input[@type='checkbox']"));
	privacyPolicy.click();
	Thread.sleep(5000);
	WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
	continueButton.click();
	WebElement firstNameNegative = driver.findElement(By.xpath("(//div[@class='text-danger'])[1]"));
	String firstValu = firstNameNegative.getText();
	System.out.println(firstValu);
	WebElement secondNameNegative = driver.findElement(By.xpath("(//div[@class='text-danger'])[2]"));
	String secondtValu = secondNameNegative.getText();
	System.out.println(secondtValu);
	WebElement emailNegative = driver.findElement(By.xpath("(//div[@class='text-danger'])[3]"));
	String emailValu = emailNegative.getText();
	System.out.println(emailValu);
	WebElement phoneNumberNegative = driver.findElement(By.xpath("(//div[@class='text-danger'])[4]"));
	String phoneValue = phoneNumberNegative.getText();
	System.out.println(phoneValue);
	WebElement passwordNegative = driver.findElement(By.xpath("(//div[@class='text-danger'])[5]"));
	String pwdValue = passwordNegative.getText();
	System.out.println(pwdValue);
	takeScreenShot();
}
}
