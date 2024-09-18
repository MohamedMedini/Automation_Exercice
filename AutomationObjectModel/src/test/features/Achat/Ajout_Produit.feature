@Ajout_Prod
Feature: Ajout de produit au panier
  En tant que utilisateur, je veux ajouter des produits à mon panier

  Background: 
    Given accerder a url "https://automationexercise.com/" de la page automation
    When cliquer sur signup/login
    And saisir email "mohamed@medini.com"
    And saisir password "Testauto"
    And cliquer sur bouton login
    Then verifier mon profil "mohamed" est affiche

  @Achat
  Scenario: ajouter deux  produits aux panier
    Given   cliquer sur bouton product
    When    choisir premier produit et cliquer sur Add_to_Cart1
    And     cliquer sur  buton Continue_Shopping
    And     choisir deuxieme produit et cliquer sur Add_to_Cart2
    And     cliquer sur bouton View_Cart
    Then    verifier que les deux produits sont ajoutés au panier "Men Tshirt" et "Stylish Dress"
