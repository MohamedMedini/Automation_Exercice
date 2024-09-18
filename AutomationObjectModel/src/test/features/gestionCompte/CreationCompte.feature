@Automation_Exercice_Compte
Feature: Compte Automation Exercice
  En tant que utilisateur, je veux creer un compte Automation Exercice

  @Creation_compte 
  Scenario: creation de compte Automation Exercice
    Given accerder a url "https://automationexercise.com/" de la page automation
    When cliquer sur signup/login 
    And  saisir le nom "mohamed" et l mail "mohamed@medini.com"
    And cliquer sur signup
    And je selectionne le title mr ou mme : "mr"
    And saisir le mot de passe "Testauto"
    And selectionne la date "19" ,le mois "10" et l annee "1989" de naissance
    And cocher les options 
    And saisir first name "mohamed" et last name "medini"
    And saisir le company "proservice"
    And saisir adreese "120 avenue de paris" et  selectionner country "Canada" et  saisir le state "Quebec" le  city "Montreal" et zipcode "1002"
    And saisir le  phone number "2020202020"
    And cliquer sur create account 
    Then verifier que le message "ACCOUNT CREATED!" est affiche
    

  