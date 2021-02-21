package edu.pingpong.stockx.criteria;

import java.util.ArrayList;

import java.util.List;

import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class MaxBid implements Criteria{

    public MaxBid(){
        //Constructor
    }

    

    @Override
    public List<Offer> checkCriteria(Item item) {
        
        List<Offer> lista = new ArrayList<Offer>();
        List<Offer> listaItems = item.offers();
        int max = 0;
        List<Offer> maxBid = new ArrayList<Offer>();

        for (Offer zapato : listaItems){
            if (zapato instanceof Bid){
                lista.add(zapato);
                if (zapato.value() >= max){
                    max = zapato.value();
                    maxBid.add(zapato);
                }
            }
            else{
                continue;
            }
        }
        return maxBid;
    }
}
