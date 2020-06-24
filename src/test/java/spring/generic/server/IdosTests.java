package spring.generic.server;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import spring.generic.server.MongoDB.*;
import spring.generic.server.MongoDB.User.AdminUser;
import spring.generic.server.MongoDB.User.UserUtills;
import spring.generic.server.MongoDB.User.SimpleUser;
import spring.generic.server.MongoDB.User.User;
import spring.generic.server.Security.Others.UserService;
import spring.generic.server.Security.Others.UserServiceImpl;

import java.util.Date;

/**
 * Created by gadiel on 15/10/2016.
 */
public class IdosTests {
    private final static UserService userService = null;

    public IdosTests() {
    }

    public static void main(String[] args) {

        Date date = new Date();
        User adminUser = new AdminUser("123","admin-user3",date);
        User simpleUser = new SimpleUser("123","simple-user3",date);
        User simpleUser1 = new SimpleUser("123","simple-user3",date);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        mongoOperation.save(adminUser);
        mongoOperation.save(simpleUser);
        User u1 = UserUtills.getUserByEmail("admin-user3");
        System.out.println(u1.getEmail()+":"+u1.getRole());
        User u2 = UserUtills.getUserByEmail("simple-user3");
        System.out.println(u2.getEmail()+":"+u2.getRole());
        User u3 = UserUtills.getUserByEmail("simple-user3");
        System.out.println(u3.getEmail()+":"+u3.getRole());
        User u4 = UserUtills.getUserByEmail("simple-user3");
        System.out.println(u4.getEmail()+":"+u4.getRole());
        User u5 = UserUtills.getUserByEmail("simple-user3");
        System.out.println(u5.getEmail()+":"+u5.getRole());
        User u6 = UserUtills.getUserByEmail("simple-user5");
        System.out.println(u6.getEmail()+":"+u6.getRole());


        User oldUser = userService.getOldUser();
        System.out.println(oldUser.getPassword() +":"+ oldUser.getId());
        User newUser = userService.getNewUser();
        System.out.println(newUser.getPassword() +":"+ newUser.getId());
        User otherUser = userService.getOtherUser();
        System.out.println(otherUser.getPassword() +":"+ otherUser.getId());
    }
}
