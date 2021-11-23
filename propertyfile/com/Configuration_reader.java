package propertyfile.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	public static Properties p;
	public  Configuration_reader() throws IOException {
		File f = new File("C:\\Users\\91741\\eclipse-workspace\\Selenium1\\adactin_mav\\src\\main\\java\\propertyfile\\com\\Configuration.properties");
FileInputStream fis = new FileInputStream(f) ;
 p = new Properties();
 p.load(fis);

	}
public String getusername()throws Throwable {
String username = p.getProperty("username");
return username;
}
public String getpassword()throws Throwable {
	String password = p.getProperty("password");
	return password;
}
}