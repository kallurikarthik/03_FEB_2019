package framework.junit.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CT_SearchFlights 
{
	
	public CT_SearchFlights(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Looking object at webpage
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement OneWay_Rbtn;
	
	@FindBy(how=How.ID,using="RoundTrip") 
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath="//input[@value='MultiCity']") 
	public WebElement MultiCity_Rbtn;
	
	@FindBy(xpath="//input[@name='origin']") 
	public WebElement From_AEB;
	
	@FindBy(xpath = "//input[@name='destination']") 
	public WebElement To_AEB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]") 
	public WebElement Cities_HYD;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]") 
	public WebElement Citites_DEL;
	
	@FindBy(xpath = "//select[@id='Adults']")
	public WebElement Adults_Dropdown;
	
	@FindBy(xpath = "//select[@id='Childrens']")
	public WebElement  Childresn_Dropdown;
	
	@FindBy(xpath = "//select[@id='Infants']")
	public WebElement Infants_Dropdown;
	
	@FindBy(xpath = "//a[contains(@id,'MoreOptionsLink')]")
	public WebElement MoreOptions_link;
	
	@FindBy(xpath = "//input[@id='DepartDate']")
	public WebElement DepartureDate_Editbox;
	
	
	//Page Factory methods
	
	public void Click_oneway()
	{
		OneWay_Rbtn.click();
	}
	
	public void Click_Roundtrip()
	{
		Roundtrip_Rbtn.click();
	}
	
	
	public void Click_multicity()
	{
		MultiCity_Rbtn.click();
	}
	
	public void Enter_From_City(String Cityname)
	{
		From_AEB.clear();
		From_AEB.sendKeys(Cityname);
	}
	
	public void Select_HYD_City()
	{
		Cities_HYD.click();
	}
	
	
	public void User_Search(String Departure_City,String ArrivalCity ) throws Exception
	{
		OneWay_Rbtn.click();
		
		From_AEB.clear();
		From_AEB.sendKeys(Departure_City);
		Thread.sleep(5000);
		Cities_HYD.click();
		
		To_AEB.clear();
		To_AEB.sendKeys(ArrivalCity);
		Thread.sleep(5000);
		Citites_DEL.click();
		
	}
	
	

}
