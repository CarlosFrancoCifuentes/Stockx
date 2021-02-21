package edu.pingpong.stockx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Asks;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sneaker;

public class AsksTest {

    //@Test
    //public void checkCriteriaTest(){
    //    Criteria asks = new Asks();
    //    List<Offer> listaAsk = new ArrayList<Offer>();
    //
    //    Item sneaker = new Sneaker("Estilo", "Nombre");
    //    sneaker.add(new Ask("13", 288));
    //    sneaker.add(new Bid("6", 200));
    //    sneaker.add(new Bid("9.5", 479));

    //    listaAsk.add(new Ask("13", 288));

    //    asks.checkCriteria(sneaker);

    //    assertEquals(listaAsk, asks.checkCriteria(sneaker));
    //}

    @Test
    public void checkCriteriaTest(){
        Criteria asks = new Asks();

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Ask("13", 288));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));

        asks.checkCriteria(sneaker);

        assertNotNull(asks.checkCriteria(sneaker));

        assertFalse(asks.checkCriteria(sneaker).isEmpty());
    }
}
