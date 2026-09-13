import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthLargestNumber {
    static void main(String[] args) {
        String[] nums = {"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};

        Arrays.sort(nums, (a, b) ->
                Long.compare(Long.parseLong(b), Long.parseLong(a))
        );

        System.out.println(Arrays.toString(nums));



    }

}
