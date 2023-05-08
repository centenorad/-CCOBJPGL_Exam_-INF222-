package Tourist;
import Locations.*;
public class CENTENO implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        // Define your visit
        int airFare = 100;
        System.out.println("Boracay fare is "+""+airFare);
        if (budget > airFare) {
            budget = budget - airFare;
            System.out.println("......Visiting Boracay");
            checkBudget();
        } else {
            System.out.println(" Not enough budget to visit Boracay");
        }
    }
        public void visit(Batanes batanes) {
    
            // Define your visit
            int airFare = 500;
            System.out.println("Batanes fare is "+""+airFare);
            if (budget > airFare) {
                budget = budget - airFare;
                System.out.println("......Visiting Batanes");
                checkBudget();
            } else {
                System.out.println(" Not enough budget to visit Batanes");
            }
        }
            public void visit(Cebu cebu) {
        
                // Define your visit
                int airFare = 200;
                System.out.println("Cebu fare is "+""+airFare);
                if (budget > airFare) {
                    budget = budget - airFare;
                    System.out.println("......Visiting Cebu");
                    checkBudget();
                } else {
                    System.out.println(" Not enough budget to visit Cebu");
                }
            }
                public void visit(Palawan palawan) {
            
                    // Define your visit
                    int airFare = 300;
                    System.out.println("Palawan fare is "+""+airFare);
                    if (budget > airFare) {
                        budget = budget - airFare;
                        System.out.println("......Visiting Palawan");
                        checkBudget();
                    } else {
                        System.out.println(" Not enough budget to visit Palawan");
                    }
                }
                    public void visit(Siargao siargao) {
                
                        // Define your visit
                        int airFare = 600;
                        System.out.println("Siargao fare is "+""+airFare);
                        if (budget > airFare) {
                            budget = budget - airFare;
                            System.out.println("......Visiting Siargao");
                            checkBudget();
                        } else {
                            System.out.println(" Not enough budget to visit Siargao");
            }
    }

                     public void checkBudget() {
                        System.out.println("My budget is " + budget);
    }

}