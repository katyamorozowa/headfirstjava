package com.company.chapter3;

/**
 * Created by levrun on 07.02.2019.
 */
public class Player
{
    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
