/*
 * Project: libAlgorithmsPlus
 * Author:  Saadat M. Baig
 * Date:    07.04.21
 * License: BSD-3-Clause-Attribution
 */
package de.saadatbaig.libAlgorithmsPlus;


public class Calculate {

    public static class Arrays {

        /**
         * <pre>
         *     Complexity: O(n)
         * </pre>
         * Generate a new array where the index in the output is built of the product of the input except the index's own value.
         * @param inputArray Array to process.
         * @return New array of products.
         */
        public static int[] productOfArrayExceptSelf(int[] inputArray) {
            int inputArraySize = inputArray.length;
            int[] outputArray = new int[inputArraySize];

            outputArray[0] = 1;
            for (int i = 1; i < inputArraySize; i++) {
                outputArray[i] = inputArray[i-1] * outputArray[i-1];
            }

            int rightProducts = 1;
            for (int i = inputArraySize-1; i >= 0; i--) {
                outputArray[i] = outputArray[i] * rightProducts;
                rightProducts *= inputArray[i];
            }

            return outputArray;
        }

        /* End */
    }


    /* End */
}