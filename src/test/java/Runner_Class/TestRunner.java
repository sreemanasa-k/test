package Runner_Class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@register",
        features = {"src/test/java/Feature_Files"},
        glue={"StepDefinitions","Hooks"},
        publish = true,
        plugin={"pretty",
                "html:reports/Cucumber_HTML/Cucumber.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
