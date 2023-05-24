package com.company.observer;

public class BattingCardObserver implements ScoreCardObserver{
    @Override
    public void notifyNewDelivery(String matchState) {
        System.out.println("Updating the batting card with new match state " + matchState);
    }
}
