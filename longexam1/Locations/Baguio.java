package Locations;

import Tourists.Tourist;

public class Baguio implements Locations {

    public int airFare = 300;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}