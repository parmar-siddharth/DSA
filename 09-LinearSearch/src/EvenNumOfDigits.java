package com.LinearSearch;

// Leetcode Q.no : 1295
public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {545,86,8794,1425,6,87,903,7545};
        System.out.println(findNumbers(arr));
    }

    //approach 1:
    // creating functions for counting digits
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i : nums){
            if (countDigits(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int countDigits(int i){
        int cnt = 0;
        while (i > 0){
            i /= 10;
            cnt++;
        }
        return cnt;
    }



    // approach 2:
    // using string conversion:
    // converting items of array into string and then using .length() to find out length
//    static int findNumbers(int[] arr){
//        int count = 0;
//        for (int nums : arr){
//            String str = Integer.toString(nums);
//            if (str.length() % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }


    //approach 2:
//    static int findNumbers(int[] arr){
//        int count = 0;
//        for (int n : arr){
//            int c = 0;
//            while (n > 0){
//                n /= 10;
//                c++;
//            }
//            if (c % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }


    // approach 4:
    // for counting digits of any number we have a formula: Math.log10(number) + 1;
    // for converting the decimal value into integer we will use (int)
    // so final formula (int)(Math.log10(number) + 1)
//    static int findNumbers(int[] nums){
//        int count = 0;
//        for (int i : nums){
//            int digits = (int)(Math.log10(i) + 1);
//            if (digits % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }
}
