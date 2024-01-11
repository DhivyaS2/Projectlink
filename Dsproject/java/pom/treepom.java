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

public class treepom {
	public WebDriver driver;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By stree=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]");
	 By tryhere=By.xpath("//*[text()='Try here>>>']");
	 By textarea=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	 By run=By.xpath("//*[text()='Run']");
	 By output=By.xpath("//*[@id=\"output\"]");
	 By overview=By.linkText("Overview of Trees");
	 By terminologies =By.linkText("Terminologies");
	 By typesoftrees= By.linkText("Types of Trees");
	 By treetraversals =By.linkText("Tree Traversals");
	 By traversalsillustration= By.linkText("Traversals-Illustration");
	 By binarytrees =By.linkText("Binary Trees");
	 By typesofbinarytrees= By.linkText("Types of Binary Trees");
	 By implementationinpython =By.linkText("Implementation in Python");
	 By binarytreetraversals= By.linkText("Binary Tree Traversals");
	 By implementationofbinarytrees =By.linkText("Implementation of Binary Trees");
     By applicationsofbinarytrees= By.linkText("Applications of Binary trees");
	 By binarysearchtrees =By.linkText("Binary Search Trees");
	 By implementationOfBST= By.linkText("Implementation Of BST");
	 By signout =By.xpath("//*[text()='Sign out']");
	 public treepom(WebDriver driver) {
			this.driver=driver;
			
		}
	 
	 public WebDriver treestart() {
		 driver.findElement(dslist).click();	
			driver.findElement(stree).click();
			return driver;
			}
			
			public void treetopics(String option) {
				driver.get("https://dsportalapp.herokuapp.com/tree/");
				String o="Overview of Trees";
				if(o.equals(option)) {
					
				driver.findElement(overview).click();
				}
				String o1="Terminologies";
				if(o1.equals(option))  {
					
					driver.findElement(terminologies).click();
				}
				String o2="Types of Trees";
				if(o2.equals(option)) {
				driver.findElement(typesoftrees).click();
				}
				o="Tree Traversals";
		if(o.equals(option)) {
				driver.findElement(treetraversals).click();
		}
		o="Traversals-Illustration";
		if(o.equals(option)) {
				driver.findElement(traversalsillustration).click();
		}
		o="Binary Trees";
		if(o.equals(option)) {
				driver.findElement(binarytrees).click();
		}
		o="Types of Binary Trees";
		if(o.equals(option)) {
				driver.findElement(typesofbinarytrees).click();
		}
		o="Implementation in Python";
		if(o.equals(option)) {
				driver.findElement(implementationinpython).click();
		}
		o="Binary Tree Traversals";
		if(o.equals(option)) {
				driver.findElement(binarytreetraversals).click();
		}
		o="Implementation of Binary Trees";
		if(o.equals(option)) {
				driver.findElement(implementationofbinarytrees).click();
		}
		o="Applications of Binary trees";
		if(o.equals(option)) {
				driver.findElement(applicationsofbinarytrees).click();
		}
		o="Binary Search Trees";
		if(o.equals(option)) {
				driver.findElement(binarysearchtrees).click();
		}
		o="Implementation Of BST";
		if(o.equals(option)) {
				driver.findElement(implementationOfBST).click();
		}
			}
			public void tryhere() throws IOException, CsvException{
			driver.findElement(tryhere).click();
			FileInputStream exc= new FileInputStream(".//src/test/resources/Excel/square.xlsx");
			XSSFWorkbook work= new XSSFWorkbook(exc);
			XSSFSheet sheet =work.getSheetAt(0);
			int row= sheet.getLastRowNum();
		
			for(int r=0;r<=row;r++) 
			{
				
			XSSFRow rr=sheet.getRow(r);
			

			XSSFCell usr=rr.getCell(0);
			
		

			driver.findElement(textarea).sendKeys(usr.getStringCellValue());
			driver.findElement(textarea).sendKeys("\n");
			
			 }
			
			
			work.close();
			
			}
			
			
			public void run() {
			driver.findElement(run).click();
			
			}
			public void output() {
				System.out.println("*****"+driver.findElement(output).getText());
			}
			
		
		public void signout() {
			driver.get("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(signout).click();
		}
}
