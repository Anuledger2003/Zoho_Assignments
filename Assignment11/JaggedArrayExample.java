package assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons (N): ");
        int N = scanner.nextInt();

        ArrayList<ArrayList<Integer>> weights = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            weights.add(new ArrayList<>());
        }

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter weight for a person");
            System.out.println("2. Calculate minimum weight of a person");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterWeight(weights, scanner);
                    break;
                case 2:
                    calculateMinWeight(weights, scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    public static void enterWeight(ArrayList<ArrayList<Integer>> weights, Scanner scanner) {
        System.out.print("Enter the person number (0-based index): ");
        int person = scanner.nextInt();

        if (person < 0 || person >= weights.size()) {
            System.out.println("Invalid person number.");
            return;
        }

        System.out.print("Enter the weight: ");
        int weight = scanner.nextInt();

        weights.get(person).add(weight);
        System.out.println("Weight added successfully.");
    }

    public static void calculateMinWeight(ArrayList<ArrayList<Integer>> weights, Scanner scanner) {
        System.out.print("Enter the person number (0-based index): ");
        int person = scanner.nextInt();

        if (person < 0 || person >= weights.size()) {
            System.out.println("Invalid person number.");
            return;
        }

        if (weights.get(person).isEmpty()) {
            System.out.println("No weights recorded for this person.");
            return;
        }

        int minWeight = Integer.MAX_VALUE;
        for (int weight : weights.get(person)) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }

        System.out.println("The minimum weight of person " + person + " is: " + minWeight);
    }
}
