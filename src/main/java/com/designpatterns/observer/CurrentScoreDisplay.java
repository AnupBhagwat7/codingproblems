package com.designpatterns.observer;

public class CurrentScoreDisplay implements Observer{

    int runs;
    int wickets;
    float overs;

    @Override
    public void update(int runs, int wickets, float overs) {

        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("Runs: "+ runs +" Wickets: "+wickets +" Overs:  "+overs);
    }
}
