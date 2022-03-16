/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author devyo
 */
public class Testing {

    public static String printNumbersInArray(String x, int index) {
        System.out.println(x.charAt(index));
        if (index == 0) { // 
            return x;
        }
        return printNumbersInArray(x, index - 1);
    }

    public static int[] numFrequency(int[] arr) {
        int maxValue = 0;
        int maxKey = 0;
// key->actual numbers and value-> frequency
        HashMap<Integer, Integer> hash2 = new HashMap<>();
        int[] array = new int[2];
        for (int i = 0; i < arr.length; i++) {
//check the current values in the map
            int key = arr[i];
//check if map contains arr[i] (key)
            if (hash2.containsKey(key)) {
//increase the frequency, if true
                int value = hash2.get(key) + 1;
//check if value (frequency) > maxValue (largest frequency)
                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }
//check if map contains frequency already
                if (hash2.containsValue(maxValue)) {
//check if frequency is equal to largest frequency
                    if (value == maxValue) {
                        maxValue = 0;
                        maxKey = 0;
                    }
                }
//put numbers and their frequencies as keys and values respectively in hashmap
                hash2.put(key, value);
            } else {
                hash2.put(key, 1);

            }
            if (arr.length == 1) {
                maxValue = 1;
                maxKey = key;
            }

        }

        array[0] = maxKey;
        array[1] = maxValue;

        return array;
    }

    public static int[] doubleArray(int[] array) {
        int size = array.length;
//double the size of the array
        int newSize = size * 2;
//create new array with double the size
        int[] newArray = new int[newSize];

//divide the newArray into 2 halves
        for (int i = 0, j = size; i < size; i++, j++) {
            newArray[i] = array[i];
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static int occurence(int arr[]) {
        int maxKey = 0;
        int maxValue = 0;
        int previousMaximum = 0;
        HashMap<Integer, Integer> ocMap = new HashMap<>();

        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int value = 0;

            if (ocMap.containsKey(key)) {
                value = ocMap.get(key) + 1;

                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }

                if (previousMaximum == maxValue) {
                    maxKey = 0;
                }

            } else {
                value = 1;
            }
            previousMaximum = maxValue;
            ocMap.put(key, value);
        }

        return maxKey;
    }

    public static int[] duplicateArray(int[] originalArr, int times) {

        int newArr[] = new int[originalArr.length * times];
        int counter = 0;
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (j == originalArr.length) {
                j = 0;
                counter = counter + 1;
            }
            if (counter == times) {
                break;
            }

            if (j < originalArr.length) {
                newArr[i] = originalArr[j];
                j++;
            }

        }

        return newArr;

    }

    public static int[] duplicateArrays(int[] originalArr, int times) {
        return duplicateArrayRecursively(originalArr, originalArr, times);
    }

    private static int[] duplicateArrayRecursively(int[] newArr, int[] originalArr, int times) {
        if (times == 0) {
            return newArr;
        }
        return duplicateArrayRecursively(arrayConcat(newArr, originalArr), originalArr, times - 1);
    }

    private static int[] arrayConcat(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {

            newArray[i] = array1[j];
        }

        for (int k = 0, l = array1.length; k < array2.length; k++, l++) {
            newArray[l] = array2[k];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4,4};
        String name = "mini ";
        printNumbersInArray(name, name.length() - 1);

        System.out.println(Arrays.toString(doubleArray(num)));
        System.out.println(Arrays.toString(numFrequency(num)));
        System.out.println(Arrays.toString(duplicateArray(num, 4)));

    }

}
