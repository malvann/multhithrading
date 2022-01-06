package com.my.ex.volotile;

import lombok.Getter;

@Getter
public class Market {
    private int numOfItemPlates = 0;
    private int numOfItemCups = 0;
    private int reservePlates = 0;
    private int reserveCups = 0;

    public void addPlates(int num) {
        numOfItemPlates += num;
    }

    public void addCups(int num) {
        numOfItemCups += num;
    }

    public int removePlates(int num) {
        if (numOfItemPlates < num) {
            reservePlates = num - numOfItemPlates;
            numOfItemPlates = 0;
            return
        } else numOfItemPlates -= num;
        return num;
    }

    public int removeCups(int num) {
        if (numOfItemCups < num) {
            num -= numOfItemCups;
            numOfItemCups = 0;
        } else numOfItemCups -= num;
        return num;
    }
}