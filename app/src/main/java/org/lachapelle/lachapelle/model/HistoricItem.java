package org.lachapelle.lachapelle.model;

/**
 * Created by alejandraparedes on 3/25/18.
 */

public class HistoricItem {
    private String buyer;
    private Grocery groceryBought;
    private Double price;
    private Long timestamp;
    private String description;

    public HistoricItem(String buyer, Grocery groceryBought, Double price, Long timestamp, String description) {
        this.buyer = buyer;
        this.groceryBought = groceryBought;
        this.price = price;
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Grocery getGroceryBought() {
        return groceryBought;
    }

    public void setGroceryBought(Grocery groceryBought) {
        this.groceryBought = groceryBought;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
