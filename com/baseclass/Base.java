package com.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
public static WebDriver get_driver(String type) {
	
	if (type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver2//chromedriver.exe");
		driver = new ChromeDriver();

	}
	

	else if (type.equalsIgnoreCase("firefox")) {
	}
	driver.manage().window().maximize();
	return driver;
	
}
	public static void clickonElement(WebElement element) {
		element.click();
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
}
	
	public static void quite() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void navigateTo(String url)
	{
		driver.navigate().to(url);
		
	}	
	
	public static void navigateback()
	{
		driver.navigate().back();
	}
	
	public static void navigateForword()
	{
		driver.navigate().forward();
	}
	public static void navigateRefresh()
	{
		driver.navigate().refresh();
	}
	
	
	public static void title(String url) {
		driver.getTitle();
		System.out.println(url);
	}

	public static void currentUrl(String url) {
		driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void getText(WebElement element) {
		element.getText();
	}
	public static void clear(WebElement element) {
		element.clear();
	}

	public static void getAttribute(WebElement element, String s) {
		element.getAttribute(s);
	}
	
	
	//alert
	
	public static void alert(WebElement element, String type, String input) {
		if (type.equalsIgnoreCase("simple")) {
			element.click();
			Alert al = driver.switchTo().alert();
			al.accept();
			al.getText();
		} else if (type.equalsIgnoreCase("confirm")) {
			element.click();
			Alert al = driver.switchTo().alert();
			al.accept();
			al.dismiss();
		} else if (type.equalsIgnoreCase("prompt")) {
			element.click();
			Alert al = driver.switchTo().alert();
			al.sendKeys(input);
		} else
			System.out.println("invalid type");

	}
//		public static void checkBox(WebElement element) {
//			element.click();
//		}
//
//		public static void isEnable(WebElement element) {
//			element.isEnabled();
//
//		}
//
//		public static void isDisplay(WebElement element) {
//			element.isDisplayed();
//		}
//
//		public static void isSelect(WebElement element){
//			element.isSelected();
//		}
//		
		//jse
	public static void javascript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	//thread
	public static void sleep(int time) throws Throwable {
		Thread.sleep(time);
	}
	
	
	
	//*************************************************
	
	public static void dropDown_multiple(WebElement element, String type) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("Get option")) {
		} else if (type.equalsIgnoreCase("get first Select option")) {
			WebElement First = s.getFirstSelectedOption();

			System.out.println(First);
		} else if (type.equalsIgnoreCase("get all selected option")) {
			java.util.List<WebElement> all = s.getAllSelectedOptions();
			System.out.println(all);
		} else if (type.equalsIgnoreCase("multiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
		}
	
	
	public static void dropDown_single(WebElement element, String type, String values) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(values);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(values);
		} else {
			System.out.println("invalid type");
		}
	}
	
	//schot
	
	public static void ScreenShot(String location) throws Throwable {
		TakesScreenshot s =(TakesScreenshot) driver;
		File Source = s.getScreenshotAs(OutputType.FILE);
		File Destination =new File(location);
		FileUtils.copyFile(Source, Destination);
	
	}
	
	//robot
	public static void robot(String type) throws Throwable {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("keypress")) {
			r.keyPress(KeyEvent.VK_DOWN);

		} else if (type.equalsIgnoreCase("KeyRelese")) {
			r.keyRelease(KeyEvent.VK_DOWN);
		} else {
			System.out.println("invalid type");
		}
	}
		
	//action
		public static void action(WebElement element, String type, String input, WebElement src, WebElement dest) {
			Actions act = new Actions(driver);
			if (type.equalsIgnoreCase("click")) {
				act.click(element).perform();
			} else if (type.equalsIgnoreCase("Double click")) {
				act.doubleClick(element).perform();
			} else if (type.equalsIgnoreCase("moveToElement")) {
				act.moveToElement(element).perform();
			} else if (type.equalsIgnoreCase("Drag and Drop")) {
				act.dragAndDrop(src, dest).perform();
			} else if (type.equalsIgnoreCase("click and hold")) {
				act.clickAndHold(element).perform();
			} else if (type.equalsIgnoreCase("contextclick")) {
				act.contextClick(element).perform();
			} else if (type.equalsIgnoreCase("sendkeys")) {
				element.sendKeys(input);
			} else {
				System.out.println("invalid type");
			}
		}
	
	
	//frames
	
		public static void frames(WebElement element, String input, String type) {
			if (type.equalsIgnoreCase("next frame")) {
				driver.switchTo().frame(element);
			} else if (type.equalsIgnoreCase("Default")) {
				driver.switchTo().defaultContent();
			} else if (type.equalsIgnoreCase("size")) {
				int size = Integer.parseInt(input);
				System.out.println(size);
			} else {
				System.out.println("Invalid Type");
			}
		}
	
		public static void frame() {
			driver.switchTo().frame(0);

			}
			public static void  defaultcontent() {
			driver.switchTo().defaultContent();
			}
	
	
	
	
	
	
	
	
	
	
}