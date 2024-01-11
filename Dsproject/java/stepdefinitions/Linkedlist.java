package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.Linkedlistpom;
import pom.maindriver;

public class Linkedlist {
	public static WebDriver linked;
	public Dslogin ds;
	public Dsstartpom st;
	public Linkedlistpom lp;
	public maindriver dd;

@Given("logged in Ds homescreen")
public void logged_in_ds_homescreen() throws IOException {
	dd= new maindriver();
	linked=dd.driver();
	linked.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	linked.manage().window().maximize();
	st=new Dsstartpom(linked);
	st.start();
   ds=new Dslogin(linked);
   ds.login();
   ds.signin();
    
}

@When("Clicks to Linked List Get started to explore")
public void clicks_to_linked_list_get_started_to_explore() {
   
	 lp=new Linkedlistpom(linked);
	   linked=lp.linkedstart();
}

@Then("Shows Linked List explanation")
public void shows_linked_list_explanation() {
   
    
}

@Given("Shows option to explore more about Linked list")
public void shows_option_to_explore_more_about_linked_list() {
   
    
}

@When("Clicks Linked list {string}")
public void clicks_linked_list(String string) {
	 lp=new Linkedlistpom(linked);
    lp.subtopics(string);
}

@Then("Navigates to Linked list sub topics page")
public void navigates_to_linked_list_sub_topics_page() {
   
    
}

@When("Clicks Linked list Try here in bottom of page")
public void clicks_linked_list_try_here_in_bottom_of_page() {
   
    lp.linkedtryhere();
}

@Then("Shows  Linked list  Textarea to run Python code")
public void shows_linked_list_textarea_to_run_python_code() {
   
    
}

@When("Clicks Linked list  run to execute the program")
public void clicks_linked_list_run_to_execute_the_program() throws IOException, CsvException {
   
    lp.linkedrun();
}

@Then("Shows Linked list output of program")
public void shows_linked_list_output_of_program() {
   
    lp.linkedoutput();
}

@When("Clicks signout from Linked list  page")
public void clicks_signout_from_linked_list_page() {
	 lp=new Linkedlistpom(linked);
    lp.signout();
}

@Then("logged out from Linked list Data Structure")
public void logged_out_from_linked_list_data_structure() {
   
    
}

}
