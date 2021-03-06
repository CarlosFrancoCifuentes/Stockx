package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.MinAsk;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sneaker;

public class MinAskTest {
    
    @Test
    public void checkCriteriaTest(){
        Criteria minAsk = new MinAsk();        

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Ask("13", 288));
        sneaker.add(new Ask("6", 200));
        sneaker.add(new Ask("9.5", 59));

        minAsk.checkCriteria(sneaker);
        
        assertNotNull(minAsk.checkCriteria(sneaker));
        assertFalse(minAsk.checkCriteria(sneaker).isEmpty());

        for (Offer offer : minAsk.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Ask);
            assertEquals(59, offer.value());
        }
    }
}
