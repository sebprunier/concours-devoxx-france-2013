package com.sebprunier.devoxxfr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class WebServerTest {

    private WebServer webServer;
    private int port;

    @Before
    public void setUp() throws Exception {
        this.port = new Random().nextInt(65535);
        this.webServer = new WebServer(port);
        this.webServer.start();
    }

    @After
    public void tearDown() throws Exception {
        this.webServer.stop();
    }

    @Test
    public void bad_question_should_return_error() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=xxx");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("Bad question ...", reader.readLine());
        reader.close();
    }

    @Test
    public void question1_should_return_email_address() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=Quelle+est+ton+adresse+email");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("sebastien.prunier@gmail.com", reader.readLine());
        reader.close();
    }

    @Test
    public void question2_should_return_oui() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=Es+tu+abonne+a+la+mailing+list(OUI/NON)");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("OUI", reader.readLine());
        reader.close();
    }

    @Test
    public void question3_should_return_oui() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=Es+tu+heureux+de+participer(OUI/NON)");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("OUI", reader.readLine());
        reader.close();
    }

    @Test
    public void question4_should_return_oui() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=Es+tu+pret+a+recevoir+une+enonce+au+format+markdown+par+http+post(OUI/NON)");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("OUI", reader.readLine());
        reader.close();
    }

    @Test
    public void question5_should_return_non() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=Est+ce+que+tu+reponds+toujours+oui(OUI/NON)");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("NON", reader.readLine());
        reader.close();
    }

    @Test
    public void one_plus_one_should_return_2() throws Exception {
        URL url = new URL("http://localhost:" + port + "/?q=1+1");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        Assert.assertEquals(200, httpConn.getResponseCode());
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        Assert.assertEquals("2", reader.readLine());
        reader.close();
    }

    // TODO
    //
    // ((1,1+2)+3,14+4+(5+6+7)+(8+9+10)*4267387833344334647677634)/2*553344300034334349999000
}
