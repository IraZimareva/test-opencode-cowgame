package zimareva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zimareva.model.Game;
import zimareva.service.MainService;
import zimareva.utils.ResultDTO;

@RestController
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping(value = "{userId}/startGame")
    public ResponseEntity<Game> startNewGame(@PathVariable final Long userId){
        Game newGame = mainService.startNewGame(userId);
        return new ResponseEntity<>(newGame, HttpStatus.OK);
    }

    @GetMapping(value = "{gameId}/checkNumber")
    public ResponseEntity<ResultDTO> checkNumber(@PathVariable final Long gameId,
                                            @RequestBody final String number){
        ResultDTO resultDTO = mainService.checkNumber(gameId, number);
        return new ResponseEntity<>(resultDTO, HttpStatus.OK);
    }
}
