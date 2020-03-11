package com.dyominov.baccarat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "games")

public class Game {

    @Id
    private String id;
    private String date;
    private Player player;
    private Player dealer;
    private Integer gameId;

    public Game() {
    }

    public Game(String date, Player player, Player dealer, Integer gameId) {
        this.date = date;
        this.player = player;
        this.dealer = dealer;
        this.gameId = gameId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) &&
                Objects.equals(date, game.date) &&
                Objects.equals(player, game.player) &&
                Objects.equals(dealer, game.dealer) &&
                Objects.equals(gameId, game.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, player, dealer, gameId);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", player=" + player +
                ", dealer=" + dealer +
                ", gameId=" + gameId +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getDealer() {
        return dealer;
    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }
}
