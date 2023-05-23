package com.company.singleton;

//Lets try to make this class Singleton
public class ClipBoard {

    private String content;
    private static ClipBoard instance;

    //create a private constructor to this class
    private ClipBoard(){

    }

    //create a method to get an object of this class
    public static ClipBoard getInstance(){
        if(instance == null){
            instance = new ClipBoard();
        }
        return instance;
    }

    public void copy(String newContent){
        this.content = newContent;
    }

    public String paste(){
        return this.content ;
    }
}
