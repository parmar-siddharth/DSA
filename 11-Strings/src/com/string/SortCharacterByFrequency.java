package com.string;

import java.util.*;

public class SortCharacterByFrequency {
    static void main(String[] args) {
        String s = "tree";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> o1 - o2);

        StringBuilder ans = new StringBuilder();

        for (char c : list){
            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }
        System.out.println(ans.toString());
    }
}
