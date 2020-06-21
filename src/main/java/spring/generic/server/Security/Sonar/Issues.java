package spring.generic.server.Security.Sonar;


import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.LogManager;

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
            // new message
            // ddddd
            // mamamamamamama
        }

        String jsonText = is.toString();//  (String.valueOf(StandardCharsets.UTF_8));
        String str1 = jsonText.replace("password", "PASSWORD");

        return str1;
    }

    public String getStream1(File path) {
        InputStream is = null;
        try {
            String str = String.valueOf(path);
            str = str.replace("password", "PASSWORD");
            is = new FileInputStream(String.valueOf(path));


        } catch (FileNotFoundException e) {
            // logger.log(String.format("File path not found %s", e.getMessage()));
        }

        String jsonText = is.toString();//  (String.valueOf(StandardCharsets.UTF_8));

        return jsonText;
    }
}
