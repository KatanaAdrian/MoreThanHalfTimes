/*
Given an array of N natural numbers, find the number that appears more than N/2 times.
I chose to implement this problem using characteristic vector.
After reading the number of elements and each element, I found the maximum number from the array
 in order to know how much memory the characteristic vector needs.
For each "x" element from the array, on the position "x" in the characteristic vector the current value increments by 1.
Because there is only one element that can appear more than n/2 times, when found an element from the characteristic vector with a value
bigger that n/2 the element is displayed and the for instruction stops.
If no number appears more than half times a message is displayed.

input data: length of the array: 8
            array's values: 7, 7, 12, 3, 10, 7, 7, 7
output data: The number that appears more than half times in the array is : 7
*/

import java.util.Scanner;

/**
 * Finds the number that appears more than half times in the array
 * @author Adi Katana
 */
public class Main {
    public static void main(String[] args) {

        int max = 0; // array's max
        System.out.print(" Type the length of the array: ");

        Scanner number = new Scanner(System.in);
        int n = number.nextInt(); //n- number of elements
        int[] a = new int[n];

        System.out.print(" Type the array's values: ");
        for (int i = 0; i < n; i++) {

            Scanner array = new Scanner(System.in);
            a[i] = array.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }

        int[] v = new int[max + 1];

        //initialization of the characteristic vector
        for (int i = 0; i <= max; i++) {
            v[i] = 0;

        }

        boolean k=false; //true if a number appears more than n/2 times, false otherwise.
        for (int i = 0; i < n; i++) {
            v[a[i]]++;

            if (v[a[i]] > n / 2) {
                System.out.println("The number that appears more than half times in the array is : " + a[i]);
                k=true;
                break;
            }
        }
        if(!k) {
            System.out.println("There is no number that appears more than half times.");
        }
    }
}