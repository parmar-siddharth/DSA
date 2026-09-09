package Maths;

class countCommas{
    public static void main(String[] args) {
        int n = 1668;
        System.out.println(count(n));
    }
     public static int count(int n) {
        int count = 0;
        if(n < 1000) return 0;
        else if(n < 1000000){
            count += (n - 1000) + 1;
        }
        else{
            count += (n - 1000000) + 2;
        }
       return count;
    }
}