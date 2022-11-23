package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.exception.GameNotFoundException;
import zimareva.model.Game;
import zimareva.repository.GameRepository;

import javax.transaction.Transactional;

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
                new GameNotFoundException(gameId));
    }

    @Transactional
    public Game editNumberOfAttempts(Long id, int numberOfAttempts){
        Game gameToEdit = getGame(id);
        gameToEdit.setNumberOfAttempts(numberOfAttempts);
        return gameToEdit;
    }
}
