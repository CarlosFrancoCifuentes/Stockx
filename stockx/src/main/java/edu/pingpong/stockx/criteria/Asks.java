package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Asks implements Criteria {
    
    public Asks(){
        //Constructor
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> listaAsks = item.offers();
        listaAsks.stream().filter(ask -> ask instanceof Ask).collect(Collectors.toList());
        return listaAsks;
    }
}