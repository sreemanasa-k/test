package Hooks;

import Factory.Initialize_Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class hooks
{
    WebDriver driver = Initialize_Browser.get_Driver();
    @Before
    public void setUp()
    {
        Initialize_Browser.browser("firefox");

    }

    @After
    public void tearDown(Scenario scenario)
    {
        String Scenario_Name = scenario.getName().replace(" ", "_");
        if(scenario.isFailed())
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] failure_sc= ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(failure_sc,"image/png",Scenario_Name);
        }
        
        
       Initialize_Browser.get_Driver().quit();
    }
}
