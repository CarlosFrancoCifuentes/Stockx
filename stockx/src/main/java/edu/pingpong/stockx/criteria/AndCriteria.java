package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;

public class AndCriteria implements Criteria{
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria size = new Size(size);
        Criteria sales = new Sales();

        List<Offer> firstCriteria = sneaker.offers().stream().filter(n -> n.size().equals())
            .collect(Collectors.toList());

        List<Offer> secondCriteria = new ArrayList<Offer>();
        firstCriteria.stream().filter(s -> s instanceof Sales).forEach(secondCriteria :: add);

        return secondCriteria;
    }
}
