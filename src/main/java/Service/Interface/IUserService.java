package Service.Interface;

import Entity.User;
import Service.MethodParameters.UserParameters;

import java.util.List;

public interface IUserService {
    public List<User> getUsers(UserParameters userParameters);
    public User getUser(UserParameters userParameters);
    public User addUser(User user);
    public User modifyUser(User user);
    public void deleteUser(UserParameters userParameters);
    public User getUsers(UserParameters userParameters);
}
