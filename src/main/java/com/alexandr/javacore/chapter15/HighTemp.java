package com.alexandr.javacore.chapter15;

public class HighTemp {
    private int highTemp;

    public HighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    boolean sameTemp(HighTemp highTemp){
        return this.highTemp == highTemp.highTemp;
    }

    boolean lessThanTemp(HighTemp highTemp){
        return this.highTemp < highTemp.highTemp;
    }

    public int getHighTemp() {
        return highTemp;
    }
}
