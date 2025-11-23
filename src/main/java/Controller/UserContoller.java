package Controller;

import Entity.User;
import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class UserContoller {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("GetUser/{id}")
    public User getUser(@PathVariable("id") int  id) {
        return userService.getUser(id);
    }
    @GetMapping("GetUser/{criteria}")
    public User getUser(@PathVariable("criteria") String criteria) {
        return userService.getUser(criteria);
    }

    @PostMapping("AddUser/")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("DeleteUser/{id}")
    public  void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
    @DeleteMapping("DeleteUser/{criteria}")
    public  void deleteUser(@PathVariable("criteria") String  criteria) {
        userService.deleteUser(criteria);
    }
}
