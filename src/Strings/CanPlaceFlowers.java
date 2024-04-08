package Strings;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int flowerCount = 0;

        if(flowerbed.length == 1 && flowerbed[0] == 0)
            flowerCount++;
        else{
            for(int i = 0 ; i < flowerbed.length ; i++){
                if(i == 0 && flowerbed[i] == 0){
                    if(flowerbed[i + 1] == 0){
                        flowerbed[i] = 1;
                        flowerCount++;
                    }
                }
                else if(i == flowerbed.length - 1 && flowerbed[i] == 0){
                    if(flowerbed[i - 1] == 0){
                        flowerbed[i] = 1;
                        flowerCount++;
                    }
                }
                else if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                    flowerbed[i] = 1;
                    flowerCount++;
                }
            }
        }

        return flowerCount >= n;
    }
}
