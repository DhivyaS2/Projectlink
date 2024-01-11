package pom;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Linkedlistpom {
	WebDriver driver;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By linkedlist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
	By opt1=By.linkText("Introduction");
	By opt2=By.linkText("Creating Linked LIst");
	By opt3=By.linkText("Types of Linked List");
	By opt4=By.linkText("Implement Linked List in Python");
	By opt5=By.linkText("Traversal");
	By opt6=By.linkText("Insertion");
	By opt7=By.linkText("Deletion");
	By opt=By.xpath("//*[text()='Practice Questions']");
	By stacktryhere= By.xpath("//*[text()='Try here>>>']");
	By stacktext= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By stackrun=By.xpath("//*[text()='Run']");
	By stackoutput=By.xpath("//*[@id=\"output\"]");
	By signout =By.xpath("//*[text()='Sign out']");
	public Linkedlistpom(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebDriver linkedstart() {
		driver.findElement(dslist).click();	
	driver.findElement(linkedlist).click();
	return driver;
	}
	public void subtopics(String option) {
		String o="Introduction";
		if(o.equals(option)) {
			
		driver.findElement(opt1).click();
		}
		String o1="Creating Linked LIst";
		if(o1.equals(option))  {
			
			driver.findElement(opt2).click();
		}
		String o2="Types of Linked List";
		if(o2.equals(option)) {
		driver.findElement(opt3).click();
		}
		o="Implement Linked List in Python";
      if(o.equals(option)) {
	   
		driver.findElement(opt4).click();
        }
      o="Traversal";
      if(o.equals(option)) {
	   
		driver.findElement(opt4).click();
        }
      o="Insertion";
      if(o.equals(option)) {
	   
		driver.findElement(opt5).click();
        }
      o="Deletion";
      if(o.equals(option)) {
	   
		driver.findElement(opt6).click();
        }
	}
	
	public void linkedtryhere() {
		driver.findElement(stacktryhere).click();
	}
	public void linkedrun() throws IOException, CsvException {
		try {
			CSVReader reader = new CSVReader(new FileReader(".//src/test/resources/phython/squareroot.csv"));
			List<String[]> li=reader.readAll();
			 Iterator<String[]>i1= li.iterator();
			    
			 // Iterate all values 
			 while(i1.hasNext()){
			 String[] str=i1.next();
			   
			 System.out.print(" Values are ");

			 for(int i=0;i<str.length;i++)
			{
				 //System.out.print(" "+str[i]);
				 driver.findElement(stacktext).sendKeys(str[i]+"\n");

			}
			 } 
			
			}
			catch(NullPointerException e) {
				e.getMessage();
			}
			
		
		driver.findElement(stackrun).click();
		
		}
		
	
	public void linkedoutput() {
		
		System.out.println("***** "+driver.findElement(stackoutput).getText());
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
	}
	public void signout() {
		
		driver.findElement(signout).click();
	}
}
