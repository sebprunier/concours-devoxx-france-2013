package com.sebprunier.devoxxfr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class LocalWebServer {

    private WebServer webServer;
    private int port;

    public LocalWebServer() {
        super();
        this.port = new Random().nextInt(65535);
        this.webServer = new WebServer(this.port);
    }

    public void start() throws Exception {
        this.webServer.start();
    }

    public void stop() throws Exception {
        this.webServer.stop();
    }

    public Answer get(String path) throws Exception {
        URL url = new URL("http://localhost:" + port + path);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int status = httpConn.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        String body = reader.readLine();
        reader.close();
        return new Answer(status, body);
    }

}
