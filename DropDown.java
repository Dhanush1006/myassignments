package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
 public static void main(String[] args) throws InterruptedException {
	
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.leafground.com/select.xhtml");
	 WebElement course = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	 course.sendKeys("selenium");
	 driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	 driver.findElement(By.xpath("//li[text()='India']")).click();
	 driver.findElement(By.xpath("//label[text()='Select City']")).click();
	 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	 Thread.sleep(1000);
	 WebElement element= driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
	 element.sendKeys("Selenium");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	 WebElement element2 = driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
	 element2.sendKeys("Play");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
	 Thread.sleep(1000);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
	 driver.findElement(By.xpath("//li[@data-label='English']")).click();
	 driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
	 driver.findElement(By.xpath("//li[@data-label='One']")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
