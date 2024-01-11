package pom;

//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
public class Arraypom {

	public WebDriver driver;
	 By dsStart =By.xpath("//div[3]/div[2]/div/div/a");
	 By arrayphython=By.xpath("//*[contains(text(),'Arrays in ')]");
	 By tryhere=By.xpath("//*[text()='Try here>>>']");
	 By textarea=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	 By run=By.xpath("//*[text()='Run']");
	 By output=By.xpath("//*[@id=\"output\"]");
	 By arraylist=By.xpath("/html/body/div[2]/ul[2]/a");
	 By arrayoperations =By.linkText("Basic Operations in Lists");
	 By arrayapplication= By.linkText("Applications of Array");
	 By practisequestions= By.xpath("//*[@id=\"content\"]/a");
	 By ques1=By.linkText("Search the array");
	 By ques2=By.linkText("Max Consecutive Ones");
	 By ques3=By.linkText("Find Numbers with Even Number of Digits");
	 By ques4=By.xpath("//div[5]/a");
	 By questryhere= By.xpath("//*[@id=\"answer_form\"]/div/div/div[5]");
	 By quesrun= By.xpath("//*[@id=\"answer_form\"]/button");
	 By quessubmit= By.xpath("//*[@id=\"answer_form\"]/input[2]");;
	By submiterror= By.xpath("//*[@id=\"output\"]");		 
	By signout =By.xpath("//*[text()='Sign out']");
	public Arraypom(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebDriver arraystart() {
	driver.findElement(dsStart).click();
	return driver;
	}
	
	public void arrayphython(String option) {
		String o="Arrays in Python";
		if(o.equals(option)) {
			
		driver.findElement(arrayphython).click();
		}
		String o1="Arrays using List";
		if(o1.equals(option))  {
			
			driver.findElement(arraylist).click();
		}
		String o2="Basic operations in List";
		if(o2.equals(option)) {
		driver.findElement(arrayapplication).click();
		}
		o="Applications of Array";
if(o.equals(option)) {
		driver.findElement(arrayoperations).click();
}
	}
	public void tryhere() throws IOException, CsvException{
	driver.findElement(tryhere).click();
	try {
	CSVReader reader = new CSVReader(new FileReader(".//src/test/resources/phython/squareroot.csv"));
	List<String[]> li=reader.readAll();
	 Iterator<String[]>i1= li.iterator();
	    
	 // Iterate all values 
	 while(i1.hasNext()){
	 String[] str=i1.next();
	   
	 //System.out.print(" Values are ");

	 for(int i=0;i<str.length;i++)
	{
		 //System.out.print(" "+str[i]);
		 driver.findElement(textarea).sendKeys(str[i]+"\n");

	}
	 } 
	//Scanner sc= new Scanner(new File(".//src/test/resources/phython/squareroot.csv"));
	//sc.useDelimiter("//a");
	//driver.findElement(textarea).sendKeys(sc.next());
	}
	catch(NullPointerException e) {
		e.getMessage();
	}
	
	}
	public void run() {
	driver.findElement(run).click();
	
	}
	public void output() {
		System.out.println("*****"+driver.findElement(output).getText());
	}
	public void pq() {
		driver.findElement(practisequestions).click();
		//System.out.println("");
	}
	public void question(String option) {
		String o="Search the array";
		if(o.equals(option)) {
			
		driver.findElement(ques1).click();
		}
		String o1="Max Consecutive Ones";
		if(o1.equals(option))  {
			
			driver.findElement(ques2).click();
		}
		String o2="Find Numbers with Even Number of Digits";
		if(o2.equals(option)) {
		driver.findElement(ques3).click();
		}
		o="Squares of  a Sorted Array";
if(o.equals(option)) {
		driver.findElement(ques4).click();
	}
	}
public void quesrun() {
	driver.findElement(quesrun).click();
}
public void quesalert() {
	System.out.println("****** "+driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
}
public void quessubmit() {
	driver.findElement(quessubmit).click();
	System.out.println("****** Submit error: "+driver.findElement(submiterror).getText());
}
public void signout() {
	driver.get("https://dsportalapp.herokuapp.com/array/");
	driver.findElement(signout).click();
}
}

