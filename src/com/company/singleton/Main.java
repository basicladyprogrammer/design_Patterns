package com.company.singleton;

import com.company.singleton.ClipBoard;

public class Main {
    public static void main(String[] args) {

        ClipBoard clipBoard1 = ClipBoard.getInstance();
        ClipBoard clipBoard2 = ClipBoard.getInstance();

        clipBoard1.copy("A");
        clipBoard2.copy("B");
        System.out.println(clipBoard1.paste()); //B
        System.out.println(clipBoard2.paste()); //B

        ClipBoard clipBoard3 = ClipBoard.getInstance();

        clipBoard1.copy("C");
        System.out.println(clipBoard1.paste()); //C
        System.out.println(clipBoard2.paste()); //C

        clipBoard3.copy("D");
        System.out.println(clipBoard1.paste()); //D
        System.out.println(clipBoard2.paste()); //D
        System.out.println(clipBoard3.paste()); //D

    }
}