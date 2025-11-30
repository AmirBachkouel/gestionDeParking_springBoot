package Service.Interface;

import Entity.User;
import Service.MethodParameters.UserParameters;

import java.util.List;

public interface IUserService {
    List<User> getUsers(UserParameters userParameters);
    User getUser(UserParameters userParameters);
    User addUser(User user);
    User modifyUser(User user);
    void deleteUser(UserParameters userParameters);
    void deleteUsers(UserParameters userParameters);
}
