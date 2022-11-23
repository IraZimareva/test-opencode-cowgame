package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.model.Game;
import zimareva.model.User;
import zimareva.utils.Checker;
import zimareva.utils.Converter;
import zimareva.utils.Randomizer;
import zimareva.utils.ResultDTO;

import javax.transaction.Transactional;

@Service
public class MainService {

    private final UserService userService;
    private final GameService gameService;

    @Autowired
    public MainService(UserService userService, GameService gameService) {
        this.userService = userService;
        this.gameService = gameService;
    }

    @Transactional
    public Game startNewGame(Long userId) {
        String generatedNumber = Converter.convertListOfIntegerToString(Randomizer.generateGameNumber());
        Game game = new Game(generatedNumber, 0);
        gameService.addGame(game);
        User currUser = userService.getUser(userId);
        currUser.addNewGame(game);
        return game;
    }

    public ResultDTO checkNumber(Long gameId, String number) {
        Game currGame = gameService.getGame(gameId);
        ResultDTO resultDTO = Checker.checkNumber(number, currGame.getBenchmarkNumber());
        gameService.editNumberOfAttempts(gameId, currGame.getNumberOfAttempts() + 1);
        return resultDTO;
    }
}
