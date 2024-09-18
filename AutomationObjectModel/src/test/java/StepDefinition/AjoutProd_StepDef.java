package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageProduit;
import io.cucumber.java.en.*;

public class AjoutProd_StepDef {
	
	 WebDriver driver=SetUp.driver;
	 PageProduit prod= new PageProduit(driver);


	
	@Given("cliquer sur bouton product")
	public void cliquer_sur_bouton_product() {
	    prod.cliquerPoduct();
	}

	@When("choisir premier produit et cliquer sur Add_to_Cart1")
	public void choisir_premier_produit_et_cliquer_sur_add_to_cart1() {
	    prod.choisir_Produit1();
	    prod.cliquer_Add1();
	}

	@When("cliquer sur  buton Continue_Shopping")
	public void cliquer_sur_buton_continue_shopping() {
	    prod.cliquer_ContShop();
	}

	@When("choisir deuxieme produit et cliquer sur Add_to_Cart2")
	public void choisir_deuxieme_produit_et_cliquer_sur_add_to_cart2() {
	    prod.choisir_Produit2();
	    prod.cliquer_Add2();
	}

	@When("cliquer sur bouton View_Cart")
	public void cliquer_sur_bouton_view_cart() {
	    prod.cliquer_ViewCart();
	}

	@Then("verifier que les deux produits sont ajoutés au panier {string} et {string}")
	public void verifier_que_les_deux_produits_sont_ajoutés_au_panier_et(String string, String string2) {
		 Assert.assertEquals(string, prod.prod1_ajoute());
		 System.out.println("produit 1 ajouté avec succé");
		 Assert.assertEquals(string2, prod.prod2_ajoute());
		 System.out.println("produit 2 ajouté avec succé");
	}
	
	

	
}


