#Author: and-rua@hotmail.com
@tag
Feature: Alibaba search
  I want to make a search in alibaba

  @tag1
  Scenario Outline: Searching a dress with at less three diamonds
    Given I into Alibaba
    When I search for an article <product>
    And find some with at less diamonds
    When contact with supplier <email> <detail>
    Then I validate the outcomes

    Examples: 
      | product   | email               | detail             |
      | cellphone | and-rua@hotmail.com | Have_you_descount? |
