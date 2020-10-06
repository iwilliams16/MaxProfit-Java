package com.cd.maximum.profit;

import java.util.Arrays;

public class MaxProfit {

    public Integer find(Integer[] input) {

        int maxProfit = 0;
        int lowestSellPrice = input[0];

        for (int i = 1; i < input.length; i++) { //for every element in the integer array
            if(input[i] < lowestSellPrice){
                lowestSellPrice = input[i];
            }
            int thisProfit = input[i] - lowestSellPrice;
            if(thisProfit > maxProfit){
                maxProfit = thisProfit;
            }
        }
        return maxProfit;
    }
}
/*input = [45, 24, 35, 31, 40, 38, 11]

buy_price = 0
sell_price = 0
max_profit = -1

At i = 0
buy_price = 45
sell_price = 24
max_profit = -1

At i = 1
buy_price = 24
sell_price = 35
max_profit = 11

At i = 2
buy_price = 24
sell_price = 31
max_profit = 7

At i = 3
buy_price = 24
sell_price = 40
max_profit = 16

At i = 4
buy_price = 24
sell_price = 38
max_profit = 14

At i = 5
buy_price = 24
sell_price = 11
max_profit = -1

Loop is done
max_profit = 16*/
