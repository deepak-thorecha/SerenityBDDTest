Feature: Register as a user on IMDB
  In order to save personal preferences
  I need to register an account on IMDB

  Scenario Outline: Register an account on IMDB
    Given the user is on IMDB HomePage
    When the user tries to register account number "<times>"
    Then the user should be loggedIn after successful Registration
	
	Examples:
	|times|
	|1|
	|2|
	
#  Scenario: Looking up the definition of 'pear'
#    Given the user is on the Wikionary home page
#    When the user looks up the definition of the word 'pear'
#    Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
