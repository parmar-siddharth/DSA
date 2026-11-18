public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    static void main(String[] args) {
        String s = "10010101";
        System.out.println(minChanges(s));
    }
    // in ques it is given that string will be of even length and every substring hould be of eben length.
    // so simply we can take 2 character at a time and check if they are same or not
    // if not then increase total changes by 1.
    static int minChanges(String s) {
        int changes = 0;
        for(int i = 0; i < s.length(); i += 2){
            if(s.charAt(i) != s.charAt(i + 1)){
                changes++;
            }
        }
        return changes;
    }
}
