package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static long[] lcg(long firstNumber) {
        long nextNumber;
        final long a = 1103515245;
        final long c = 12345;
        final long m = (long)Math.pow((double)2, (double)31);
        long numbers[] = new long[10];
        for (int i = 0; i < 10; i++) {
            nextNumber = (a * firstNumber + c) % m;
            firstNumber = nextNumber;
            numbers[i] = firstNumber;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        randomNumberBetweenOneAndHundred();
        int a = 1;
        int b;
        while (a <= 10) {
            System.out.print("Guess number " + a + ": ");
            b = scanner.nextInt();
            if(a == 10)
                break;
            if (b < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");

            } else if (b > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else {
                System.out.println("You won wisenheimer!");
                return;
            }
            a = a + 1;
        }
        System.out.println("You lost! Have you ever heard of divide & conquer?");

    }
    public static int randomNumberBetweenOneAndHundred() {
        Random rand = new Random();
        return rand.nextInt(100) + 1; // pentru ca este exkl., merge de la 0 la 99de aceea +1
    }


    public static boolean swapArrays(int arrayy1[], int array2[]) {
        int length1 = arrayy1.length; // dimensiunea array
        int length2 = array2.length;

        if (length1 != length2)
            return false;

        int aux[] = new int[length1];
        for(int a = 0; a < length1; a++) {
            aux[a] = arrayy1[a]; // 1
            arrayy1[a] = array2[a]; // 2 e salvat in 1
            array2[a] = aux[a]; // 1 e salvat in 2
        }
        return true;
    }

    //Task 6
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {9, 8, 7, 6, 0};
        swapArrays(array, array1);

    }
}