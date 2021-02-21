package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Sale;

public class SaleTest {
    
    @Test
    public void toStringTest(){
        Sale sneaker = new Sale("Estilo", 200);
        assertEquals("200 Estilo", sneaker.toString());
    }
}
