package com.BinarySearch;

public class capacityToShipPackageWithinDays {
    static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(canShip(weights,5,14));
    }
    static int canShip(int[] weights,int days,int capacity){
        int daysTaken = 1;
        int sum = 0;
        for(int weight : weights){
            if (sum + weight > capacity){
                daysTaken++;
                sum = weight;
            }
            else {
                sum += weight;
            }
        }
        return daysTaken;
    }
}
