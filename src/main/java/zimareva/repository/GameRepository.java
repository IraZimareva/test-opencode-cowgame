package zimareva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zimareva.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
