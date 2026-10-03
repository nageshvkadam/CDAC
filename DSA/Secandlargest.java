package DSA;

public class Secandlargest {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second Largest Number: " + secondLargest);
    }
}
