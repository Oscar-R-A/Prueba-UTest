package co.com.choucair.test.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/uTest.feature",
                tags = "@CrearUsuario",
                glue = "co.com.choucair.test.prueba.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
