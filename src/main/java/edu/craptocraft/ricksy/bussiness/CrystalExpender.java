package edu.craptocraft.ricksy.bussiness;

public class CrystalExpender implements GuestDispatcher{

    private int stock;
    private double itemCost;

    CrystalExpender(int stock, double itemCost){
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard card){
        
        if(this.stock > 0 && card.credit() >= itemCost){
            card.pay(itemCost);
            stock -= 1;
        }
    }

    int stock(){
        return this.stock;
    }

    @Override
    public String toString(){

        return ("El stock es: " + stock + "\n" + "El coste total " + 
                itemCost);

    }





    
    
}
