package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PagePaiement;
import PageObject.PageProduit;
import io.cucumber.java.en.*;

public class Paiement_StepDef {
	
	 WebDriver driver=SetUp.driver;
	 PagePaiement pay= new PagePaiement(driver);

	@Given("cliquer sur Checkout")
	public void cliquer_sur_checkout() {
	    pay.cliquer_Checkout();
	}

	@When("cliquer sur place_order")
	public void cliquer_sur_place_order() {
	   pay.cliquer_PlaceOrder();
	}

	@When("saisir nom {string}")
	public void saisir_nom(String string) {
	    pay.saisir_CardName(string);
	}

	@When("saisir numero de carte {string}")
	public void saisir_numero_de_carte(String string) {
	    pay.saisir_CardNumber(string);
	}

	@When("saisir  cvc {string}")
	public void saisir_cvc(String string) {
	   pay.saisir_CVC(string);
	}

	@When("saisir  mois {string}")
	public void saisir_mois(String string) {
	   pay.saisir_ExMonth(string);
	}

	@When("saisir annee {string}")
	public void saisir_annee(String string) {
	    pay.saisir_ExYear(string);
	}

	@When("cliquer sur pay")
	public void cliquer_sur_pay() {
	    pay.cliquer_PayConf();
	}

	@Then("confirmer le paiement avec le message {string}")
	public void confirmer_le_paiement_avec_le_message(String string) {
		 Assert.assertEquals(string, pay.textConf());
		 System.out.println("le paiement estconfirmé avec succé");
	}
	
	
	
}
