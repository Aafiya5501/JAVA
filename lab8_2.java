import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        int sum = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                handleNumber(num);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + arg);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ": " + arg);
            }
        }

        System.out.println("Total sum of valid numbers: " + sum);
    }

    public static void handleNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        if (num % 10 == 0) {
            throw new IllegalArgumentException("Numbers evenly divisible by 10 are not allowed");
        }
        if (num > 1000 && num < 2000) {
            throw new IllegalArgumentException("Numbers between 1000 and 2000 are not allowed");
        }
        if (num > 7000) {
            throw new Illeg
