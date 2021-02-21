package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Bids implements Criteria{
    
    public Bids(){
        //Constructor
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lista = new ArrayList<Offer>();
        List<Offer> listaItems = item.offers();
        
        for (Offer zapato : listaItems){
            if (zapato instanceof Bid){
                lista.add(zapato);
            }
            else{
                continue;
            }
        }
        return lista;
    }
}
