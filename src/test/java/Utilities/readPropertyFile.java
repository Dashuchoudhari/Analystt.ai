package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
	
	public static void main(String[]args) throws IOException {
	
	FileReader fr = new FileReader("C:\\Users\\BusinessComputers.in\\eclipse-workspace\\newSeleniunProject\\src\\test\\resources\\configFiles\\congig.properties");

	
	Properties p =new Properties();
	
	p.load(fr);
	
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("testURL"));

	
}
}
