public class MaximumNoOfVowelsInSubString {
    static void main() {
        String s = "abciiidef";
        System.out.println(maxVowels(s,3));
    }
    static int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int vowelCount = 0;
        int maxVowels = 0;
        while(r < s.length()){
            char ch = s.charAt(r);

            if(isVowel(ch)) vowelCount++;

            if(r - l + 1 == k){
                maxVowels = Math.max(vowelCount,maxVowels);

                if(isVowel(s.charAt(l))) vowelCount--;

                l++;
            }

            r++;
        }
        return maxVowels;
    }

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true ;

        return false;
    }
}
