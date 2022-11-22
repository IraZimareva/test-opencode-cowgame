package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.exception.UserNotFoundException;
import zimareva.model.Game;
import zimareva.model.User;
import zimareva.repository.UserRepository;
import zimareva.utils.ListOfIntegerToStringConverter;
import zimareva.utils.Randomizer;

import javax.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final GameService gameService;

    @Autowired
    public UserService(UserRepository userRepository, GameService gameService) {
        this.userRepository = userRepository;
        this.gameService = gameService;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException(id));
    }

    @Transactional
    public Game startNewGame(Long userId){
        String generatedNumber =
                ListOfIntegerToStringConverter.convertListOfIntegerToString(Randomizer.generateGameNumber());
        Game game = new Game(generatedNumber);
        gameService.addGame(game);
        User currUser = getUser(userId);
        currUser.addNewGame(game);
        return game;
    }
}
