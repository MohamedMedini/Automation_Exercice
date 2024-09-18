package StepDefinition;


import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageHome;
import io.cucumber.java.en.*;
import junit.framework.Assert;


public class CreationCompteStepDef {
	
	WebDriver driver=SetUp.driver;
	PageHome home= new PageHome(driver);
	
	
	
	@Given("accerder a url {string} de la page automation")
	public void accerder_a_url_de_la_page_automation(String string) {
		home.GetUrl(string);   
	}

	@When("cliquer sur signup\\/login")
	public void cliquer_sur_signup_login() {
		home.cliquer_bt_signlogin();
	   
	}

	@When("saisir le nom {string} et l mail {string}")
	public void saisir_le_nom_et_l_mail(String string, String string2) {
		home.saisir_nom(string);
		home.saisir_email(string2);
	   
	}

	@When("cliquer sur signup")
	public void cliquer_sur_signup() {
		home.cliquer_signup();
	    
	}

	@When("je selectionne le title mr ou mme : {string}")
	public void je_selectionne_le_title_mr_ou_mme(String string) {
		home.je_selectionne_le_genre_mr_ou_mme(string);
	  
	}

	@When("saisir le mot de passe {string}")
	public void saisir_le_mot_de_passe(String string) {
		home.saisir_mot_de_passe(string);
	    
	}

	@When("selectionne la date {string} ,le mois {string} et l annee {string} de naissance")
	public void selectionne_la_date_le_mois_et_l_annee_de_naissance(String string, String string2, String string3) {
	    home.selectionne_la_date_de_naissance(string, string2, string3);
	}

	@When("cocher les options")
	public void cocher_les_options() {
		home.cocher_case();
	   
	}

	@When("saisir first name {string} et last name {string}")
	public void saisir_first_name_et_last_name(String string, String string2) {
		home.saisir_first_name(string2);
		home.saisir_last_name(string2);
	}

	@When("saisir le company {string}")
	public void saisir_le_company(String string) {
		home.saisir_company(string);
	   
	}

	@When("saisir adreese {string} et  selectionner country {string} et  saisir le state {string} le  city {string} et zipcode {string}")
	public void saisir_adreese_et_selectionner_country_et_saisir_le_state_le_city_et_zipcode(String string, String string2, String string3, String string4, String string5) {
	   home.saisir_address(string);
	   home.saisir_country(string2);
	   home.saisir_state(string3);
	   home.saisir_city(string4);
	   home.saisir_zip(string5);
	     
	}

	@When("saisir le  phone number {string}")
	public void saisir_le_phone_number(String string) {
		home.saisir_phone_number(string);
	    
	}

	@When("cliquer sur create account")
	public void cliquer_sur_create_account() {
	    home.cliquer_sur_create_account();
	}

	@SuppressWarnings("deprecation")
	@Then("verifier que le message {string} est affiche")
	public void verifier_le_message_est_affiche(String string) {
		Assert.assertEquals(string, home.textAffiche());
	}

}
