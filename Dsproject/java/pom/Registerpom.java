package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpom {
	public WebDriver driver;
	By register=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
	By numpyninja =By.className("navbar-brand");
	By submit =By.xpath("//div[2]//div[2]/form/input[5]");
	By username=By.xpath("//*[@id=\"id_username\"]");
	By password=By.xpath("//*[@id=\"id_password1\"]");
	By cpassword=By.xpath("//*[@id=\"id_password2\"]");
	By registererror =By.className("alert-primary");
	By successregister =By.className("alert-primary");
	By signout =By.xpath("//*[text()='Sign out']");
	public Registerpom(WebDriver driver) {
		this.driver=driver;
	}
	public WebDriver register() {
		driver.findElement(register).click();
		return driver;
	}

	public void udandpwd(String urname, String pwd, String copwd) {
		 
		try{
			if(urname.equals(" ")) {
				
			
			}
			else {
		driver.findElement(username).sendKeys(urname);
			}
	if(pwd.equals(" ")) {
		
			}
			else {
				driver.findElement(password).sendKeys(pwd);
			}

	if(copwd.equals(" ")) {
		 
			}
			else {
				driver.findElement(cpassword).sendKeys(copwd);
			}
		driver.findElement(cpassword).sendKeys(copwd);
		driver.findElement(submit).click();
		if((urname.equals(" ")&&copwd.equals(" "))&&pwd.equals(" ")) {
			
		}
		else {
			System.out.println("*****"+driver.findElement(registererror).getText());
		}
		}
		catch(Exception e) {
			 WebElement au= driver.switchTo().activeElement();
			    String d=au.getAttribute("validationMessage");
				System.out.println("*****"+d+"*** Shows in Empty Textbox"); 
		}
	}
	public void validlogin(String urname, String pwd, String copwd) {
		 
		driver.findElement(username).sendKeys(urname);
				
		driver.findElement(password).sendKeys(pwd);
				
		driver.findElement(cpassword).sendKeys(copwd);
				
			driver.findElement(submit).click();
	
		 System.out.println("******"+driver.findElement(successregister));
	}
	public void lsignout() {
		driver.findElement(signout).click();
		
	}
	public void home() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
}
