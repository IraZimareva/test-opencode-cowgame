package zimareva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zimareva.dto.NumberDTO;
import zimareva.dto.ResultDTO;
import zimareva.model.Game;
import zimareva.service.MainService;

@Controller
@RequestMapping("/games")
public class GameController {
    private final MainService mainService;

    @Autowired
    public GameController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping
    public String startNewGame(@RequestParam(value = "user_id") final Long userId,
                               Model model) {
        Game newGame = mainService.startNewGame(userId);
        model.addAttribute("game", newGame);
        model.addAttribute("number",new NumberDTO());
        return "game";
    }

/*
    //todo: или gameId передавать @RequestBody по-другому? Например через @RequestParam
    @PostMapping(value = "/checkNumber")
    public ResponseEntity<ResultDTO> checkNumber(@RequestBody final NumberDTO number,
                                                 Model model) {
        ResultDTO resultDTO = mainService.checkNumber(number);
        model.addAttribute("result", resultDTO);
        return new ResponseEntity<>(resultDTO, HttpStatus.OK);
    }*/
}
