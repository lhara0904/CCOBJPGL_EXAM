package Tourists;

import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Baguio baguio) {
        System.out.println("ang budget ko ay " + getBudget());

        if (budget > baguio.airFare) {
            System.out.println("TRIP TO BAGUIO");
            budget -= baguio.airFare;

        } else {
            System.out.println("PURDOY WALANG PERA");
        }

        checkBudget();

    }

    public void visit(Baler baler) {

        if (budget > baler.airFare) {
            System.out.println("TRIP TO BALER");
            budget -= baler.airFare;
        } else {
            System.out.println("WALANG PERA");
        }

        checkBudget();
    }

    public void visit(Launion launion) {
        if (budget > launion.airFare) {
            System.out.println("TRIP TO LAUNION");
            budget -= launion.airFare;
        } else {
            System.out.println("WALANG PERA");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (budget > palawan.airFare) {
            System.out.println("TRIP TO PALAWAN");
            budget -= palawan.airFare;
        } else {
            System.out.println("WALANG PERA");
        }

        checkBudget();
    }

    public void visit(Pampanga pampanga) {
        if (budget > pampanga.airFare) {
            System.out.println("TRIP TO PAMPANGA");
            budget -= pampanga.airFare;
        } else {
            System.out.println("WALANG PERA");
        }

        checkBudget();
    }

    public void visit(Rizal rizal) {
        if (budget > rizal.airFare) {
            System.out.println("TRIP TO RIZAL");
            budget -= rizal.airFare;
        } else {
            System.out.println("WALANG PERA");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }

}