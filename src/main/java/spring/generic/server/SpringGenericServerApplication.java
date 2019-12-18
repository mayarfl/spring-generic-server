package spring.generic.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringGenericServerApplication {
	public static String PASSWORD = "mypassword";

	public static void main(String[] args) {
		String[] args1 = new String[args.length + 1];
		args1[args.length] = PASSWORD;
		SpringApplication.run(SpringGenericServerApplication.class, args1);
	}
}
