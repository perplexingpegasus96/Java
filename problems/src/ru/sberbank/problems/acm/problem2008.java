package ru.sberbank.problems.acm;

import java.util.Scanner;

public class problem2008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int limit = scanner.nextInt();
        int counter = 0;
        int totalSum = 0;
        int newItem;
        for (int i = 0; i < n; i++) {
            newItem = scanner.nextInt();
            if (totalSum + newItem <= limit){
                totalSum += newItem;
                counter++;
            }
        }
        System.out.print(counter);
        System.out.print(" ");
        System.out.print(totalSum);
    }
}
