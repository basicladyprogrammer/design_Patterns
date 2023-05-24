package com.company.observer;

public class BowlingCardObserver implements ScoreCardObserver{
    @Override
    public void notifyNewDelivery(String matchState) {
        System.out.println("Updating the bowling card with new match state " + matchState);

    }
}
