package com.sebprunier.devoxxfr.jajascript;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.google.gson.Gson;
import com.sebprunier.devoxxfr.Answer;
import com.sebprunier.devoxxfr.LocalWebServer;

public class OptimizeStep {

    private LocalWebServer localWebServer;
    private Answer answer;

    @Given("a codestory webserver")
    public void theWebServerIsRunning() throws Exception {
        this.localWebServer = new LocalWebServer();
        this.localWebServer.start();
    }

    @When("the flight demands are $flightDemands")
    public void iMakeAnOptimizeRequest(String flightDemands) throws Exception {
        answer = this.localWebServer.post("/jajascript/optimize", flightDemands);
    }

    @Then("the optimized planning is $expectedPlanningJson")
    public void thePlanningShouldLookLike(String expectedPlanningJson) throws Exception {
        FlightPlanning expectedPlanning = new Gson().fromJson(expectedPlanningJson, FlightPlanning.class);
        Assert.assertEquals(201, answer.getStatus());
        String planningJson = answer.getBody();
        FlightPlanning planning = new Gson().fromJson(planningJson, FlightPlanning.class);
        Assert.assertEquals(expectedPlanning.getGain(), planning.getGain());
        Assert.assertArrayEquals(expectedPlanning.getPath().toArray(), planning.getPath().toArray());
    }

    @AfterScenario
    public void theServerIsStopped() throws Exception {
        this.localWebServer.stop();
    }

}
