package com.dyominov.baccarat.endpoints;

import com.dyominov.baccarat.model.DataGame;
import com.dyominov.baccarat.model.Game;
import com.dyominov.baccarat.model.Result;
import com.dyominov.baccarat.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "game")
public class GameController {
    private final GameService gameService;

    public GameController(final GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getAllGames() {
        return gameService.getAll();
    }

    @PutMapping("/result")
    @ResponseStatus(HttpStatus.OK)
    public Result getResult(@RequestBody final DataGame game) {
        return gameService.getResult(game.getTotalScore(), game.getHomeScore(), game.getAwayScore(), game.getHandicape());
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Game getGameById(@PathVariable final String id) {
        return gameService.getGameById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game createGame(@RequestBody final Byte[] game) {
        return gameService.create(new Game());
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable final String id) {
        gameService.deleteById(id);
    }


    @GetMapping("/parse")
    @ResponseStatus(HttpStatus.OK)
    public void parseData() {
        gameService.parseData();
    }

}
