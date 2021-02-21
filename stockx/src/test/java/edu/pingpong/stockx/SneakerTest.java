package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Sneaker;

public class SneakerTest {
    
    @Test
    public void toStringTest(){
        Sneaker sneaker = new Sneaker("Estilo", "Nombre");
        assertEquals("Nombre Estilo", sneaker.toString());
    }
}
