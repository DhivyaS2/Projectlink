package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pom.Dsstartpom;
import pom.Registerpom;
import pom.maindriver;

public class Register {
public WebDriver driver;
public static WebDriver next;
public Dsstartpom st; 
public Registerpom rp;
public maindriver dd;
@Given("Clicks register to create username and password")
public void clicks_register_to_create_username_and_password() {
	dd= new maindriver();
	driver=dd.driver();
	//driver=new ChromeDriver();
	//driver.get("https://dsportalapp.herokuapp.com/home");  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	st=new Dsstartpom(driver);	
	st.start();
	 rp= new Registerpom(driver);
	
	 next=rp.register();
	 
	}


@Given("clicks Register button")
public void clicks_register_button() {

	rp= new Registerpom(next);
}
@When("Enters {string} {string} and {string} of below values")
public void enters_and_of_below_values(String urname, String pwd, String copwd) {
	
	
	rp.udandpwd(urname, pwd, copwd);
	
}

@Then("Shows Message of creating based on given values")
public void shows_message_of_creating_based_on_given_values() {
   
   
}

@When("Enters possible {string} {string} and {string} to create account")
public void enters_possible_and_to_create_account(String urname, String pwd, String copwd) {
	rp= new Registerpom(next);
	rp.validlogin(urname, pwd, copwd);
   
}

@Then("Accepts user name and password and navigate to home page with username And Shows New Account credited with username")
public void accepts_user_name_and_password_and_navigate_to_home_page_with_username_and_shows_new_account_credited_with_username() {
    
	rp= new Registerpom(next);
	rp.home();
}

@When("clicks Sign out")
public void clicks_sign_out() {
	rp= new Registerpom(next);
   rp.lsignout();
}

@Then("Displays Logged out successfully")
public void displays_logged_out_successfully() {
	
	
   
}
}
