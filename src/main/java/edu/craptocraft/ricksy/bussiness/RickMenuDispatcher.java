package edu.craptocraft.ricksy.bussiness;



public class RickMenuDispatcher implements GuestDispatcher{

    private int stockMenu = 100;
    private double priceMenu = 10d;

    RickMenuDispatcher(){};

    @Override
    public void dispatch(CreditCard card){

        if(stockMenu > 0 && card.pay(priceMenu)) {
            card.pay(priceMenu);
            stockMenu -= 1;
        }
    }

    int stockMenu(){
        return this.stockMenu;
    }

    @Override
    public String toString(){
        return("Menús disponibles: " + stockMenu + "\n" +
                "coste del menú : " + priceMenu);
    }



    
}
