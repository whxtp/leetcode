import java.util.HashMap;
import java.util.Map;

public class lt219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ans = false;
        int len = nums.length;
        Map<Integer, Integer > hmap = new HashMap<>();
        for (int i = 0; i< len; i++){
            if (hmap.containsKey(nums[i])){
                if(Math.abs(hmap.get(nums[i])-i)<=k){
                    ans = true;
                    break;
                }
                hmap.put(nums[i],i);
            } else {
                hmap.put(nums[i],i);
            }
        }
        return ans;
    }
}
