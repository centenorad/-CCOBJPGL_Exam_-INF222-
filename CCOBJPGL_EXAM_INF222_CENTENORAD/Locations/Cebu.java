package Locations;
import Tourist.Tourist;

public class Cebu implements Locations {

    int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}