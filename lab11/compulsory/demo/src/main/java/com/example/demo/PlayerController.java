package com.example.demo;

import ServerApp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    List<Player> players = new ArrayList<>();
    public PlayerController(Player player) {
        players.add(player);
    }

    /*public PlayerController(){
        players.add(new Player("Mask"));
    }*/

    @GetMapping
    public List<Player> getPlayers() {
        return players;
    }

}