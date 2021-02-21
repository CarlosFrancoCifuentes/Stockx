package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.LastSale;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class LastSaleTest {
    
    @Test
    public void checkCriteriaTest(){
        Criteria lastSale = new LastSale();        

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Sale("13", 288));
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("9.5", 59));

        lastSale.checkCriteria(sneaker);
        
        assertNotNull(lastSale.checkCriteria(sneaker));
        assertFalse(lastSale.checkCriteria(sneaker).isEmpty());

        for (Offer offer : lastSale.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(59, offer.value());
            assertEquals("9.5", offer.size());
        }
    }
}
