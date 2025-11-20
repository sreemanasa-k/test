package StepDefinitions;
import Factory.Initialize_Browser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Map;

public class Register
{
    WebDriver driver = Initialize_Browser.get_Driver();

    @Given("User should navigate to Application URL.")
    public void user_should_navigate_to_application_url()
    {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }
    @Then("User enters the firstname in First Name filed")
    public void user_enters_the_firstname_in_first_name_filed()
    {
        driver.findElement(By.id("customer.firstName")).sendKeys("Sree");
    }
    @And("User enters the lastname in Last Name field")
    public void user_enters_the_lastname_in_last_name_field()
    {
        driver.findElement(By.id("customer.lastName")).sendKeys("Manasa");
    }
    @And("User enters the address in Address field")
    public void user_enters_the_address_in_address_field()
    {
        driver.findElement(By.id("customer.address.street")).sendKeys("RR Residency");
    }
    @And("User enters the city in City field")
    public void user_enters_the_city_in_city_field()
    {
       driver.findElement(By.id("customer.address.city")).sendKeys("Bangalore");
    }
    @And("User enters the state in State field")
    public void user_enters_the_state_in_state_field()
    {
        driver.findElement(By.id("customer.address.state")).sendKeys("Karnataka");
    }
    @And("User enters the Zip Code in Zip Code field")
    public void user_enters_the_zip_code_in_zip_code_field()
    {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
    }
    @And("User enters the Phone number  in Phone field")
    public void user_enters_the_phone_number_in_phone_field()
    {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
    }
    @And("User enters the SSN in SSN field")
    public void user_enters_the_ssn_in_ssn_field() {
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
    }

    @And("User enters the Username in Username field")
    public void user_enters_the_username_in_username_field()
    {
        driver.findElement(By.id("customer.username")).sendKeys("Sree");
    }
    @And("User enters the Password in Password field")
    public void user_enters_the_password_in_password_field()
    {
        driver.findElement(By.id("customer.password")).sendKeys("12345");
    }

    @And("User enters the Confirm Password in Confirm field")
    public void user_enters_the_confirm_password_in_confirm_field()
    {
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
    }
    @Then("User enters the Data into fields")
    public void user_enters_the_data_into_fields(DataTable data)
    {
        Map<String, String> data_table = data.asMap(String.class, String.class);
        driver.findElement(By.id("customer.firstName")).sendKeys(data_table.get("First_Name"));
        driver.findElement(By.id("customer.lastName")).sendKeys(data_table.get("Last_Name"));
        driver.findElement(By.id("customer.address.street")).sendKeys(data_table.get("Address"));
        driver.findElement(By.id("customer.address.city")).sendKeys(data_table.get("City"));
        driver.findElement(By.id("customer.address.state")).sendKeys(data_table.get("State"));
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(data_table.get("Zip Code"));
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(data_table.get("Phone"));
        driver.findElement(By.id("customer.ssn")).sendKeys(data_table.get("SSN"));
        driver.findElement(By.id("customer.username")).sendKeys(data_table.get("UserName"));
        driver.findElement(By.id("customer.password")).sendKeys(data_table.get("Password"));
        driver.findElement(By.id("repeatedPassword")).sendKeys(data_table.get("ConfirmPas"));
    }
    @And("User clicks on register button")
    public void user_clicks_on_register_button()
    {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    @Then("User should get a welcome message.")
    public void userShouldGetAWelcomeMessage()
    {
        String actualtext="Your account was created successfully. You are now logged in.";
        String expectedtext="Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualtext,expectedtext);
    }
}
