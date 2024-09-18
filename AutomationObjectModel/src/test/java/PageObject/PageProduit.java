package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduit {
	
	public WebDriver driver;
	
	
	    //creations des constructeurs
	
		public PageProduit(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		}

	
	    //identifications des elements (design pattern)
		@FindBy(how=How.XPATH,using="//a[text()=' Products']")
		public static WebElement product_bt;
		
		@FindBy(how=How.XPATH,using="//img[@alt='ecommerce website products']")
		public static List<WebElement> product;
		
		@FindBy(how=How.XPATH,using="//a[@class='btn btn-default add-to-cart']")
		public static List<WebElement> add;
		
		@FindBy(how=How.XPATH,using="//button[@data-dismiss='modal']")
		public static WebElement ContShop_bt;
		
		@FindBy(how=How.XPATH,using="//u[normalize-space()='View Cart']")
		public static WebElement ViewCart_bt;
		
		@FindBy(how=How.XPATH,using="//a[text()='Men Tshirt']")
		WebElement prod1;
		
		@FindBy(how=How.XPATH,using="//a[text()='Stylish Dress']")
		WebElement prod2;
		
		
		//creation des methodes 
		public void cliquerPoduct() {
			product_bt.click();
		}
	    public void choisir_Produit1() {
	    	Actions action = new Actions(driver);
			action.moveToElement(product.get(1)).perform();
	    }
	    public void cliquer_Add1() {
	    	add.get(2).click();
	    }
	    public void cliquer_ContShop() {
	    	ContShop_bt.click();	
	    }
	    public void choisir_Produit2() {
	    	Actions action = new Actions(driver);
	    	action.moveToElement(product.get(3)).perform();	
	    }
	    public void cliquer_Add2() {
	    	add.get(6).click();
	    }
	    public void cliquer_ViewCart() {
	    	ViewCart_bt.click();
	    }
	  
	    public String prod1_ajoute() {
			   String prod1_obtenu=prod1.getText();
			   return prod1_obtenu;	
	    }
	    public String prod2_ajoute() {
			   String prod2_obtenu=prod2.getText();
			   return prod2_obtenu;	
	    }



}
