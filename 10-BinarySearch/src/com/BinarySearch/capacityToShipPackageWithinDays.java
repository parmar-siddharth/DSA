package com.BinarySearch;

public class capacityToShipPackageWithinDays {
    static void main(String[] args) {
        int[] weights = {1,2,3,1,1};
        System.out.println(shipWithinDays(weights,4));
    }
    static int shipWithinDays(int[] weights, int days){
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int weight : weights){
            low = Math.max(low,weight);
            high += weight;
        }
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (canShip(weights,days,mid)){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean canShip(int[] weights,int days,int capacity){
        int daysTaken = 1;
        int sum = 0;
        for (int weight : weights){
            if (sum + weight > capacity){
                daysTaken++;
                sum = weight;
            }
            else {
                sum += weight;
            }
        }
        return daysTaken <= days;
    }

}
