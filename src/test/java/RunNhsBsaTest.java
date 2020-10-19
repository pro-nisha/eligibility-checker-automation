import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import com.automation.steps.TestSteps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@CucumberOptions(
        features = "src/test/resources/features",
        glue ={"com.automation.steps","com.automation.hooks"},
        plugin = {"pretty", "json:target/jsonreports/cucumber.json"
                , "junit:target/junit_reports/cucumberjunit.xml"},
        strict = true,
        tags = {"not @ignore", "not @wip"}
)
public class RunNhsBsaTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
    private static Logger log = Logger.getLogger(TestSteps.class);

    @AfterSuite
    public static void generateReport() {
        File reportOutputDirectory = new File("target");

        List<String> jsonFiles = new ArrayList<>();
        File e = new File("target/jsonReports/cucumber.json");
        Configuration configuration = new Configuration(reportOutputDirectory, "selenium");

        configuration.addClassifications("Platform", "Windows");
        configuration.addClassifications("Browser", "chrome");
        jsonFiles.add(e.getAbsolutePath());
        log.info("......Generating the Report in process....");

        new ReportBuilder(jsonFiles, configuration).generateReports();
    }
}