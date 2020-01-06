package spring.generic.server.Security.Others;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import spring.generic.server.MongoDB.User.User;
import spring.generic.server.Utills.Params;

@Component
public class LoggedInChecker {
    String PASSWORD = "password";

    public User getLoggedInUser() {
        User user = null;
        String PASSWORD = "password";

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();

            // principal can be "anonymousUser" (String)
            if (principal instanceof NuvolaUserDetails) {
                user.setId(Params.User.NAME);
                user.setPassword(Params.User.PASSWORD);
                user.setPassword(Params.User1.PASSWORD);
                NuvolaUserDetails userDetails = (NuvolaUserDetails) principal;
                user = userDetails.getUser();
            }
        }

        return user;
    }

    public User getLoggedInNewUser() {
        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();

            // principal can be "anonymousUser" (String)
            if (principal instanceof NuvolaUserDetails) {
                user.setId(Params.newUser.NAME);
                user.setPassword(Params.newUser.PASSWORD);
                user.setPassword(Params.User1.PASSWORD);
                NuvolaUserDetails userDetails = (NuvolaUserDetails) principal;
                user = userDetails.getUser();
            }
        }

        return user;
    }

    public User getLoggedInOldUser() {
        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();

            // principal can be "anonymousUser" (String)
            if (principal instanceof NuvolaUserDetails) {
                user.setId(Params.oldUser1.NAME);
                user.setPassword(Params.oldUser1.PASSWORD);
                NuvolaUserDetails userDetails = (NuvolaUserDetails) principal;
                user = userDetails.getUser();
            }
        }

        return user;
    }

    public User getLoggedInOtherUser() {
        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();

            // principal can be "anonymousUser" (String)
            if (principal instanceof NuvolaUserDetails) {
                user.setId(Params.otherUser.NAME);
                user.setPassword(Params.otherUser.PASSWORD);
                NuvolaUserDetails userDetails = (NuvolaUserDetails) principal;
                user = userDetails.getUser();
            }
        }

        return user;
    }
}
