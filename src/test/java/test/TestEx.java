package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestEx extends BaseTest
{
	@Test
	public void testExample()
	{
		WebElement name = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		name.sendKeys("sushma");
		pass.sendKeys("ssss");
		ele.click();
	}

}
