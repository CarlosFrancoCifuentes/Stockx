package edu.pingpong.stockx.criteria;

import java.util.ArrayList;

import java.util.List;

import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class MinAsk implements Criteria{
    public MinAsk(){
        //Constructor
    }

    

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lista = new ArrayList<Offer>();
        List<Offer> listaItems = item.offers();
        int min = 0;
        List<Offer> minAsk = new ArrayList<Offer>();
        
        for (Offer zapato : listaItems){
            if (zapato instanceof Ask){
                lista.add(zapato);
                if (min == 0){
                    min = zapato.value();
                }
                if (zapato.value() <= min){
                    min = zapato.value();
                    minAsk.add(zapato);
                    break;
                }
            }
            else{
                continue;
            }
        }
        return minAsk;
    }
}
