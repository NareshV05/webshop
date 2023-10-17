

package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "C:\\Users\\naresh.vijaya\\eclipse-workspace\\WebShop\\src\\test\\resources\\feature\\webshop.feature",
                  glue = "org.register",
                  tags = "@addtocart",
                  monochrome = true,
                  plugin = {"pretty","html:target/cucumber-reports/report.html"}
                  )
public class TestRunner {

}

