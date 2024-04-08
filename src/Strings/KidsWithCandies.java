package Strings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // candies -> lista de cantidad de dulces por niño
        // extraCandies -> dulces extra que no están en poder de ningún niño
        // Por cada niño, determinar si al darle los dulces extra pasa a ser el que más tenga

        List<Boolean> res = new ArrayList<>();
        int maxAmount = Integer.MIN_VALUE;

        for(int amount :candies){
            if(amount > maxAmount) maxAmount = amount;
        }

        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= maxAmount) res.add(true);
            else res.add(false);
        }

        return res;
    }
}
