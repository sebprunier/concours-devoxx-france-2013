package com.sebprunier.devoxxfr.question;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.sebprunier.devoxxfr.Answer;
import com.sebprunier.devoxxfr.LocalWebServer;

public class QuestionStep {

    private LocalWebServer localWebServer;
    private Answer answer;

    @Given("a codestory webserver")
    public void theWebServerIsRunning() throws Exception {
        this.localWebServer = new LocalWebServer();
        this.localWebServer.start();
    }

    @When("the question is $question")
    public void iPostAQuestion(String question) throws Exception {
        answer = this.localWebServer.get("/?q=" + question);
    }

    @Then("the answer must be $expectedAnswer")
    public void theAnswerShouldLookLike(String expectedAnswer) throws Exception {
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals(expectedAnswer, answer.getBody());
    }

    @AfterScenario
    public void theServerIsStopped() throws Exception {
        this.localWebServer.stop();
    }

}
