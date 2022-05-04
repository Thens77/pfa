package ma.emsi.aprj.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import ma.emsi.aprj.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
