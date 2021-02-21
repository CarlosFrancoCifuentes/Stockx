package edu.pingpong.stockx.item;

import java.util.List;

public interface Item {
    public int getBid();
    public int getAsk();
    public int getSale();
    public void add(Offer comparator);
    public List<Offer> offers();
    public void setBid(int precioPagar);
    public void setAsk(int precioCobrar);
    public void setSale(int precioVenta);
}
