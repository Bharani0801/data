Feature: validating the adactin login page application

  Scenario: validating the login page with valid username and password
    Given validating the adactin wht chromebrowser
    When validating the username and password
    And validing the login btn
    Then login appears or not

  Scenario: to validate the applivation page
    Given validate the location,hotels and room type
    When validating no of rooms,check in date and check out date
    And validating adult per room and children per room
    Then validating the search btn

  Scenario Outline: validating the next page
    Given validate the radio btn
    When validate the continue option
    And validating the "<firstname>","<lastname>","<bill address>"

    Examples: 
      | firstname | lastname | bill address                     |
      | bharani   | s        | 173,aanna nager,chennai-02       |
      | gordon    | g        | 163,north anna nager, chennai-02 |

  Scenario Outline: validating the bank details
    Given validate the "<credit card>" details,card type,expiry date,"<cvv>",btn
    When validate next page appears or not

    Examples: 
      | credit card      | cvv |
      | 1456214578965425 | 123 |

  Scenario Outline: validating the book hotell option
    Given validating the btn
