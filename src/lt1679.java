import java.util.HashMap;
import java.util.Map;

public class lt1679 {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        int target = -1;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            target = k - nums[i];
            if (hmap.containsKey(target) && hmap.get(target)>0){
                ans++;
                hmap.put(target,hmap.get(target)-1);
            } else {
                if (hmap.containsKey(nums[i])){
                    hmap.put(nums[i],hmap.get(nums[i])+1);
                } else {
                    hmap.put(nums[i],1);
                }
            }
        }
        return ans;
    }
}
