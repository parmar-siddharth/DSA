import java.util.*;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "aacccdddeeeeffffggggg";

        System.out.println(frequencySort(s));
    }
//    static String frequencySort(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(char c : s.toCharArray()){
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//
//        List<Character> list = new ArrayList<>(map.keySet());
//        list.sort((a,b) -> map.get(b) - map.get(a));
//
//        StringBuilder sb = new StringBuilder();
//
//        for(char c : list){
//            for(int i = 0; i < map.get(c); i++){
//                sb.append(c);
//            }
//        }
//
//        return sb.toString();
//    }

    /// optimized
    static String frequencySort(String s){
        int[] freq = new int[128];

        for(char c : s.toCharArray()){
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

        while(sb.length() < s.length()){
            int max = 0;

            for (int i = 1; i < freq.length; i++) {
                if (freq[i] > freq[max]){
                    max = i;
                }
            }

            for (int i = 0; i < freq[max]; i++) {
                sb.append((char) max);
            }

            freq[max] = 0;
        }
        return sb.toString();
    }
}
