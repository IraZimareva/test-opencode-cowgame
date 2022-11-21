package zimareva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zimareva.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
