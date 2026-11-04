import java.util.Arrays;

public class StringSplitMethod {
    static void main(String[] args) {
        //split() divides string into smaller Strings based on specified pattern;
        // String[] arr = str.split("regex");

        // split by space
        String str1 = "Java Python C++";
        String[] arr = str1.split("\\s");
        System.out.println(Arrays.toString(arr));

        // split by comma
        String str2 = "Java,Spring,AI";
        String[] arr2 = str2.split(",");
        System.out.println(Arrays.toString(arr2));

        // split by hypen
        String str3 = "Java-Spring-Boot";
        String[] arr3 = str3.split("-");
        System.out.println(Arrays.toString(arr3));

        // split by multiple spaces
        String str4 = "Java   Spring    Boot";
        String[] arr4 = str4.split("\\s+");
        System.out.println(Arrays.toString(arr4));

        // split by digit occurs
        String str5 = "Java123Spring456Boot";
        String[] arr5 = str5.split("\\d+");
        System.out.println(Arrays.toString(arr5));

        /// Character classes : Square brackets allow you to specify multiple characters or character ranges.
        String str6 = "Java123Spring456Boot";
        String[] arr6 = str5.split("[0-9]+");
        System.out.println(Arrays.toString(arr6));
        /*
        Character ranges
        Regex	     Matches
        [a-z]	     Lowercase alphabets
        [A-Z]	     Uppercase alphabets
        [0-9]	     Digits
        [a-zA-Z]	 All English alphabets
        [a-zA-Z0-9]	 All letters and digits
         */
        String str7 = "Java123Spring456Boot";
        String[] arr7 = str5.split("[a-zA-Z]+");
        System.out.println(Arrays.toString(arr7));

        // negation ^ // except this remove all
        String str8 = "Java123Spring456Boot";
        String[] arr8 = str8.split("[^0-9]+");
        System.out.println(Arrays.toString(arr8));
    }
}
