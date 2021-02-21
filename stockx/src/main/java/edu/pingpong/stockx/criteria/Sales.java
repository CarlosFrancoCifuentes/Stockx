package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;

public class Sales implements Criteria{
    
    public Sales(){
        //Constructor
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lista = new ArrayList<Offer>();
        List<Offer> listaItems = item.offers();
        
        for (Offer zapato : listaItems){
            if (zapato instanceof Sale){
                lista.add(zapato);
            }
            else{
                continue;
            }
        }
        return lista;
    }
}
