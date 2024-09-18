@Authentification_Autmation_Exercice
Feature: Connexion au compte Automation Exercice
 En tant queutilisateur, je veux connecter à mon compte Automation Exercice

  @Connection_Automation
  Scenario: conncter au compte Automation Exercice
    Given accerder a url "https://automationexercise.com/" de la page automation
    When cliquer sur signup/login 
    And  saisir email "mohamed@medini.com"
    And  saisir password "Testauto"
    And  cliquer sur bouton login 
    Then verifier mon profil "mohamed" est affiche
  
  