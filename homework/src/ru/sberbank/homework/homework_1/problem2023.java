package ru.sberbank.homework.homework_1;

import java.util.Scanner;

public class problem2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int j = 0;

        int sizeA = scanner.nextInt();
        int[] a = new int[sizeA];
        while (i < sizeA) {
            a[i] = scanner.nextInt();
            ++i;
        }

        int sizeB = scanner.nextInt();
        int[] b = new int[sizeB];
        while (j < sizeB) {
            b[j] = scanner.nextInt();
            ++j;
        }

        int counter = 0;
        int[] newArray = new int[sizeA];
        for (i = 0; i < sizeA; i++) {
            if (contains(b, a[i])) {
                newArray[counter] = a[i];
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println(counter);
        } else {
            System.out.println(counter);
            for (i = 0; i < counter; i++) {
                System.out.print(newArray[i]);
                System.out.print(" ");
            }
        }
    }
    public static boolean contains ( final int[] array, final int v){
        boolean result = false;
        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }
}



