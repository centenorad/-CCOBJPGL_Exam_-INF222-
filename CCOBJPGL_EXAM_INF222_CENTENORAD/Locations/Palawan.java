package Locations;
import Tourist.Tourist;

    public class Palawan implements Locations {

        int airFare = 300;
    
        @Override
        public void accept(Tourist tourist) {
            tourist.visit(this);
        }
    }

