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
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> listaBid = new ArrayList<Offer>();
        sneaker.offers().stream().filter(s -> s instanceof Bid).forEach(listaBid :: add);
        return listaBid;
    }
}
