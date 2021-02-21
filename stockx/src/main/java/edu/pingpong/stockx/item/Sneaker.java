package edu.pingpong.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> ofertas = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
		this.style = style;
		this.name = name;
	}

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void setSale(int precioVenta) {
        this.sale = precioVenta;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public void setBid(int precioPagar) {
        this.bid = precioPagar;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public void setAsk(int precioCobrar) {
        this.ask = precioCobrar;
    }

    @Override
    public void add(Offer comparator) {
        this.ofertas.add(comparator);
    }

    @Override
    public List<Offer> offers() {
        return this.ofertas;
    }

    @Override
    public String toString() {
        return "\n\t" + getName() + "\n\t\t" + getStyle();
    }
}