package edu.iu.habahram.pizzashop.model;

public record OrderData(String store, String item) {
    public OrderData(String store, String item) {
        this.store = store;
        this.item = item;
    }
}
