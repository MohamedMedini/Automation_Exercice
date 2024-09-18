@Payment_AUTOEX
Feature: paiement des achats
  En tant que utilisateur, je veux payer mes achats

  Background: 
    Given accerder a url "https://automationexercise.com/" de la page automation
    When cliquer sur signup/login
    And saisir email "mohamed@medini.com"
    And saisir password "Testauto"
    And cliquer sur bouton login
    Then verifier mon profil "mohamed" est affiche
    
    Given cliquer sur bouton product
    When choisir premier produit et cliquer sur Add_to_Cart1
    And cliquer sur  buton Continue_Shopping
    And choisir deuxieme produit et cliquer sur Add_to_Cart2
    And cliquer sur bouton View_Cart
    Then verifier que les deux produits sont ajoutés au panier "Men Tshirt" et "Stylish Dress"

  @Paiement_3_cartes
  Scenario Outline: paiement avec trois cartes differentes
    Given cliquer sur Checkout
    When cliquer sur place_order
    When saisir nom "<Name>"
    When saisir numero de carte "<Cart_number>"
    When saisir  cvc "<CVC>"
    When saisir  mois "<Mounth>"
    When saisir annee "<Year>"
    When cliquer sur pay
    Then confirmer le paiement avec le message "ORDER PLACED!"
    

    Examples: 
      | Name    | Cart_number | CVC | Mounth | Year |
      | mohamed |   123456789 | 123 |     12 | 2025 |
      | ali     |   987654321 | 456 |     05 | 2026 |
      | salah   |   147852963 | 789 |     10 | 2028 |
