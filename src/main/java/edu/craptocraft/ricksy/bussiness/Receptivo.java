package edu.craptocraft.ricksy.bussiness;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {

    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    void registra(GuestDispatcher observer){

        observers.add(observer);
    }

    void dispatch(CreditCard card){
        for(GuestDispatcher observer : observers){
            observer.dispatch(card);
        }
    } 
    
}
