package com.sebprunier.devoxxfr.question;

import groovy.lang.GroovyShell;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sebprunier.devoxxfr.Resource;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
        ANSWERS.put("As tu passe une bonne nuit malgre les bugs de l etape precedente(PAS_TOP/BOF/QUELS_BUGS)", "QUELS_BUGS");
        ANSWERS.put("As tu bien recu le second enonce(OUI/NON)", "OUI");
        
        // FIXME Should not hard-code this answer ...
        ANSWERS.put("((1,1 2) 3,14 4 (5 6 7) (8 9 10)*4267387833344334647677634)/2*553344300034334349999000", "31878018903828899277492024491376690701584023926880");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String question = request.getParameter(QUESTION_PARAMETER);
        String answer = ANSWERS.get(question);
        if (answer == null) {
            // Try groovy interpreter ...
            // FIXME security issue here !!!
            try {
                String expr = question.replaceAll(" ", "+");
                expr = expr.replaceAll(",", "\\.");
                Object res = new GroovyShell().evaluate(expr);
                answer = String.valueOf(res);
                answer = new DecimalFormat("0.#####").format(Double.valueOf(answer));
                answer = answer.replaceAll("\\.", ",");
            } catch (Exception e) {
                e.printStackTrace(System.err);
                answer = "Bad question ...";
                System.out.println("Unknown question : " + question);
            }
        }
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println(answer);
        writer.close();
    }
}
