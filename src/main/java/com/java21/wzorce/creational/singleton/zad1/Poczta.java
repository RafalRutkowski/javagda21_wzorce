package com.java21.wzorce.creational.singleton.zad1;

public class Poczta {
    private Automat automat;
    private Rejestracja rejestracja;
    private StronaInternetowa stronaInternetowa;

    public Poczta() {
        this.automat = automat;
        this.rejestracja = rejestracja;
        this.stronaInternetowa = stronaInternetowa;
    }
    public  int pobierzTicketZAutomatu (){
        return automat.generujTicket();
    }
    public int pobierzTicketZRejestracji (){
        return rejestracja.generujTicket();
    }
    public int pobierzTicketZeStronyInternetowej (){
        return stronaInternetowa.generujTicket();
    }
}
