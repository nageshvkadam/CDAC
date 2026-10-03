package DSA;

public class Min {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 30};

        int minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("Minimum Number: " + minNumber);
    }
}
