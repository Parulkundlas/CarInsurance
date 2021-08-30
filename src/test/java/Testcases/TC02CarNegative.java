package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02CarNegative {
	WebDriver driver;

	@Test
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Negative Test Case Submit without filling all required Details");
		driver.manage().window().maximize();
		driver.get("https://car.iselect.com.au/car/compare-car-insurance/gatewayStore");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/section[1]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bui-22\"]/div/div/ul/li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bui-23\"]/div/div/ul/li[1]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bui-24\"]/div/div/ul/li[1]/div")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"bui-28\"]/div/div/ul/li[1]/div")).click();

		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/div[4]/div/div/div/div"));

		Actions act1 = new Actions(driver);
		act1.moveToElement(ele2).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[3]/div/div/div[1]/div/label/span")).click();
		

	}

}