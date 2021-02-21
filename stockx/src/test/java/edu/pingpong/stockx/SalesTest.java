package edu.pingpong.stockx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.Sales;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class SalesTest {

    @Test
    public void checkCriteriaTest(){
        Criteria sales = new Sales();

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Sale("13", 288));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));

        sales.checkCriteria(sneaker);

        assertNotNull(sales.checkCriteria(sneaker));

        assertFalse(sales.checkCriteria(sneaker).isEmpty());
    }
}
