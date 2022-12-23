package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.exception.EntityNotFoundException;
import zimareva.model.Game;
import zimareva.repository.GameRepository;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game addGame(Game game){
        return gameRepository.save(game);
    }

    public Game getGame(Long gameId){
        return gameRepository.findById(gameId).orElseThrow(() ->
                new EntityNotFoundException(Game.class.getName(), gameId));
    }

    public int incrementNumberOfAttempts(Long id){
        Game gameToEdit = getGame(id);
        System.out.println("Было до инкрементации попыток " + gameToEdit.getNumberOfAttempts());
        gameToEdit.setNumberOfAttempts(gameToEdit.getNumberOfAttempts() + 1);
        int incrAttempts = gameToEdit.getNumberOfAttempts();
        System.out.println("Стало после инкремента попыток " + incrAttempts);
        return incrAttempts;
    }
}
