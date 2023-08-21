@get-a-quote @run-this @web
Feature: WEB - GET CAR INSURANCE QUOTE
  Background: The user has visited the correct page
    Given the user is on the car and home insurance page


  Scenario Outline: Validate that a user may get car insurance quote
    Given a person with name "<name>", surname "<surname>", cellphone "<cellphone>" and email "<email>"
    Given has passport number "<passport number>", date of birth "<dob>" and gender "<gender>"
    Given has "<years with previous insurer>" years with previous insurer
    Given has "<registration number>" for registration number
    Given they live in "<suburb>" with a "<security>" security package

    Examples:
      | name | surname | cellphone | email | passport number | dob | gender | years with previous insurer | registration number | suburb | security | frequent driver |
      |      |         |           |       |                 |     |        |                             |                     |        |          |                 |
      |      |         |           |       |                 |     |        |                             |                     |        |          |                 |