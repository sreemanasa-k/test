Feature: Check Register functionality!
  User should register into account and be able to access.

  Background:
    Given User should navigate to Application URL.

  @register
  Scenario: Register with supplying data to all fields.
  Then User enters the firstname in First Name filed
  And User enters the lastname in Last Name field
  And User enters the address in Address field
  And User enters the city in City field
  And User enters the state in State field
  And User enters the Zip Code in Zip Code field
  And User enters the Phone number  in Phone field
  And User enters the SSN in SSN field
  And User enters the Username in Username field
  And User enters the Password in Password field
  And User enters the Confirm Password in Confirm field
  And User clicks on register button
  Then User should get a welcome message.

 @datafields
 Scenario: Register with supplying data to all fields by using data table.
   Then User enters the Data into fields
   |First_Name|Balu      |
   |Last_Name |Kandhula  |
   |Address   |HB Colony |
   |City      |Hyderabad |
   |State     |Telangana |
   |Zip Code  |50080     |
   |Phone     |7766554433|
   |SSN       |675656466 |
   |UserName  |balu    |
   |Password  |123456789 |
   |ConfirmPas|123456789 |
   And User clicks on register button
   Then User should get a welcome message.

