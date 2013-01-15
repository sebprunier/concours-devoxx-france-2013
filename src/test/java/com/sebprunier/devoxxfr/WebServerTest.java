package com.sebprunier.devoxxfr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WebServerTest {

    private LocalWebServer localWebServer;

    @Before
    public void setUp() throws Exception {
        this.localWebServer = new LocalWebServer();
        this.localWebServer.start();
    }

    @After
    public void tearDown() throws Exception {
        this.localWebServer.stop();
    }

    @Test
    public void bad_question_should_return_error() throws Exception {
        Answer answer = this.localWebServer.get("/?q=xxx");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("Bad question ...", answer.getBody());
    }

    @Test
    public void question1_should_return_email_address() throws Exception {
        Answer answer = this.localWebServer.get("/?q=Quelle+est+ton+adresse+email");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("sebastien.prunier@gmail.com", answer.getBody());
    }

    @Test
    public void question2_should_return_oui() throws Exception {
        Answer answer = this.localWebServer.get("/?q=Es+tu+abonne+a+la+mailing+list(OUI/NON)");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("OUI", answer.getBody());
    }

    @Test
    public void question3_should_return_oui() throws Exception {
        Answer answer = this.localWebServer.get("/?q=Es+tu+heureux+de+participer(OUI/NON)");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("OUI", answer.getBody());
    }

    @Test
    public void question4_should_return_oui() throws Exception {
        Answer answer = this.localWebServer
                .get("/?q=Es+tu+pret+a+recevoir+une+enonce+au+format+markdown+par+http+post(OUI/NON)");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("OUI", answer.getBody());
    }

    @Test
    public void question5_should_return_non() throws Exception {
        Answer answer = this.localWebServer.get("/?q=Est+ce+que+tu+reponds+toujours+oui(OUI/NON)");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("NON", answer.getBody());
    }

    @Test
    public void one_plus_one_should_return_2() throws Exception {
        Answer answer = this.localWebServer.get("/?q=1+1");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("2", answer.getBody());
    }

    @Test
    public void complicated_expression_should_return_not_approximative_result() throws Exception {
        Answer answer = this.localWebServer
                .get("/?q=((1,1+2)+3,14+4+(5+6+7)+(8+9+10)*4267387833344334647677634)/2*553344300034334349999000");
        Assert.assertEquals(200, answer.getStatus());
        Assert.assertEquals("31878018903828899277492024491376690701584023926880", answer.getBody());
    }

}
