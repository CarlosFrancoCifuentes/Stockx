package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Max implements Criteria{
    
    private Criteria size;
    private Criteria bids;

    public Max(Criteria size, Criteria bids){
        this.size = size;
        this.bids = bids;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        Criteria andCriteria = new AndCriteria(size, bids);
        List<Offer> max = new ArrayList<Offer>();

        Offer offer = andCriteria.checkCriteria(sneaker).stream().max(Comparator.comparing(n -> n.value())).orElse(null);

        max.add(offer);

        return max;
    }
}
