package spring.generic.server.Security.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.generic.server.MongoDB.User.UserUtills;
import spring.generic.server.MongoDB.User.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final LoggedInChecker loggedInChecker;

    @Autowired
    UserServiceImpl(LoggedInChecker loggedInChecker) {
        this.loggedInChecker = loggedInChecker;
    }

    @Override
    public User getUserByUsername(String email) {
        User DBUser = UserUtills.getUserByEmail(email);
        if (DBUser != null) {
            return DBUser;
        }
            return null;
    }

    @Override
    public List<String> getPermissions(String username) {
        // a new password is "password"
        List<String> permissions = new ArrayList<>();
        permissions.add("ROLE_ADMIN");
        return permissions;
    }

    @Override
    public User getCurrentUser() {
        return loggedInChecker.getLoggedInUser();
    }


    @Override
    public User getOldUser() {
        return loggedInChecker.getLoggedInOldUser();
    }


    @Override
    public User getNewUser() {
        return loggedInChecker.getLoggedInNewUser();
    }

    @Override
    public User getOtherUser() { return loggedInChecker.getLoggedInOtherUser(); }

    @Override
    public Boolean isCurrentUserLoggedIn() {
        return loggedInChecker.getLoggedInUser() != null;
    }

}
