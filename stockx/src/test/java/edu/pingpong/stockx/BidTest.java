package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Bid;

public class BidTest {

    @Test
    public void toStringTest(){
        Bid sneaker = new Bid("Estilo", 200);
        assertEquals("Estilo 200", sneaker.toString());
    }
}
