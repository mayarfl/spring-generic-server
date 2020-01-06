package spring.generic.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import spring.generic.server.Security.Parameters.Common;
import spring.generic.server.Utills.Params;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringGenericServerApplication {
	public static String PASSWORD = "mypassword";

	public class User {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User1 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User2 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User3 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User4 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User5 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User6 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}


	public class User7 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User8 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}


	public class User9 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User10 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User11 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public class User12 {
		public static final String NAME = "ROLE_SIMPLE";
		public static final String PASSWORD = "ROLE_ADMIN";
	}

	public static void main(String[] args) {
		String[] args1 = new String[args.length + 4];
		args1[args.length] = PASSWORD;
		args1[args.length + 1] = Params.newUser.PASSWORD;
        args1[args.length + 2] = PASSWORD;
        args1[args.length + 3] = Common.PASSWORD;
		SpringApplication.run(SpringGenericServerApplication.class, args1);
	}
}
