package com.sikuli;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AutomationProject
{
	@Test
	public void show() throws FindFailed
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://calculator.com/");
		Screen s = new Screen();
		ImagePath.add("C:\\Users\\javed\\Desktop\\OnlineCalculator.sikuli");
		//s.click("FullCalculator.png");
		s.click("Four.png");
		s.click("Multiply.png");
		s.click("Five.png");
		s.click("Equal.png");
	}
}