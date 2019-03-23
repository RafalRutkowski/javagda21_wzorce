package com.java21.wzorce.creational.singleton.zad1;

public class GeneratorTicketow {
    private static GeneratorTicketow ourInstance = new GeneratorTicketow();

    public static GeneratorTicketow getInstance() {
        return ourInstance;
    }

    private GeneratorTicketow() {
    }
    private int numerek =1;
    public int pobierzNastepnyNumerek (){
        return numerek++;
    }
}
