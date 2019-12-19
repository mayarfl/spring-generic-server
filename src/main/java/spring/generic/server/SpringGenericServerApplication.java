package spring.generic.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringGenericServerApplication {
	public static String PASSWORD = "mypassword";

	public class User {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public static void main(String[] args) {
		String[] args1 = new String[args.length + 2];
		args1[args.length] = PASSWORD;
		args1[args.length + 1] = User.PASSWORD;
		SpringApplication.run(SpringGenericServerApplication.class, args1);
	}
}
