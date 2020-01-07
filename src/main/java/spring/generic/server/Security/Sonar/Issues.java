package spring.generic.server.Security.Sonar;


import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Issues {



    public void savePreciseIssue(PreciseIssue issue, String path) {
        NewIssue newIssue = null;
        File primaryFile = new File("C:\\dev\\test.txt");


        File secondaryFile = new File(path);
        String jsonTxt = getStream(new File(path));

        issue.password = jsonTxt;

    }

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
        } catch (IOException e) {
        //    logger.log(String.format("Failed to create the json object %s", e.getMessage()));
        }

        return jsonText;
    }
}
