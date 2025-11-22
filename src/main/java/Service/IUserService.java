package Service;

import Entity.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();
    public User getUser(int id);
    public User getUser(String criteria);
    public void addUser(User user);
    public void deleteUser(int id);
    public void deleteUser(String criteria);
}
