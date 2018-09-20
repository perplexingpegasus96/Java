package ru.sberbank.problems.acm;

import java.util.Scanner;

public class problem2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int curr_int;

        if (n == 1){
            curr_int = scanner.nextInt();
            System.out.print(curr_int);
            System.out.print(' ');
            System.out.print(1);
        }
        else{
            int counter = 0;
            int max_counter = 0;
            int max_int = 0;
            int prev_int = -1;

            for (int i = 0; i < n; i++) {
                curr_int = scanner.nextInt();
                if (curr_int == prev_int){
                    counter++;
                    if (counter == max_counter){
                        if (curr_int < max_int){
                            max_int = curr_int;
                        }
                    }
                    if (counter > max_counter){
                        max_counter = counter;
                        max_int = curr_int;
                    }
                }
                else{
                    if (max_counter == 0){
                        max_counter = 1;
                        max_int = curr_int;
                    }
                    counter = 0;
                    counter++;
                }
                prev_int = curr_int;
            }
            System.out.print(max_int);
            System.out.print(' ');
            System.out.print(max_counter);
        }
    }
}
