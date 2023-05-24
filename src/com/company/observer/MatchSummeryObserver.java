package com.company.observer;

public class MatchSummeryObserver implements ScoreCardObserver{
    @Override
    public void notifyNewDelivery(String matchState) {
        System.out.println("Updating the match summery with new match state " + matchState);

    }
}
