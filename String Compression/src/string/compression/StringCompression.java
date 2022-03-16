/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.compression;

public class StringCompression {

    public static StringBuilder stringCompression(String string) {

        int count = 1;
        int length = string.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {

            if (i == length - 1) {
                sb.append(string.charAt(i)).append("").append(count);
                break;
            }
            if (string.charAt(i) == string.charAt(i + 1)) {
                count++;
            } else {
                sb.append(string.charAt(i)).append("").append(count);
                count = 1;
            }
        }
        return sb;
    }

    public static StringBuilder stringCompression2(String string, int i) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        if (string.charAt(i) == string.charAt(i+1)) {
            count++;
        } else {
            sb.append(string.charAt(i)).append("").append(count);
            count = 1;
        }
        if (i==string.length()-1) {
            
            sb.append(string.charAt(i)).append("").append(count);
            return sb;
           
        } else {

            return stringCompression2(string, (i+1));
        }
        
    }
public static String compressor(String raw) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        int length = raw.length();
        int j = 0;
        while (counter < length) {
            j = 0;
            while (counter + j < length && raw.charAt(counter + j) == raw.charAt(counter)) {
                j++;
            }

            if (j > 1) {
                builder.append(j);
            }
            builder.append(raw.charAt(counter));
            counter += j;
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        String string = "SSSSSSSTTTTTSTSST";

        System.out.println(stringCompression(string));
//        System.out.println(stringCompression2(string, 0));
        System.out.println(compressor(string));

    }
    
}
