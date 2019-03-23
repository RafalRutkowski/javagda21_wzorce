package com.java21.wzorce.creational.singleton.zad1;

public class StronaInternetowa implements IGeneratorTicketow{

    public int generujTicket() {
        return GeneratorTicketow.getInstance().pobierzNastepnyNumerek();
    }
}