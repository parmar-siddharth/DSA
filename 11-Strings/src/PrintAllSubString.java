public class PrintAllSubString {
    static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++){
                System.out.println(s.substring(j,n));
            }
        }
        /*
            abc
            bc
            c
            bc
            c
            c
         */
    }
}
