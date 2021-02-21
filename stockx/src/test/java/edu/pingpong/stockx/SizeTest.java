package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Size;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sneaker;

public class SizeTest {
    
    @Test
    public void checkCriteriaTest(){
        Size size = new Size("9.5");

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("13", 288));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 59));

        size.checkCriteria(sneaker);

        assertNotNull(size.checkCriteria(sneaker));
        assertFalse(size.checkCriteria(sneaker).isEmpty());

        for (Offer offer : size.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertEquals(59, offer.value());
            assertEquals("9.5", offer.size());
        }
    }
}
