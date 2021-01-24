package br.com.mystore.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 plugin = { "pretty" }, 
                 glue = { "br.com.mystore.steps"},
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false,
                 strict = true)
public class TestRunner {

}
