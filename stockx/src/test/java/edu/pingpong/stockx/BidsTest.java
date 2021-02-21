package edu.pingpong.stockx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Bids;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sneaker;

public class BidsTest {
    
    @Test
    public void checkCriteriaTest(){
        Criteria bids = new Bids();

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Ask("13", 288));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Ask("9.5", 479));

        bids.checkCriteria(sneaker);

        assertNotNull(bids.checkCriteria(sneaker));

        assertFalse(bids.checkCriteria(sneaker).isEmpty());
    }
}
