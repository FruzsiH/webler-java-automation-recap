package hu.webler.recap;

import java.util.Scanner;

public class OddOrEven01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;



        while (playAgain) {
            System.out.println("Kérlek adj meg még egy számot: ");
            int number = scanner.nextInt();
            if(number % 2 == 0) {
                playAgain = true;
            } else {
                System.out.println("Ez a szám páratlan, a játéknak vége!");
                playAgain = false;
            }
        }
    }
}
