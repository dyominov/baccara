package com.dyominov.baccarat.model;

import java.util.Objects;

public class DataGame {

    private Double totalScore;
    private Double homeScore;
    private Double awayScore;
    private Double handicape;

    public DataGame() {
    }

    public DataGame(Double totalScore, Double homeScore, Double awayScore, Double handicape, Double halfScore, Double halfHandicape) {
        this.totalScore = totalScore;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.handicape = handicape;
    }


    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Double getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Double homeScore) {
        this.homeScore = homeScore;
    }

    public Double getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Double awayScore) {
        this.awayScore = awayScore;
    }

    public Double getHandicape() {
        return handicape;
    }

    public void setHandicape(Double handicape) {
        this.handicape = handicape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataGame dataGame = (DataGame) o;
        return
                Objects.equals(totalScore, dataGame.totalScore) &&
                        Objects.equals(homeScore, dataGame.homeScore) &&
                        Objects.equals(awayScore, dataGame.awayScore) &&
                        Objects.equals(handicape, dataGame.handicape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalScore, homeScore, awayScore, handicape);
    }
}
