package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;

public class LastSale implements Criteria{

    private List<Offer> lastSale = new ArrayList<Offer>();
    private List<Offer> listaSales;
    Criteria sales = new Sales();

    public LastSale(){
        //Constructor
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        listaSales = sales.checkCriteria(sneaker);
        Offer sales = listaSales.stream().filter(n -> n != null).reduce((first, second) -> second).orElse(null);
        lastSale.add(sales);
        return lastSale;
    }
    
}
