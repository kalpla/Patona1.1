package intellegencebank;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class contactpage1 {
	
	 WebDriver driver;
	ContactPage ContactPage ;
	
		@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.intelligencebank.com/contact-us/");
		
			}

   @BeforeMethod
	public void beforemethod() {
		ContactPage = new 	ContactPage(driver);
		ContactPage.Aceptcokie(this.driver);
		
		driver.switchTo().frame(2);
	//	WebElement ele = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Companypi_Company\"]")));
		
//		driver.findElement(By.xpath("//*[@id=\"Companypi_Company\"]")).sendKeys("Laxman APtil");
	ContactPage.Companyname(driver);
ContactPage.Firstname();
	ContactPage.Lastname();
		ContactPage.Workemail();
		ContactPage.Phone();	
		ContactPage.Enquiry();
		
		Select dropdown = new Select(driver.findElement(By.id("941293_138980pi_941293_138980")));
		dropdown.selectByVisibleText("India");

		Select dropdown1 = new Select(driver.findElement(By.id("941293_178033pi_941293_178033")));
		dropdown1.selectByVisibleText("Social Media");
		
		WebElement Check = driver.findElement(By.xpath("//*[@id=\"pardot-form\"]/div[10]/span/span/label"));
		Check.click();
		File screenshot_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Patona1.1\\Screenshot\\screenshot2.jpeg");
		try {
			FileHandler.copy(screenshot_file,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

   }

	@Test
public void test() {
  String url = driver.getCurrentUrl();
//  String Companyname = 
  if(url.equals("https://www.intelligencebank.com/contact-us/.")) {
	  System.out.println("test case is passed");
	  Assert.assertTrue(true,"url is opened successfully");
	  
  }
  else {System.out.println("Test case is failed");
  	Assert.assertFalse(true,"url is opened successfully");}
  }
  
  @AfterMethod
 	public void aftermethod() {
	 driver.close();
	 
 }
	@AfterClass
	public void afterClass(){
		driver.close();
		
	}

	
	}

	