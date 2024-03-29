package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement search;
	
	public void sendText(String text) {
		
		search.sendKeys(text,Keys.ENTER);
	}

	public SeleniumHome(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	}
	}
		
	
