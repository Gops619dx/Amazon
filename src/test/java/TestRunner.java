import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_class;
import com.utility.ReadExcelData;

public class TestRunner extends Base_class {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String userName = ReadExcelData.readParticularData(3,0);
		driver.findElement(By.id("email")).sendKeys(userName);
		
		
		String password = ReadExcelData.readParticularData(3,1);
		driver.findElement(By.id("pass")).sendKeys(password);	
	}

}
