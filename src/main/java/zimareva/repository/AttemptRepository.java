package zimareva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zimareva.model.Attempt;

@Repository
public interface AttemptRepository extends CrudRepository<Attempt, Long> {
}
