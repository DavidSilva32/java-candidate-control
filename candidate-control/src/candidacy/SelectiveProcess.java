package candidacy;

public class SelectiveProcess {
    public static void main(String[] args) {
        System.out.println("Selective Process");
        parseCandidate(1900.0);
        parseCandidate(2200.0);
        parseCandidate(2000.0);
    }

    public static void parseCandidate(double targetSalary) {
        double baseSalary = 2000.0;

        if (baseSalary > targetSalary) {
            System.out.println("Call cadidate");
        } else if (baseSalary == targetSalary) {
            System.out.println("Call the candidate with counter offer");
        } else {
            System.out.println("Awaiting the results of the other candidates");
            
        }
    }
}