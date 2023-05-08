package Tourist;
import Locations.Locations;
import Locations.Batanes;
import Locations.Boracay;
import Locations.Palawan;
import Locations.Cebu;
import Locations.Siargao;

public interface Tourist {

    int budget = 1000;
    void visit();
    void visit(Boracay boracay);
    void visit(Batanes batanes);
    void visit(Cebu cebu);
    void visit(Palawan palawan);
    void visit(Siargao siargao);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}