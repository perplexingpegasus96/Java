package ru.sberbank.problems.acm;

import java.util.Scanner;
import java.lang.*;

public class problem2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sum += Math.abs(scanner.nextInt());
            else
                sum += Math.abs(scanner.nextInt()) * (-1);
        }
        System.out.println(sum);
    }
}
