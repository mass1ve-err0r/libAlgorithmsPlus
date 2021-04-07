/*
 * Project: libAlgorithmsPlus
 * Author:  Saadat M. Baig
 * Date:    07.04.21
 * License: BSD-3-Clause-Attribution
 */
package de.saadatbaig.libAlgorithmsPlus;


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

        /* End */
    }


    /* End */
}