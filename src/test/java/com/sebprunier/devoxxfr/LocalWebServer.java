package com.sebprunier.devoxxfr;

import java.io.ByteArrayInputStream;
import java.util.Random;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.PostMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;

public class LocalWebServer {

    private static final String DEFAULT_CONTENT_TYPE = "application/json";

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
        WebConversation wc = new WebConversation();
        WebRequest req = new GetMethodWebRequest("http://localhost:" + port + path);
        WebResponse resp = wc.getResponse(req);
        return new Answer(resp.getResponseCode(), new String(resp.getBytes()).trim());
    }

    public Answer post(String path, String data) throws Exception {
        WebConversation wc = new WebConversation();
        WebRequest req = new PostMethodWebRequest("http://localhost:" + port + path, new ByteArrayInputStream(
                data.getBytes()), DEFAULT_CONTENT_TYPE);
        WebResponse resp = wc.getResponse(req);
        return new Answer(resp.getResponseCode(), new String(resp.getBytes()).trim());
    }
}
