package com.sebprunier.devoxxfr.capitalize;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.sebprunier.devoxxfr.Answer;
import com.sebprunier.devoxxfr.LocalWebServer;

public class CapitalizeStep {

    private LocalWebServer localWebServer;
    private Answer answer;

    @Given("a codestory webserver")
    public void theWebServerIsRunning() throws Exception {
        this.localWebServer = new LocalWebServer();
        this.localWebServer.start();
    }

    @When("the string to capitalize is $stringToCapitalize")
    public void iMakeACapitalizeRequest(String stringToCapitalize) throws Exception {
        answer = this.localWebServer.get("/capitalize?data=" + stringToCapitalize);
    }

	@Then("the answer must be $expectedAnswer")
	public void theAnswerMustBeLike(String expectedAnswer) throws Exception {
		Assert.assertEquals(200, answer.getStatus());
		String capitalizedString = answer.getBody();
		Assert.assertEquals(expectedAnswer, capitalizedString);
	}

    @AfterScenario
    public void theServerIsStopped() throws Exception {
        this.localWebServer.stop();
    }

}
