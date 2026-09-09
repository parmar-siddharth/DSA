package Maths;

public class countCommasII {
    public static void main(String[] args) {
        long n = 100000L;
        System.out.println(countCommas(n));

    }
    public static long countCommas(long n) {
        long count = 0;
        if (n < 1000){
            return 0;
        }

        if (n < 1_000_000){
            count += (n - 1000) + 1;
            return count;
        }

        count += (999_999 - 1000) + 1;

        if(n < 1_000_000_000){
            count += (n - 1_000_000 + 1) * 2;
            return count;
        }

        count += (999_999_999 - 1_000_000 + 1) * 2;

        if(n < 1_000_000_000_000L){
            count += (n - 1_000_000_000L + 1) * 3;
            return count;
        }

        count += (999_999_999_999L - 1_000_000_000L + 1) * 3;
        
        if (n < 1_000_000_000_000_000L) {
            count += (n - 1_000_000_000_000L + 1) * 4;
            return count;
        }

        count += (999_999_999_999_999L - 1_000_000_000_000L + 1) * 4;

        count += (n - 1_000_000_000_000_000L + 1) * 5; 

        return count;
    }
}
