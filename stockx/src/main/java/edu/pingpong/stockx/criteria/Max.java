package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Max implements Criteria{
    
    private Criteria size;
    private Criteria bids;

    public Max(Criteria size, Criteria bids){
        this.size = seize;
        this.bids = bids;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        Criteria andCriteria = new AndCriteria(size, bids);
        List<Offer> listaAndCriteria;
        List<Offer> max = new ArrayList<Offer>();

        //Offer offer = andCriteria.checkCriteria(sneaker).stream().max(Comparator.comparing(;

        //max.add(offer);

        listaAndCriteria = andCriteria.checkCriteria(sneaker);

        Offer offer = listaAndCriteria.stream().max(Comparator.comparing(o -> o.value()));

        return max;
    }
}
