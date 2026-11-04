public class CountNumberOfSubStrings {
    static void main(String[] args) {
        String s = "aabb";
        System.out.println(countSubstrings(s));
    }
    static long countSubstrings(String s) {

        int[] freq = new int[26];

        long count = 0;

        int odds = 0;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            freq[index]++;

            if (freq[index] % 2 != 0) {
                odds++;
            } else {
                odds--;
            }

            if (odds <= 1) {
                count += i + 1;
            }
        }

        return count;
    }
}
