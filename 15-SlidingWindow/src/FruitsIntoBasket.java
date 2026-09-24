import java.util.HashMap;

public class FruitsIntoBasket {
    static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
    static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;
        int maxFruits = 0;
        int l = 0;
        for(int r = 0; r < fruits.length; r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0) + 1);

            if(map.size() > k){
                while(map.size() > k){
                    map.put(fruits[l], map.get(fruits[l]) - 1);
                    if(map.get(fruits[l]) == 0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }

            maxFruits = Math.max(maxFruits,r - l + 1);
        }
        return maxFruits;
    }
}
