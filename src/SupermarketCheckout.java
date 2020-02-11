package com.Pedro.CodingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SupermarketCheckout {

    /**
     * Finds the total amount of items selected withing a checkout
     * @param items - a collections of items represented by a string
     * @return total price of the items selected
     */
    public static int findPriceItem(String items) {
        char[] itemArr = items.toCharArray();
        int counterA = 0, counterB = 0;
        int total = 0;
        int discount;
       for (char item : itemArr) {
            switch (item) {
                case 'A':
                    counterA++;
                    discount = 20;
                    total += 50;
                    if (counterA  == 3) {
                        total -= discount;
                        counterA = 0;
                    }
                    break;

                case 'B':
                    counterB++;
                    discount = 23;
                    total += 30;
                    if (counterB == 2) {
                        total -= discount;
                        counterB = 0;
                    }
                    break;

                case 'C':
                    total += 20;
                    break;
                case 'D':
                    total += 10;
                    default: break;

            }

         }
        return total;
    }


    public static int priceDiscounted(int total, int price,  int discount, int counter) {

        total += price;
        if (counter  == 3) {
            total -= discount;
            counter = 0;
        }
        return total;
    }
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = bf.readLine();
            int total = findPriceItem(name);
            System.out.println("The total value is: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
