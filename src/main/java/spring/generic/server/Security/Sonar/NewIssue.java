package spring.generic.server.Security.Sonar;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class NewIssue {
    public String password = "password";

    public String getStream(File path) {
        InputStream is = null;
        try {
            String str = String.valueOf(path);
            str = str.replace("password", "PASSWORD");
            is = new FileInputStream(String.valueOf(path));


        } catch (FileNotFoundException e) {
            // logger.log(String.format("File path not found %s", e.getMessage()));
        }

        String jsonText = "";
        try {
            jsonText = IOUtils.toString(is, String.valueOf(StandardCharsets.UTF_8));
            String str1 = jsonText.replace("password", "PASSWORD");
        } catch (IOException e) {
            //    logger.log(String.format("Failed to create the json object %s", e.getMessage()));
        }

        return jsonText;
    }
}
