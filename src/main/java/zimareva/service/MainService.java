package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.model.Game;
import zimareva.model.User;
import zimareva.utils.Checker;
import zimareva.utils.Converter;
import zimareva.utils.Randomizer;

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
    public Game startNewGame(Long userId){
        String generatedNumber = Converter.convertListOfIntegerToString(Randomizer.generateGameNumber());
        Game game = new Game(generatedNumber);
        gameService.addGame(game);
        User currUser = userService.getUser(userId);
        currUser.addNewGame(game);
        return game;
    }

    //todo: второй вариант - вытаскивать текущего юзера из текущей игры (но тогда надо сделать двунаправленную связь в сущностях)
    //todo: дописать логику и переписать сигнатуру метода
    public void checkNumber(Long userId, Long gameId, String number){
        Game currGame = gameService.getGame(gameId);
        User currUser = userService.getUser(userId);
        int [] resultOfChecking = Checker.checkNumber(number, currGame.getBenchmarkNumber());


        //не забыть прибавлять попытки

    }

}
