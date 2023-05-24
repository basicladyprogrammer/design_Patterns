package com.company.observer;

//This is the observer interface
public interface ScoreCardObserver {

    // a method used to communicate about
    //new events to the observers

    //todo: use an object as the match state
    void notifyNewDelivery(String matchState);

}
