public class Counter {
    public static void main(String[] args) {
        try {
            count(1, 6);
        } catch (InvalidsParamsException e) {
            System.out.println("Ok");
        }
    }

    public static void count(int firstParam, int secondParam) throws InvalidsParamsException {
        if (firstParam > secondParam) {
            throw new InvalidsParamsException();
        }

        System.out.println("Counting...");
        for (int index = firstParam; index <= secondParam; index++) {
            System.out.println(index);
        }
        System.out.println("Finished!");
    }
}
