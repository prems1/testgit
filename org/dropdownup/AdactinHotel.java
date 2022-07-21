package org.dropdownup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\selenium\\DropDownUP\\driver\\chromedriver1.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement txtuser = driver.findElement(By.id("username"));
	txtuser.sendKeys("prem6545");
	WebElement txtpass = driver.findElement(By.id("password"));
	txtpass.sendKeys("prem4565");
	WebElement btnlog = driver.findElement(By.id("login"));
	btnlog.click();
	WebElement lnkloca = driver.findElement(By.id("location"));
	Select select = new Select(lnkloca);
	select.selectByIndex(8);
	WebElement lnkhote = driver.findElement(By.id("hotels"));
	Select select1 = new Select(lnkhote);
	select1.selectByIndex(2);
	WebElement lnkroom = driver.findElement(By.id("room_type"));
	Select select2 = new Select(lnkroom);
	select2.selectByIndex(4);
	WebElement lnkroomnos = driver.findElement(By.id("room_nos"));
	Select select3 = new Select(lnkroomnos);
	select3.selectByIndex(7);
	WebElement txtcheckin = driver.findElement(By.id("datepick_in"));
	txtcheckin.sendKeys("03/06/2022");
	WebElement txtcheckout = driver.findElement(By.id("datepick_out"));
	txtcheckout.sendKeys("13/06/2022");
	WebElement lnkroominfo = driver.findElement(By.id("adult_room"));
	Select select4 = new Select(lnkroominfo);
	select4.selectByIndex(3);
	WebElement lnkroominfo1 = driver.findElement(By.id("child_room"));
	Select select5 = new Select(lnkroominfo1);
	select5.selectByIndex(1);
	WebElement btnsea = driver.findElement(By.id("Submit"));
	btnsea.click();
	WebElement checkbox = driver.findElement(By.id("radiobutton_0"));
	checkbox.click();
	WebElement btncon = driver.findElement(By.id("continue"));
	btncon.click();
	WebElement txtfirstname = driver.findElement(By.id("first_name"));
	txtfirstname.sendKeys("prem");
	WebElement txtlastname = driver.findElement(By.id("last_name"));
	txtlastname.sendKeys("kumar");
	WebElement txtbill = driver.findElement(By.id("address"));
	txtbill.sendKeys("greens tech thoraipakkam");
	WebElement txtcc = driver.findElement(By.id("cc_num"));
	txtcc.sendKeys("6852 2356 2154 5214");
	WebElement lnkcc = driver.findElement(By.id("cc_type"));
	Select select6 = new Select(lnkcc);
	select6.selectByIndex(2);
	WebElement lnkexpda = driver.findElement(By.id("cc_exp_month"));
	Select select7 = new Select(lnkexpda);
	select7.selectByIndex(9);
	WebElement lnkexpye = driver.findElement(By.id("cc_exp_year"));
	Select select8 = new Select(lnkexpye);
	select8.selectByIndex(12);
	WebElement lnkcvv = driver.findElement(By.id("cc_cvv"));
	lnkcvv.sendKeys("967");
	WebElement btnbook = driver.findElement(By.id("book_now"));
	btnbook.click();
	//WebElement lnkord = driver.findElement(By.id("order_no"));
	//lnkord.getText(lnkord);
	
	

}
}
