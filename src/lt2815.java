import java.util.HashMap;
import java.util.Map;

public class lt2815 {
    public int maxSum(int[] nums) {
        int ans = -1;
        Map<Integer,Integer> hmap = new HashMap<>();
        for (int j = 0; j < nums.length;j++ ){
            int currentMaxDigit = getMaxDigit(nums[j]);
            if(hmap.containsKey(currentMaxDigit)){
                int mapValue = hmap.get(currentMaxDigit);
                int now = mapValue+nums[j];
                ans = Math.max(now,ans);
                if (nums[j]>hmap.get(currentMaxDigit)){
                    hmap.put(currentMaxDigit, nums[j]);
                }
            } else {
                hmap.put(currentMaxDigit,nums[j]);
            }
        }

        return ans;

    }

    public int getMaxDigit(int num) {
        int max = 0;
        while (num > 0) {
            int digit = num % 10;
            max = Math.max(max, digit);
            num /= 10;
        }
        return max;
    }
}
