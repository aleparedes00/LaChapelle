package org.lachapelle.lachapelle.model;

/**
 * Created by alejandraparedes on 3/25/18.
 */

public class Grocery {
    private String name;
    private Boolean toBuy = false;

    public Grocery(String name, Boolean toBuy) {
        this.name = name;
        this.toBuy = toBuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getToBuy() {
        return toBuy;
    }

    public void setToBuy(Boolean toBuy) {
        this.toBuy = toBuy;
    }
}
