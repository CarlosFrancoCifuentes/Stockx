package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class MaxBid implements Criteria {

    

    public MaxBid(){
        //Constructor
    };

    

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        List<Offer> maxBid = new ArrayList<Offer>();
        List<Offer> listaBids;
        Criteria bids = new Bids();

        listaBids = bids.checkCriteria(sneaker);
        Offer max = listaBids.stream().filter(n -> n != null).max(Comparator.comparing(o -> o.value())).orElse(null);
        maxBid.add(max);
        return maxBid;
    }
}
