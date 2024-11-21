import java.util.HashMap;
import java.util.Map;

public class lt1512 {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0;j<len ; j++){
            if (map.containsKey(nums[j])){
                map.put(nums[j], map.get(nums[j])+1);
                ans = ans + map.get(nums[j]);
            } else {
                map.put(nums[j],0);
            }
        }
        return ans;
    }
}
