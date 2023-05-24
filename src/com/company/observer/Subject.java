package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//this is just like the newspaper agency
//this is the class responsible for the updating the
//scorecards when the match state changes



public class Subject {
    //Subject should maintain a list of observers
    private List<ScoreCardObserver> scoreCards = new ArrayList<ScoreCardObserver>();

    //allowing the observers to subscribe
    public void subscribe(ScoreCardObserver scoreCard){
        //implement this method
        scoreCards.add(scoreCard);
    }

    //allowing the observers to unsubscribe
    public void unsubscribe(ScoreCardObserver scoreCard){
        //implement this method
        scoreCards.remove(scoreCard);
    }

    //when the match state changes, notify all observers
    public void notifyObservers(String matchState){
        //call the notifyNewDelivery method of all the subscribed observers
        for (ScoreCardObserver scoreCard: scoreCards){
            scoreCard.notifyNewDelivery(matchState);
        }

    }
}
