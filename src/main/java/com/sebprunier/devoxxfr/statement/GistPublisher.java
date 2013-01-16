package com.sebprunier.devoxxfr.statement;

import java.io.IOException;
import java.util.Map;

import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.GistFile;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.GistService;

public class GistPublisher {

    private static final String GIST_STATEMENTS_ID = "4506260";

    public boolean publish(String statementId, String statementData) {
        final String githubUser = System.getenv("github.user");
        final String githubPassword = System.getenv("github.password");

        try {
            // Create client and gist service
            GitHubClient client = new GitHubClient();
            client.setCredentials(githubUser, githubPassword);
            GistService service = new GistService(client);

            // Retrieve gist
            Gist gist = service.getGist(GIST_STATEMENTS_ID);
            String fileName = "enonce-" + statementId + ".md";
            Map<String, GistFile> gistFiles = gist.getFiles();
            GistFile file = gistFiles.get(fileName);
            if (file != null) {
                file.setContent(statementData);
            } else {
                file = new GistFile();
                file.setContent(statementData);
                file.setFilename(fileName);
                gistFiles.put(fileName, file);
                gist.setFiles(gistFiles);
            }
            // Update gist !
            service.updateGist(gist);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
