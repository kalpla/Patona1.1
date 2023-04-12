package intellegencebank;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
	@FindBy(id="cookie_action_close_header")
	private WebElement Aceptcokie;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement Companyname;
	
	@FindBy(id="First_Namepi_First_Name")
	private WebElement Firstname;
	
	@FindBy(id="Last_Namepi_Last_Name")
	private WebElement Lastname;
	
	@FindBy(id="Emailpi_Email")
	private WebElement Workemail;
	
	@FindBy(id="941293_138982pi_941293_138982")
	private WebElement Phone;
	
	@FindBy(id="941293_138986pi_941293_138986")
	private WebElement Enquiry;
	
	public ContactPage(WebDriver driver) {
		//System.out.println(driver.getPageSource());
		PageFactory.initElements(driver,this);
	  }
	
	public void Companyname(WebDriver driver) {
		this.Companyname = driver.findElement(By.id("Companypi_Company"));
		System.out.println(Companyname);
		Companyname.sendKeys("Patona");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementById('Companypi_Company').value='patona digital'");
	}
	public void Aceptcokie(WebDriver driver) {
		this.Aceptcokie = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("cookie_action_close_header")));
		Aceptcokie.click();
	}
	public void Firstname() {
		System.out.println(Firstname);
		Firstname.sendKeys("Kalyani");
	}
	public void Lastname() {
		Lastname.sendKeys("Patil");
	}
	public void Workemail() {
		Workemail.sendKeys("Kalyanip0692@gmail.com");
	}
	public void Phone() {
		Phone.sendKeys("9284664620");
	}
	public void Enquiry() {
		Enquiry.sendKeys("how to check balance");
	}
	
}


