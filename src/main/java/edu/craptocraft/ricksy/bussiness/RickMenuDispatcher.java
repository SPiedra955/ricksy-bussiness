package edu.craptocraft.ricksy.bussiness;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher{

    private int stockMenu = 100;
    private double priceMenu = 10d;
    private List<String> menu = new ArrayList<String>();

    RickMenuDispatcher(){};

    @Override
    public void dispatch(CreditCard card){

        if(this.stockMenu > 0 && card.credit() >= priceMenu) {
            card.pay(priceMenu);
            stockMenu -= 1;
            this.menu.add(card.cardOwner());
        }
    }

    int stockMenu(){
        return this.stockMenu;
    }
    @Override
    public String toString(){
        return("Menús disponibles: " + stockMenu() + "\n" + menu);
    }



    
}
