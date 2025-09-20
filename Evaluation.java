package Evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Evaluation {
 WebDriver driver;	
 
 @BeforeClass
 public void setUp() {
	driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	 
 }
 @Test
 public void FormTests() {
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.id("userName")).sendKeys("Diwakar Kumar");
	driver.findElement(By.id("userEmail")).sendKeys("diw2akaraubr@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("Aurangabad,Bihar");
	driver.findElement(By.id("permanentAddress")).sendKeys("Aurangabad,Bihar");
	driver.findElement(By.id("submit")).click();
 }
 
 @Test
 public void checkBox() {
	 driver.get("https://demoqa.com/checkbox");
	 driver.findElement(By.className("rct-icon rct-icon-check")).click();
 }
 @AfterClass
 public void tearDown() {
	 
 }
}
