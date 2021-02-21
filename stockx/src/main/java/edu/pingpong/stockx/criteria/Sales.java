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
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> listaSale = new ArrayList<Offer>();
        sneaker.offers().stream().filter(s -> s instanceof Sale).forEach(listaSale :: add);
        return listaSale;
    }
}
