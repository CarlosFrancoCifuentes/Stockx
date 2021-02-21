package edu.pingpong.stockx.item;

public class Bid implements Offer{

    private String size;
    private Integer bid;

    public Bid(String size, Integer bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.bid;
    }

    @Override
    public int compareTo(Offer comparator){
        return this.bid.compareTo(comparator.value());
    }

    @Override
    public String toString() {
        return String.format("%s %d", size(), value());
    }
}
