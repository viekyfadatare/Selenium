package Pom;

import org.openqa.selenium.Keys; 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueStone {

	@FindBy(name = "search_query")
	private WebElement search;

	
	public void sendText(String text) {
		search.sendKeys(text, Keys.ENTER);
	}

	
	@FindBy(xpath = "//span[@class='items']/a[text()='Rings']")
	private WebElement ring;

	public void ringclick() {
		ring.click();
	}
	
	@FindBy(xpath = "//img[@alt='The Felicita Top Open Ring']")
	private WebElement select;
	
	public void selctClick() {
		select.click();
	}
	
	@FindBy(id ="buy-now")
	private WebElement buy;
	
	public void buyClick() {
		buy.click();
	}
	
	@FindBy(xpath="//div[text()='* This field is required']")
	private WebElement error;
	
	public String errorMassage() {
		return error.getText();
	}

	public BlueStone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
