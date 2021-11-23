package page_obj_manager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Bookhotel;
import com.pom.Bookingconfirmation;
import com.pom.Homepage;
import com.pom.Search_hotel;
import com.pom.Selecthotel;

public class Pom {
public WebDriver driver;
private Homepage home;
private Search_hotel searchhot;
private Selecthotel selhotel;
private Bookhotel bhotel;
private Bookingconfirmation bookconf;

public Pom(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}

public Homepage getinstancehome()
{
	home = new Homepage(driver);
	return home;
}

public Search_hotel getInstancesearchhot()
{
	searchhot = new Search_hotel(driver);
	return searchhot;
}

public Selecthotel getinstanceselhotel()
{
	selhotel = new Selecthotel(driver);
	return selhotel;
			
}

public Bookhotel getinstancebhotel()
{
	bhotel = new Bookhotel(driver);
	return bhotel;
}

public Bookingconfirmation getinstancebookconf()
{
	bookconf = new Bookingconfirmation(driver);
	return bookconf;
}
}

