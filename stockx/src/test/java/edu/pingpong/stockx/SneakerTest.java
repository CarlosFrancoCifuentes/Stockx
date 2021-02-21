package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Sneaker;

public class SneakerTest {
    
    @Test
    public void toStringTest(){
        Sneaker sneaker = new Sneaker("Estilo", "Nombre");
        assertEquals("\n\t"+ "Nombre" +"\n\t\t"+ "Estilo", sneaker.toString());
    }

    @Test
    public void addTest(){
        Sneaker sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("firstSize", 200));
        sneaker.add(new Bid("secondSize", 100));
        assertEquals(2, sneaker.offers().size());
    }
}
