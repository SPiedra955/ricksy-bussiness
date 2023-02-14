package edu.craptocraft.ricksy.bussiness;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{

    private Double fee = 500d;
    private final Map<String, String> flota = new HashMap<String, String>();

    UfosPark(){};
    
    void add(String ufosID){
        flota.putIfAbsent(ufosID, null);
    }

    @Override
    public void dispatch(CreditCard card) {

        Map.Entry<String, String> ufo = null;

        if(!flota.containsValue(card.number())){
            for(Map.Entry<String, String> entry : this.flota.entrySet()){
                if(entry.getValue() == null){
                    ufo = entry;
                    break;
                }
            }
        }
        if(ufo != null && card.pay(fee)){
            this.flota.put(ufo.getKey(), card.number());
        }
    }
    
    String getUfoOf(String cardNumber){
        String ufoID = null;
        if(this.flota.containsValue(cardNumber)){
            for(Map.Entry<String, String> entry : this.flota.entrySet()){
                if(entry.getValue() == cardNumber){
                ufoID = entry.getKey();
                break;
                }
            }
        }

        return ufoID;
    }

    public String toString(){

        return flota.keySet().toString();
    }
 
}
         
    
