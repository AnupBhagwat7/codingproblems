package com.designpatterns.observer;

public class AverageScoreDisplay implements Observer{

    float runRate;
    @Override
    public void update(int runs, int wickets, float overs) {

        this.runRate = runs / overs;
        dispaly();
    }

    public void dispaly(){
        System.out.println("Runrate: "+ runRate );
    }
}
