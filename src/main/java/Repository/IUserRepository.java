package Repository;

import Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
    User findUserByEmail(String email);
    User findUserByUsername(String username);
}
