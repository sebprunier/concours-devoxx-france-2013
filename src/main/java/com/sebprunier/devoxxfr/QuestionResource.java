package com.sebprunier.devoxxfr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class QuestionResource implements Resource {

    public static final String QUESTION_PARAMETER = "q";

    private static final Map<String, String> ANSWERS = new HashMap<String, String>();

    static {
        ANSWERS.put("Quelle est ton adresse email", "sebastien.prunier@gmail.com");
        ANSWERS.put("Es tu abonne a la mailing list(OUI/NON)", "OUI");
        ANSWERS.put("Es tu heureux de participer(OUI/NON)", "OUI");
        ANSWERS.put("Es tu pret a recevoir une enonce au format markdown par http post(OUI/NON)", "OUI");
        ANSWERS.put("Est ce que tu reponds toujours oui(OUI/NON)", "NON");
        ANSWERS.put("As tu bien recu le premier enonce(OUI/NON)", "OUI");
        ANSWERS.put("1 1", "2");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String question = request.getParameter(QUESTION_PARAMETER);
        String answer = ANSWERS.get(question);
        if (answer == null) {
            answer = "Bad question ...";
            System.out.println("Unknown question : " + question);
        }
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println(answer);
        writer.close();
    }
}
