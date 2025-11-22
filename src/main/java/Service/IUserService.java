package Service;

import Entity.User;

import java.util.List;

public interface IUserService {
    public User getUser(int id);
    public User getUser(String criteria);
    public User addUser(User user);
    public void deleteUser(int id);
    public void deleteUser(String criteria);
}
