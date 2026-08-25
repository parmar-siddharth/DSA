package com.BinarySearch;

public class NthRootOfaNumber {
    static void main(String[] args) {
        System.out.println(NthRoot(2,100));
    }
    static int NthRoot(int N,int M){
        int low = 1;
        int high = M;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(val(N,mid,M) == M) return mid;
            if(val(N,mid,M) < M) low = mid + 1;
            else high = mid - 1;
        }
        return -1; // if not a perfect root then return -1;
    }
    static int val(int N,int mid,int M){
        int val = 1;
        for (int i = 1; i <= N; i++) {
            val *= mid;
            // if val is more than M then obviously it is not Nth root so , simply just return M+1;
            if (val > M) return M+1; // so high = mid - 1;
        }
        return val;
    }
}
