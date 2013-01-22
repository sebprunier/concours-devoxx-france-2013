package com.sebprunier.devoxxfr.question;

import groovy.lang.GroovyShell;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
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
        ANSWERS.put("As tu copie le code de ndeloof(OUI/NON/JE_SUIS_NICOLAS)", "NON");
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
                answer = new DecimalFormat("0.#####").format(res);
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
