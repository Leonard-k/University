package Prog1.Chapter4;

import Prog1.UniUtils;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {

        int n = 1000000000;
        int d, i;
        int c = (int) Math.sqrt(n) + 1;

        // declare bool array
        boolean[] primes = new boolean[n + 1];

        // set all values to true
        for (i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        // go over all numbers from 2 to c
        for (int k = 2; k < c; k++) {

            // if its a multiple of a previous number all its multiples are already false
            // so only do the next step if k ist not already false aka a prime number
            if (primes[k]) {

                // set all multiples of k to false
                for (d = k * 2; d <= n; d = d + k) {
                    primes[d] = false;
                }
            }
        }

        //todo tmp
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("C:\\Users\\leona\\Desktop\\primes.txt"), "utf-8"))) {

            //print out all the prime numbers
            for (i = 2; i <= n; i++) {
                if (primes[i]) {
                    writer.write(i + " ");
                    //System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        UniUtils.printAuthor();
    }
}
