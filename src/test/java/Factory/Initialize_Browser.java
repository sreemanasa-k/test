package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize_Browser
{
    static WebDriver driver=null;

    public static void browser(String Browser_Name)
    {
        if(Browser_Name.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(Browser_Name.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else
        {
            driver = new EdgeDriver();
        }
    }

    public  static WebDriver get_Driver()
    {
        return driver;
    }

}
