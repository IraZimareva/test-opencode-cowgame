package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.exception.EntityNotFoundException;
import zimareva.model.Attempt;
import zimareva.repository.AttemptRepository;

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

    public Attempt getAttempt(Long attemptId){
        return attemptRepository.findById(attemptId).orElseThrow(() ->
                new EntityNotFoundException(Attempt.class.getName(), attemptId));
    }

    /*public int incrementNumberOfAttempts(Long id){
        Game gameToEdit = getGame(id);
        System.out.println("Было до инкрементации попыток " + gameToEdit.getNumberOfAttempts());
        gameToEdit.setNumberOfAttempts(gameToEdit.getNumberOfAttempts() + 1);
        int incrAttempts = gameToEdit.getNumberOfAttempts();
        System.out.println("Стало после инкремента попыток " + incrAttempts);
        return incrAttempts;
    }*/
}
