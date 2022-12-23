package zimareva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zimareva.dto.NumberDTO;
import zimareva.dto.ResultDTO;
import zimareva.model.Game;
import zimareva.service.GameService;
import zimareva.service.MainService;

@Controller
@RequestMapping("/games")
public class GameController {
    private final MainService mainService;
    private final GameService gameService;

    @Autowired
    public GameController(MainService mainService, GameService gameService) {
        this.mainService = mainService;
        this.gameService = gameService;
    }

    @PostMapping
    public String startNewGame(@RequestParam(value = "user_id") final Long userId,
                               Model model) {
        Game newGame = mainService.startNewGame(userId);
        model.addAttribute("game", newGame);
        return "game";
    }

    @PostMapping(value = "{gameid}")
    public String checkNumber(@PathVariable final Long gameid,
                                                 @ModelAttribute("numberDTO") final NumberDTO number,
                                                 Model model) {
        ResultDTO resultDTO = mainService.checkNumber(gameid, number);
        model.addAttribute("game", gameService.getGame(gameid));
        model.addAttribute("result", resultDTO);
        return "game";
    }

    @ModelAttribute("numberDTO")
    public NumberDTO populateGame(){
        return new NumberDTO();
    }
}
