public class PrintNameNTImes {
    public static void main(String[] args) {
        printName(5);
    }
    static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Siddharth");
        printName(n-1);
    }
}

