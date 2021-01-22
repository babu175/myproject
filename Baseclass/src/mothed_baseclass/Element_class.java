package mothed_baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Element_class extends Baseclass {

	public static void main(String[] args) throws Exception   {
		getDriver("chrome");
		getUrl("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("http://automationpractice.com/index.php");
		WebElement search =driver.findElement(By.xpath("//*[@name='btnK']"));
		clickElement(search);
		Actions action = new Actions(driver); 
		WebElement click = driver.findElement(By.xpath("(//*[@class='LC20lb DKV0Md'])[1]"));
        action.contextClick(click).perform();
        Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.switchTo().window("http://automationpractice.com/index.php");
		
		
		
		}

	}


