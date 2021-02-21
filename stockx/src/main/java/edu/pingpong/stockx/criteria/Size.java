package edu.pingpong.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Size implements Criteria{

    private String size;

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> size = sneaker.offers().stream().filter(n -> n.size()
            .equals(this.size)).collect(Collectors.toList());
        return size;
    }
    
}
