package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject{

    int runs;
    int wickets;
    float overs;
    List<Observer> observers;

    CricketData(int runs,int wickets,float overs){
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        observers = new ArrayList<>();
    }

    public static void main(String[] args) {

        CricketData cricketData = new CricketData(120,4, 13.5f);
        cricketData.registerObserver(new CurrentScoreDisplay());
        cricketData.registerObserver(new AverageScoreDisplay());
        cricketData.notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for(Observer observer:observers){
            observer.update(getRuns(),getWickets(),getOvers());
        }
    }

    public int getRuns() {
        return this.runs;
    }

    public int getWickets() {
        return this.wickets;
    }

    public float getOvers() {
        return this.overs;
    }
}
