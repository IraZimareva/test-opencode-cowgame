package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.model.Attempt;
import zimareva.repository.AttemptRepository;

import java.util.List;

@Service
public class AttemptService {
    private final AttemptRepository attemptRepository;

    @Autowired
    public AttemptService(AttemptRepository attemptRepository) {
        this.attemptRepository = attemptRepository;
    }

    public Attempt addAttempt(Attempt attempt){
        return attemptRepository.save(attempt);
    }

    public List<Attempt> getAttempts(Long gameId){
        return attemptRepository.findAllByGameId(gameId);
    }
}
