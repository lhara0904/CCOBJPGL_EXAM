package Tourists;

import Locations.Baguio;
import Locations.Locations;
import Locations.Baler;
import Locations.Launion;
import Locations.Palawan;
import Locations.Pampanga;
import Locations.Rizal;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Baguio baguio);

    void visit(Baler baler);

    void visit(Launion launion);

    void visit(Palawan palawan);

    void visit(Pampanga pampanga);

    void visit(Rizal rizal);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}