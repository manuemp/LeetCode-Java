package Arrays;

//Búsqueda binaria. Si no encuentro el número devuelvo la posición en la que debería
//haber estado.

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;

        while(start <= end){
            middle = end + (start - end) / 2;
            if(nums[middle] == target) return middle;
            if(nums[middle] > target) end = middle - 1;
            else start = middle + 1;
        }

        return start;
    }
}
