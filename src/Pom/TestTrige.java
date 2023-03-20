package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestTrige {

	@FindBy(xpath = "//div[@class='SearchBlockUIstyles__RadioButtonWrap-sc-fity7j-4 eEVxPE'][1]")
	private WebElement radio;
	public void radioClick() {
		radio.click();
	}
	
	@FindBy(xpath="//input[@data-testid='home-autosuggest-input']")
	private WebElement loc;
	public void locClick() {
		loc.click();		
	}
	
	@FindBy(xpath="//ul[@class='TrendingDestinationsUI__ListTrendInnerWrap-sc-qz22gb-2 sUlOI']//p[contains(.,('Udaipur'))]")
	private WebElement city;
	public void cityClick() {
		city.click();		
	}
	
	@FindBy(xpath="//div[@data-testid='openCheckinCalendar']/div")
	private WebElement checkin;
	public void checkinClick() {
		checkin.click();		
	}
	
	@FindBy(xpath="//span[@data-testid='date_17_8_2021']")
	private WebElement checkinD;
	public void checkinDClick() {
		checkinD.click();		
	}
	
	@FindBy(xpath="//div[@data-testid='openCheckoutCalendar']/div")
	private WebElement checkout;
	public void checkoutClick() {
		checkout.click();
			
	}
	
	@FindBy(xpath="//span[@data-testid='date_26_8_2021']")
	private WebElement checkoutD;
	public void checkoutDClick() {
		checkoutD.click();	
	}
	
	@FindBy(xpath = "//div[@class='SearchBlockUIstyles__PaxCountWrap-sc-fity7j-9 heYAZX']/div")
	private WebElement geust;
    public void geustClick() {
    	geust.click();
    }
    
	@FindBy(xpath = "//div[@class='PaxWidgetstyles__ContentWrapperDiv-sc-gv3w6r-1 gwNJlK']/div[1]//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'][2]")
	private WebElement plus1;
    public void plus1Click() {
    	plus1.click();
    }
    
    @FindBy(xpath = "//div[@class='PaxWidgetstyles__ContentWrapperDiv-sc-gv3w6r-1 gwNJlK']/div[2]//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'][2]")
	private WebElement plus2;
    public void plus2Click() {
    	plus2.click();
    }
    
    @FindBy(xpath = "//div[@class='PaxWidgetstyles__ContentWrapperDiv-sc-gv3w6r-1 gwNJlK']/div[3]//span[@class='PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV'][2]")
  	private WebElement plus3;
      public void plus3Click() {
      	plus3.click();
      }

      @FindBy(xpath = "//div[@class='PaxWidgetstyles__ButtonWrapperDiv-sc-gv3w6r-10 bVzuTd']/button")
    	private WebElement done;
      public void doneClick() {
        	done.click();
        }
      
      @FindBy(xpath = "//button[@data-testid='searchHotelBtn']")
  	private WebElement search;
    public void searchClick() {
    	search.click();
      }
    public TestTrige(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	}
