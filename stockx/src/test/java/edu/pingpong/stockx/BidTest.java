package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Bid;

public class BidTest {

    @Test
    public void toStringTest(){
        Bid bid = new Bid("Size", 200);
        assertEquals("\n\t\t"+ "Size" +"\t\t"+ "200", bid.toString());
    }
}
