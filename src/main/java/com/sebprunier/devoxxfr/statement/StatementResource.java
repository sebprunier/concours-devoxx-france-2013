package com.sebprunier.devoxxfr.statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.GistFile;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.GistService;

import com.sebprunier.devoxxfr.Resource;

public class StatementResource implements Resource {

    private static final String JOBS_GIST_ID = "4506260";

    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String enonce = IOUtils.toString(request.getReader());
        System.out.println(enonce);
        String enonceId = request.getRequestURI().split("/")[2];
        sendToGithub(enonceId, enonce);
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_CREATED);
        PrintWriter writer = response.getWriter();
        writer.println("Thanks !");
        writer.close();
    }

    private void sendToGithub(String enonceId, String enonce) {
        final String githubUser = System.getenv("github.user");
        final String githubPassword = System.getenv("github.password");

        try {
            // Create client and gist service
            GitHubClient client = new GitHubClient();
            client.setCredentials(githubUser, githubPassword);
            GistService service = new GistService(client);

            // Retrieve gist
            Gist gist = service.getGist(JOBS_GIST_ID);
            String fileName = "enonce-" + enonceId + ".md";
            Map<String, GistFile> gistFiles = gist.getFiles();
            GistFile file = gistFiles.get(fileName);
            if (file != null) {
                file.setContent(enonce);
            } else {
                file = new GistFile();
                file.setContent(enonce);
                file.setFilename(fileName);
                gistFiles.put(fileName, file);
                gist.setFiles(gistFiles);
            }
            // Update gist !
            service.updateGist(gist);

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


}
