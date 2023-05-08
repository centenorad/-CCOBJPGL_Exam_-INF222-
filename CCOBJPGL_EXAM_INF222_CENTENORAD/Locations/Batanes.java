package Locations;

import Tourist.Tourist;


public class Batanes implements Locations {

    int airFare = 500;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}