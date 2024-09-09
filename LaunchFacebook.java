package week3Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dhanush");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dhanush10@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dhanush@124");

		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println(" verified");

		} else {
			System.out.println("not verified");
		}

	}

}
