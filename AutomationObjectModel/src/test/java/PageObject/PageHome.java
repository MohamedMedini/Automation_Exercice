package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageHome {
	
	public  WebDriver driver; 
	
	
	//creation des constructeurs (instance)
	public PageHome(WebDriver driver) {
		
	this.driver =driver;
	PageFactory.initElements(driver, this);	
	}
	
	
	//identification des elements (design pattern)
	@FindBy(how=How.XPATH,using="//a[text()=' Signup / Login']")
	public static WebElement bt_signuplogin;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-name']")
	public WebElement name;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-email']")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='signup-button']")
	public WebElement signup_bt;
	
	@FindBy(how=How.ID,using="id_gender1")
	public WebElement  mr_check;
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement  mme_check;
	
	@FindBy(how=How.ID,using="password")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//select[@id='days']")
	public WebElement day_list;
	@FindBy(how=How.XPATH,using="//select[@id='months']")
	public WebElement month_list;
	@FindBy(how=How.XPATH,using="//select[@id='years']")
	public WebElement year_list;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	public  List<WebElement> check ; 
	
	@FindBy(how=How.ID,using="first_name")
	public WebElement first_name;
	@FindBy(how=How.ID,using="last_name")
	public WebElement last_name;
	
	@FindBy(how=How.ID,using="company")
	public WebElement company;
	
	@FindBy(how=How.ID,using="address1")
	public WebElement address;
	@FindBy(how=How.ID,using="country")
	public WebElement country;
	@FindBy(how=How.ID,using="state")
	public WebElement state;
	@FindBy(how=How.ID,using="city")
	public WebElement city;
	@FindBy(how=How.ID,using="zipcode")
	public WebElement zipcode;
	
	@FindBy(how=How.ID,using="mobile_number")
	public WebElement mobile_number;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='create-account']")
	public WebElement create_button;
	
	@FindBy(how=How.XPATH,using="//b[text()='Account Created!']")
	WebElement text_compte_cree;
	
	
	
	//Authetification Page
	
	//identification des elements
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-email']")
	public WebElement email_box;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-password']")
	public WebElement password_box;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='login-button']")
	public WebElement login_bt;
	
	@FindBy(how=How.XPATH,using="//b[text()='mohamed']")
	WebElement mon_profil;
	
	//creation des methode 
	public void ecrire_email(String email) {
	    email_box.sendKeys(email);
	}
	
	public void ecrire_password(String password) {
		password_box.sendKeys(password);
	}
	
	public void cliquer_login() {
		login_bt.click();
	}
	
	public String Profil_affiche() {
		String profil_obtenu=mon_profil.getText();
		return profil_obtenu;
	}
	
	
	
	//creation des methode 
	public void GetUrl(String url) {
		driver.get(url);
	}
	
	public void cliquer_bt_signlogin() {
		bt_signuplogin.click();		
	}
	
	public void saisir_nom(String Name) {
		name.sendKeys(Name);	
	}
	
	public void saisir_email(String Email) {
		email.sendKeys(Email);	
	}
	
	public void cliquer_signup() {	
		signup_bt.click();
	}
	
	public void je_selectionne_le_genre_mr_ou_mme (String genre) {	
		
		if(genre.equals("Mr")) {
         	mr_check.click();
		    }
		else {	
		    	mme_check.click();
		    }
	}
	
	public void saisir_mot_de_passe(String mdp) {	
		 password.sendKeys(mdp);
	}
	
	public void selectionne_la_date_de_naissance (String jour, String mois, String annee) {	
		Select liste_day=new Select(day_list);
		liste_day.selectByValue(jour);
		Select liste_month=new Select(month_list);
		liste_month.selectByValue(mois);
		Select liste_year=new Select(year_list);
		liste_year.selectByValue(annee);
	}
	
	public void cocher_les_options() {	

		 check.get(1).click();
		 check.get(0).click();	
	}
	public void cocher_case() {	

		 check.get(1).click();	
	}
	
	public void saisir_first_name(String first) {
		first_name.sendKeys(first);
	}
	public void saisir_last_name(String last) {
		last_name.sendKeys(last);
	}
	
	public void saisir_company(String comp) {
		company.sendKeys(comp);
	}
	
	public void saisir_address(String add) {
		address.sendKeys(add);
	}
	public void saisir_country(String count) {
		Select country_list=new Select (country);
        country_list.selectByValue(count);
	}
	public void saisir_state(String stat) {
		state.sendKeys(stat);
	}
	public void saisir_city(String cit) {
		city.sendKeys(cit);
	}
	public void saisir_zip(String zcode) {
		zipcode.sendKeys(zcode);
	}
	
	public void  saisir_phone_number(String phone) {
		mobile_number.sendKeys(phone);
	}
	
	public void cliquer_sur_create_account() {
		create_button.click();
		
	}
	
	public String textAffiche() {
		String text_obtenu= text_compte_cree.getText() ;
		return text_obtenu;
	}
	

}
