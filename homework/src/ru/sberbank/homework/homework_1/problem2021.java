package ru.sberbank.homework.homework_1;

import java.util.Scanner;

public class problem2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] a = new int[size];
        int i = 0;
        int max = -1;

        while (i < size) {
            a[i] = scanner.nextInt();
            ++i;
        }

        int first_max = findMax(a, size);
        for (i = 0; i < size; i++) {
            if (a[i] == first_max) {
                a[i] = (int) Math.floor(a[i] / 2.0);
            }
        }

        int second_max = findMax(a, size);
        for (i = 0; i < size; i++) {
            if (a[i] == second_max) {
                System.out.print((int) Math.floor(a[i] / 2.0));
                System.out.print(" ");
            } else {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
    }

    public static int findMax(int[] array, int arrayLenght) {
        int max = -1;
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
