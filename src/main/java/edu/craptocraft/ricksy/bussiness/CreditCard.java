package edu.craptocraft.ricksy.bussiness;

public class CreditCard {

    private final String owner;
    private final String number;
    private final String SYMBOL = "EZIS";
    private Double credit = 3000d;

    public CreditCard(String owner, String number){
        this.owner = owner;
        this.number = number;
    }

    String number(){
        return this.number;
    }

    String CardOwner(){
        return this.owner;
    }

    Double credit(){
        return this.credit;
    }

    @Override
    public String toString(){
        return "owner " + this.owner +
               "\n" + this.number + 
               "\n" + this.credit + " " + this.SYMBOL;
    }

    Boolean pay(Double charge){
        if(this.credit >= charge){
            this.credit -= charge;
            return true;
        }else{
            return false;
        }
    }

    
}
