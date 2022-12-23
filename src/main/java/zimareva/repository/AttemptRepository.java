package zimareva.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import zimareva.model.Attempt;

import java.util.List;

@Repository
public interface AttemptRepository extends CrudRepository<Attempt, Long> {
    @Query(
            value = "SELECT * FROM attempt WHERE game_id = :gameId",
            nativeQuery = true)
    List<Attempt> findAllByGameId(@Param("gameId") Long gameId);
}
