package com.LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{4,5,8},{8,7,3},{4,9,7}};
        System.out.println(maxWealth(arr));

    }
    static int maxWealth(int[][] accounts){
        int maximumWealth = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            int totalWealth = 0;
            for (int Banks = 0; Banks < accounts[customer].length; Banks++) {
                totalWealth = totalWealth + accounts[customer][Banks];
            }
            if (totalWealth > maximumWealth){
                maximumWealth = totalWealth;
            }
        }
        return maximumWealth;
    }
}
