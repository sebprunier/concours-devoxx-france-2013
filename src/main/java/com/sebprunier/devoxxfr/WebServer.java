package com.sebprunier.devoxxfr;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class WebServer {

    private Server server;

    public WebServer(int port) {
        this.server = new Server(port);
        server.setHandler(new WebServerHandler());
    }

    public void start() throws Exception {
        this.server.start();
    }

    public void startAndWait() throws Exception {
        start();
        this.server.join();
    }

    public void stop() throws Exception {
        this.server.stop();
    }

    private static class WebServerHandler extends AbstractHandler {

        private static final String QUERY_PARAMETER = "q";
        private static final Map<String, String> ANSWERS = new HashMap<String, String>();

        static {
            ANSWERS.put("Quelle est ton adresse email", "sebastien.prunier@gmail.com");
            ANSWERS.put("Es tu abonne a la mailing list(OUI/NON)", "OUI");
            ANSWERS.put("Es tu heureux de participer(OUI/NON)", "OUI");
            ANSWERS.put("Es tu pret a recevoir une enonce au format markdown par http post(OUI/NON)", "OUI");
            ANSWERS.put("Est ce que tu reponds toujours oui(OUI/NON)", "NON");
            ANSWERS.put("As tu bien recu le premier enonce(OUI/NON)", "NON");
        }

        @Override
        public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch) throws IOException, ServletException {
            String question = request.getParameter(QUERY_PARAMETER);
            String answer = ANSWERS.get(question);
            if (answer == null) {
                answer = "Bad question ...";
                System.out.println("Unknown request : " + request.toString());
            }
            response.setContentType("text/plain;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            PrintWriter writer = response.getWriter();
            writer.println(answer);
            writer.close();
        }
    }

    public static void main(String[] args) throws Exception {
//        int port = 8888;
        int port = Integer.parseInt(System.getenv("PORT"));
        WebServer webServer = new WebServer(port);
        webServer.startAndWait();
    }
}