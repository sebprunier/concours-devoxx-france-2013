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

    @Then("the optimized planning is $expectedPlanning")
    public void thePlanningShouldLookLike(String expectedPlanning) throws Exception {
        OptimizedPlanning planning = new Gson().fromJson(expectedPlanning, OptimizedPlanning.class);
        System.out.println(planning.getGain());
        Assert.assertEquals(200, answer.getStatus());
        // String possibilities = answer.getBody();
        // Set<ChangeSolution> solutions = new Gson().fromJson(possibilities, new
        // TypeToken<Set<ChangeSolution>>(){}.getType());
        // Assert.assertEquals(expectedSolutions.size(), solutions.size());
        // for (ChangeSolution s : solutions) {
        // Assert.assertTrue(expectedSolutions.contains(s));
        // }
    }

    @AfterScenario
    public void theServerIsStopped() throws Exception {
        this.localWebServer.stop();
    }

    private class ChangeSolution {
        private Integer foo;
        private Integer bar;
        private Integer qix;
        private Integer baz;

        public Integer getFoo() {
            return foo;
        }

        public void setFoo(Integer foo) {
            this.foo = foo;
        }

        public Integer getBar() {
            return bar;
        }

        public void setBar(Integer bar) {
            this.bar = bar;
        }

        public Integer getQix() {
            return qix;
        }

        public void setQix(Integer qix) {
            this.qix = qix;
        }

        public Integer getBaz() {
            return baz;
        }

        public void setBaz(Integer baz) {
            this.baz = baz;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            ChangeSolution that = (ChangeSolution) o;

            if (bar != null ? !bar.equals(that.bar) : that.bar != null)
                return false;
            if (baz != null ? !baz.equals(that.baz) : that.baz != null)
                return false;
            if (foo != null ? !foo.equals(that.foo) : that.foo != null)
                return false;
            if (qix != null ? !qix.equals(that.qix) : that.qix != null)
                return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = foo != null ? foo.hashCode() : 0;
            result = 31 * result + (bar != null ? bar.hashCode() : 0);
            result = 31 * result + (qix != null ? qix.hashCode() : 0);
            result = 31 * result + (baz != null ? baz.hashCode() : 0);
            return result;
        }
    }
}
