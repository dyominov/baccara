package com.dyominov.baccarat.model;

import java.util.Objects;

public class Result {
    private Double percentHome;
    private Double percentAway;
    private Double averageTotal;
    private Double handicape;

    public Result() {
    }

    public Result(Double percentHome, Double percentAway, Double averageTotal, Double handicape) {
        this.percentHome = percentHome;
        this.percentAway = percentAway;
        this.averageTotal = averageTotal;
        this.handicape = handicape;
    }

    public Double getPercentHome() {
        return percentHome;
    }

    public void setPercentHome(Double percentHome) {
        this.percentHome = percentHome;
    }


    public Double getPercentAway() {
        return percentAway;
    }

    public void setPercentAway(Double percentAway) {
        this.percentAway = percentAway;
    }


    public Double getAverageTotal() {
        return averageTotal;
    }

    public void setAverageTotal(Double averageTotal) {
        this.averageTotal = averageTotal;
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
        Result result = (Result) o;
        return Objects.equals(percentHome, result.percentHome) &&
                Objects.equals(percentAway, result.percentAway) &&
                Objects.equals(averageTotal, result.averageTotal) &&
                Objects.equals(handicape, result.handicape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentHome, percentAway, averageTotal, handicape);
    }

    @Override
    public String toString() {
        return "Result{" +
                "percentHome=" + percentHome +
                ", percentAway=" + percentAway +
                ", averageTotal=" + averageTotal +
                ", handicape=" + handicape +
                '}';
    }
}
