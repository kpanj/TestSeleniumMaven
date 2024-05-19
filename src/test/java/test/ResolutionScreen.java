package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ResolutionScreen {
	@Test
	public void testRun() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Dimension d = new Dimension(1024, 768);
		driver.manage().window().setSize(d);
		Point position = new Point(100, 50);
        driver.manage().window().setPosition(position);
        driver.quit();
	}
}
