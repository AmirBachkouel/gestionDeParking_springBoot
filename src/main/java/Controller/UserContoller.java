package Controller;

import Entity.Role;
import Entity.User;
import Service.Interface.IUserService;
import Service.MethodParameters.UserParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserContoller {
    @Autowired
    IUserService userService;

    @GetMapping("GetUser/")
    public List<User> getUsers(@RequestParam(value = "firsName", required = false) String firstName,
                               @RequestParam(value = "lastName", required = false) String lastName,
                               @RequestParam(value = "role", required = false) Role role) {
        return userService.getUsers(new UserParameters(firstName, lastName, role));
    }

    @PostMapping("AddUser/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("DeleteUser/{id}")
    public  void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}
