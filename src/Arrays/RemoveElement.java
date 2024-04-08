package Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0, last = nums.length - 1;

        for(int i = 0 ; i < nums.length && i <= last ; i++){
            if(nums[i] == val){
                while(last > i && nums[last] == val) last--;
                if(nums[last] != val){
                    nums[i] = nums[last];
                    nums[last] = val;
                    last--;
                    k++;
                }
            }
            else k++;
        }
        return k;
    }
}
