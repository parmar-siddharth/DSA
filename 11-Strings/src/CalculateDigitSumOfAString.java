public class CalculateDigitSumOfAString {
    static void main(String[] args) {
        String s = "01234567890";
        int k = 100;
        System.out.println(digitSum(s,k));
    }
    static String digitSum(String s, int k) {
        StringBuilder stringBuilder = is(s,k);
        while(stringBuilder.length() > k){
            stringBuilder = is(stringBuilder.toString(),k);
        }
        return stringBuilder.toString();
    }
    static StringBuilder is(String s, int k){
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
            if((i + 1) % k == 0){
                sb.append(sum);
                sum = 0;
            }
        }
        if(sum != 0){
            sb.append(sum);
        }
        return sb;
    }
}
