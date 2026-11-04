import java.util.Arrays;
import java.util.List;

public class ExtractIntegerFromString {
    static void main(String[] args) {
        String  s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56";
        String[] arr = s.split("[^0-9]+");
        System.out.println(Arrays.toString(arr));
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
