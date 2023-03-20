package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadas {
	
	@FindBy(xpath = "//li[@class='menuparent']")
	private WebElement jwellary;
	
	
	public void moveToJwellary(WebDriver driver) {
	Actions a = new Actions(driver);
	a.moveToElement(jwellary).perform();
	}
	@FindBy(xpath = "//ul[@class='odd-even-bg']/li//a[text()='Kadas']")
	private WebElement kadas;
	
	public void kadasClick() {
		kadas.click();
	}

	@FindBy(xpath = "//img[@alt='The Bhargav Kada For Him']")
	private WebElement select;
	
	public void selectClick() {
		select.click();
	}
	
	@FindBy(id="buy-now")
	private WebElement buy;
	
	public void buyClick() {
		buy.click();
	}
	
	@FindBy(xpath= "//div[text()='* This field is required']")
	private WebElement error;
	
	public String errorSms() {
		return error.getText();
	}

	public Kadas(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
