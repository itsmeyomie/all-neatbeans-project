/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search;

/**
 *
 * @author devyo
 */
public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        return binarySearch(arr, key, low, high);
    }

    private static int binarySearch(int arr[], int key, int low, int high) {

        if (low > high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;

        if (key < arr[mid]) {

            return binarySearch(arr, key, low, mid - 1);

        } else if (key == arr[mid]) {
            return mid;

        } else {
            return binarySearch(arr, key, mid + 1, high);

        }

    }

    public static void main(String[] args) {
        int arr[] = {11, 12,14,15};

        int key = 12;

        System.out.println(binarySearch(arr, key));
    }

}
