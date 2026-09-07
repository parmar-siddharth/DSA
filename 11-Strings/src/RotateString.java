public class RotateString {
    public static void main(String[] args) {
       String s = "dawhwh";
       String goal = "hdawhw";
        System.out.println(rotateString(s,goal));
    }
    static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            if(sb.toString().equals(goal)) return true;
            rotate(sb);
        }

        return false;
    }
    static void rotate(StringBuilder sb){
        char temp = sb.charAt(0);

        for(int i = 1; i < sb.length(); i++){
            sb.setCharAt(i-1,sb.charAt(i));
        }
        sb.setCharAt(sb.length() - 1,temp);
    }

    /// optmized code
//        static boolean rotateString(String s, String goal) {
//            if(s.length() != goal.length()) return false;
//            String str = s + s;
//            return str.contains(goal);
//        }

}
