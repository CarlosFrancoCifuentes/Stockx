package edu.pingpong.stockx.criteria;

import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}
