package proj.com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base;
import com.pom.Bookhotel;
import com.pom.Bookingconfirmation;
import com.pom.Homepage;
import com.pom.Search_hotel;
import com.pom.Selecthotel;

import page_obj_manager.Pom;
import propertyfile.com.File_reader_manager;

public class Proj_copy extends Base {
	
public static WebDriver driver = get_driver("chrome");		
//	public static Homepage home= new Homepage(driver);
//	public static Search_hotel searchhot=new Search_hotel(driver);
//	public static Selecthotel selhotel = new Selecthotel(driver);
//	public static Bookhotel bhotel = new Bookhotel(driver);
//
//	public static Bookingconfirmation bookconf= new Bookingconfirmation(driver);

	public static Pom pom= new Pom(driver);

	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91741\\eclipse-workspace\\Selenium1\\Sel_prac\\Driver2\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(); 

		driver.get("https://adactinhotelapp.com/");

		Thread.sleep(3000);

//		inputValues(pom.getinstancehome().getUsername(),"elachandru");

//inputValues(pom.getinstancehome().getUsername(), "elachandru");
        String username = File_reader_manager.getinstance_frm().getinstance_cr().getusername();
        inputValues(pom.getinstancehome().getUsername(), username);
        
        
        String password = File_reader_manager.getinstance_frm().getinstance_cr().getpassword();
    	inputValues(pom.getinstancehome().getPassword(),password);

		clickonElement(pom.getinstancehome().getLoginbutton());


		
		
		dropDown_single(pom.getInstancesearchhot().getLocation(), "Value","Sydney");
		
		dropDown_single(pom.getInstancesearchhot().getHotel(), "Value","Hotel Sunshine");

		dropDown_single(pom.getInstancesearchhot().getRoomtype(), "Value","Double");


		dropDown_single(pom.getInstancesearchhot().getRoomno(), "Value","4");



		inputValues(pom.getInstancesearchhot().getCheckin(),"15/11/2021");

		inputValues(pom.getInstancesearchhot().getCheckout(),"16/11/2021");
		dropDown_single(pom.getInstancesearchhot().getAdultroom(), "Value","2");

		
		
	dropDown_single(pom.getInstancesearchhot().getChildrenroom(), "Value","2");

	
	clickonElement(pom.getInstancesearchhot().getSubmit());

	
	clickonElement(pom.getinstanceselhotel().getRadio());

		clickonElement(pom.getinstanceselhotel().getClickcontinue());
		

		inputValues(pom.getinstancebhotel().getFirstname(),"elakiya");
		inputValues(pom.getinstancebhotel().getLname(), "hemachandran");

		inputValues(pom.getinstancebhotel().getAdress(),"no 10 a , duplex building ");

		inputValues(pom.getinstancebhotel().getCno(), "1234567890987647");
		
		dropDown_single(pom.getinstancebhotel().getCtype(), "value", "VISA");

		
		dropDown_single(pom.getinstancebhotel().getCexpmonth(), "value", "5");

		dropDown_single(pom.getinstancebhotel().getCexpyear(), "value", "2022");

		
		inputValues(pom.getinstancebhotel().getCvv(), "775");
		
		
		clickonElement(pom.getinstancebhotel().getBooknow());
		

		
		clickonElement(pom.getinstancebookconf().getMyitinerary());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		
	clickonElement(pom.getinstancebookconf().getLogout());
	}
	}

