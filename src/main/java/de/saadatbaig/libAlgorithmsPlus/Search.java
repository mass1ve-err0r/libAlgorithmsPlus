/*
 * Project: libAlgorithmsPlus
 * Author:  Saadat M. Baig
 * Date:    07.04.21
 * License: BSD-3-Clause-Attribution
 */
package de.saadatbaig.libAlgorithmsPlus;

import java.util.HashSet;


public class Search {

    public static class Arrays {

        /**
         * <pre>
         *     Complexity: O(n)
         * </pre>
         * Find the first duplicate number inside the array if the following constraint is true:<br>
         *     Values span from 1 <= N where N is the length of the array.
         * @param inputArray Array to process.
         * @return First duplicate number or -1 if not found.
         */
        public static int firstDuplicateInArrayNumeric(int[] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                if(inputArray[Math.abs(inputArray[i]) -1] < 0) {
                    return Math.abs(inputArray[i]);
                } else {
                    inputArray[Math.abs(inputArray[i]) -1] = -inputArray[Math.abs(inputArray[i]) -1];
                }
            }

            return -1;
        }

        /**
         * <pre>
         *     Complexity: O(n+m) -> max(O(n) + O(m))
         * </pre>
         * Check if a pair of values exists within inputArray1 and inputArray2 so the targetValue can be calculated.
         * @param inputArray1 First source.
         * @param inputArray2 Second source.
         * @param targetValue Value to find pair for.
         * @return true if a pair exists, else false.
         */
        public static boolean doesSumExist(int[] inputArray1, int[] inputArray2, int targetValue) {
            HashSet<Integer> complements = new HashSet<>();

            for (int i : inputArray1) {
                complements.add((targetValue - i));
            }
            for (int i : inputArray2) {
                if (complements.contains(i)) { return true; }
            }

            return false;
        }

        /* End */
    }


    /* End */
}