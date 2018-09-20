package ru.sberbank.problems.acm;

import java.util.Scanner;

public class problem2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] a = new int[size];
        int i = 0;
        int counter = 0;

        while (i < size) {
            a[i] = scanner.nextInt();
            ++i;
        }

        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                if ((j != k) && (a[k] % a[j] == 0)) {
                    counter++;
                }
            }
        }

        System.out.println(counter);

    }
}
