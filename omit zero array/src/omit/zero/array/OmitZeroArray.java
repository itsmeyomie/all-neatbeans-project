/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omit.zero.array;

import java.util.Arrays;
import static omit.zero.array.OmitZeroArray.outZero;

/**
 *
 * @author devyo
 */
public class OmitZeroArray {
 static int [] outZero(int array[]){
    // size to be stored here
    int num=0;
 // stores the exact number of zeros
    int count=0;
 // size of the array before omiting zeros
    int size=array.length;
 //first loop to count and store zero in count var
 for (int i = 0, j = 0; i < array.length; i++){
   if(array[i]==0)
   count++;
   }  
 // finding the new  size of the array and storing it to num
   num=size-count; 
   
   
 //using the new size in the newly created array
 int arr[] = new int[num];
 
 //create new arrays without zeros
for (int i = 0, j = 0; i < array.length; i++) {
if (array[i] != 0) {
arr[j] =array[i];
j++;
}
}
// finaly returning an array
return arr;
    }
    public static void main(String[] args) {
     int array[]={0,1,2,3,4,0,0,7,0,0,5,9,0,5,0,3};
     
     
     System.out.println(Arrays.toString(outZero(array)));
    }
    
}