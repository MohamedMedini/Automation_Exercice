package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {
	
	WebDriver driver;
	
	
	//creations des constructeurs
	public PagePaiement (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	
	
	
	//identifications des elements (design pattern)
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	public static WebElement bt_checkout;
	
	@FindBy(how=How.XPATH,using="//a[text()='Place Order']")
	public static WebElement bt_placeOrder;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='name-on-card']")
	public static WebElement CardName;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='card-number']")
	public static WebElement CardNumber;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='cvc']")
	public static WebElement CVC;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='expiry-month']")
	public static WebElement ExMonth;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='expiry-year']")
	public static WebElement ExYear;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='pay-button']")
	public static WebElement ConfPay;
	
	@FindBy(how=How.XPATH,using="//b[text()='Order Placed!']")
	WebElement msg_conf;
	
	
	
	
	
	//creation des methodes
	public void cliquer_Checkout() {
		bt_checkout.click();
	}
	public void cliquer_PlaceOrder() {
		bt_placeOrder.click();
	}
	public void saisir_CardName (String CName ) {
		CardName.sendKeys(CName);
	}
	public void saisir_CardNumber (String CNumber ) {
		CardNumber.sendKeys(CNumber);
	}
	public void saisir_CVC (String cvc ) {
		CVC.sendKeys(cvc);
	}
	public void saisir_ExMonth (String month ) {
		ExMonth.sendKeys(month);
	}
	public void saisir_ExYear (String year ) {
		ExYear.sendKeys(year);
	}
	public void cliquer_PayConf ()  {
		ConfPay.click();
	}
	public String textConf() {
		String text_obtenu= msg_conf.getText() ;
		return text_obtenu;
	}
	
	
}
