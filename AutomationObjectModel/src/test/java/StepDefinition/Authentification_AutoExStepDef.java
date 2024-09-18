package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageHome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentification_AutoExStepDef {
	
	WebDriver driver=SetUp.driver;
	PageHome home= new PageHome (driver);
	
	
	
	@When("saisir email {string}")
	public void saisir_email(String string) {
	   home.ecrire_email(string);
	}

	@When("saisir password {string}")
	public void saisir_password(String string) {
	   home.ecrire_password(string);
	}

	@When("cliquer sur bouton login")
	public void cliquer_sur_bouton_login() {
	    home.cliquer_login();
	}
	@Then("verifier mon profil {string} est affiche")
	public void verifier_mon_profil_est_affiche(String string) {
	   Assert.assertEquals(string, home.Profil_affiche());
	}

}
