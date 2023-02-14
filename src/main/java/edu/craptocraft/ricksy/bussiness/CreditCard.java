package edu.craptocraft.ricksy.bussiness;

public class CreditCard {

    private final String owner;
    private final String number;
    private final String SYMBOL = "EZIS";    
    private Double credit = 3000d;

    CreditCard(String owner, String number){
        this.owner = owner;
        this.number = number;
    }

    String number(){
        return this.number;
    }

    String cardOwner(){
        return this.owner;
    }

    Double credit(){
        return this.credit;
    }

    @Override
    public String toString(){

        return "Owner " + owner + "\n" + number + "\n" + credit + " " + SYMBOL;
    }

    Boolean pay(double pay){
        if(this.credit >= pay){
            credit -= pay;
            return true;
        }else{
            return false;
        }
    }
}