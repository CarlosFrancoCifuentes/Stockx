package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class MinAsk implements Criteria{

    private List<Offer> minAsk = new ArrayList<Offer>();
    private List<Offer> listaAsks;
    Criteria asks = new Asks();

    public MinAsk(){
        //Constructor
    }

    

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        listaAsks = asks.checkCriteria(sneaker);
        Offer min = listaAsks.stream().filter(n -> n != null).min(Comparator.comparing(o -> o.value())).orElse(null);
        minAsk.add(min);
        return minAsk;
    }
}
