package edu.pingpong.stockx.item;

public class Ask implements Offer{

    private String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.ask;
    }

    @Override
    public int compareTo(Offer comparador) {
        return ask.compareTo(comparador.value());
    }

    @Override
    public String toString() {
        return String.format("%s %d", size(), value());
    }
}
