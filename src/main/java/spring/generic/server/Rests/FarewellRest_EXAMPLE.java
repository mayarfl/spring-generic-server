package spring.generic.server.Rests;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import spring.generic.server.Utills.Params;

/**
 * Created by gadiel on 11/10/2016.
 */
@RestController
@RequestMapping("/farewell")
public class FarewellRest_EXAMPLE {

    @Secured({Params.UserRoles.SimpleUser, Params.UserRoles.AdminUser})
    @RequestMapping(value ="/sayBye", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value="name", defaultValue="World") String name) {
        return "Bye "+name;
        //example: http://localhost:8080/farewell/sayBye?name=ido
    }

    @Secured({Params.UserRoles.SimpleUser, Params.UserRoles.AdminUser})
    @RequestMapping(value = "Seeya/{name}", method = RequestMethod.GET)
    String readBookmark2(@PathVariable String name) {
        return "Seeya "+name;
        //examaple: http://localhost:8080/farewell/Seeya/ido
    }


    @Secured({Params.UserRoles.SimpleUser, Params.UserRoles.AdminUser})
    @RequestMapping(value = "Hi/{name}", method = RequestMethod.GET)
    String readBookmark1(@PathVariable String name) {
        return "Hi "+name;
        //examaple: http://localhost:8080/farewell/Seeya/ido
    }

}
