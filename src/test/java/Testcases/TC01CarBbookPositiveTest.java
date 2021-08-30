package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01CarBbookPositiveTest {
	WebDriver driver;

	@Test
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
		driver.findElement(By.xpath("//*[@id=\"bui-12\"]/div/div/ul/li[1]/div")).click();

		WebElement ele23 = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[3]/div/div/div/div"));

		Actions act12 = new Actions(driver);
		act12.moveToElement(ele23).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bui-13\"]/div/div/ul/li[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[5]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[8]/div[2]/div/div[1]/button[2]"))
				.click();

		WebElement ele444 = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[2]/div/div[10]/div/div/div/div"));

		Actions act123 = new Actions(driver);
		act123.moveToElement(ele444).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"bui-19\"]/div/div/ul/li[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section[3]/div/div/div[1]/div/label/span")).click();

	}

}