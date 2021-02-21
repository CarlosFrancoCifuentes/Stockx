package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Asks implements Criteria {
    
    public Asks(){
        //Constructor
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> listaAsk = new ArrayList<Offer>();
        sneaker.offers().stream().filter(s -> s instanceof Ask).forEach(listaAsk :: add);
        return listaAsk;
    }
}