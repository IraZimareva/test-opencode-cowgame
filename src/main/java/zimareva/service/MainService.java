package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.dto.CowBullDTO;
import zimareva.dto.NumberDTO;
import zimareva.dto.ResultDTO;
import zimareva.model.Attempt;
import zimareva.model.Game;
import zimareva.model.User;
import zimareva.utils.*;

import javax.transaction.Transactional;

@Service
public class MainService {
    private final UserService userService;
    private final GameService gameService;
    private final AttemptService attemptService;


    @Autowired
    public MainService(UserService userService, GameService gameService, AttemptService attemptService) {
        this.userService = userService;
        this.gameService = gameService;
        this.attemptService = attemptService;
    }

    @Transactional
    public Game startNewGame(Long userId) {
        String generatedNumber = Converter.convertListOfIntegerToString(Randomizer.generateGameNumber());
        Game game = new Game(generatedNumber);
        gameService.addGame(game);
        User currUser = userService.getUser(userId);
        currUser.addNewGame(game);
        return game;
    }

    @Transactional
    public ResultDTO checkNumber(Long gameId, NumberDTO number) {
        Game currGame = gameService.getGame(gameId);
        String enteredNumber = number.concatValueToString();
        CowBullDTO cowBullDTO = Checker.checkNumber(enteredNumber, currGame.getBenchmarkNumber());
        Attempt attempt = attemptService.addAttempt(
                new Attempt(enteredNumber, cowBullDTO.getBull(), cowBullDTO.getCow()));
        currGame.addNewAttempt(attempt);

        ResultDTO resultDTO = new ResultDTO(cowBullDTO.getBull(), cowBullDTO.getCow());
        int countOfAttempts = gameService.incrementNumberOfAttempts(gameId);
        resultDTO.setCountOfAttempts(countOfAttempts);
        if(resultDTO.getBull() == 4){
            currGame.setOver(true);
        }
        resultDTO.setGameOver(currGame.getOver());
        return resultDTO;
    }
}
