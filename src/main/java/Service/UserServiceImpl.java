package Service;

import Entity.User;
import Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUser(String criteria) {
        if (criteria.contains("@")) {
            return userRepository.findUserByEmail(criteria);
        } else {
            return userRepository.findUserByUsername(criteria);
        }
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteUser(String criteria) {
        User user;
        if (criteria.contains("@")) {
            user = userRepository.findUserByEmail(criteria);
        } else {
            user = userRepository.findUserByUsername(criteria);
        }

        userRepository.delete(user);
    }
}
