package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    static int[][] merge(int[][] intervals){

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            }
            else {
                list.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new int[]{start,end});

        return list.toArray(new int[list.size()][]);

//        int[][] ans = new int[list.size()][];
//        for (int i = 0; i < list.size(); i++) {
//            ans[i] = list.get(i);
//        }
//        return ans;
    }
}
