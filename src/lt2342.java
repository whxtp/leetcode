import java.util.HashMap;
import java.util.Map;

public class lt2342 {
    public int maximumSum(int[] nums) {
        int ans = -1;
        int now = 0;
        int len = nums.length;
        int currentSum = 0;
        int mapNum = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < len; i++){
            currentSum = getSumDigit(nums[i]);
            if (hmap.containsKey(currentSum)){
                mapNum = hmap.get(currentSum);
                now = mapNum + nums[i];
                ans = Math.max(now, ans);
                if (mapNum < nums[i]){
                    hmap.put(currentSum, nums[i]);
                }
            } else {
                hmap.put(currentSum, nums[i]);
            }
        }
        return ans;
    }

    public static int getSumDigit(int num){
        int sum = 0, digit = 0;
        while(num > 0){
            digit = num % 10;
            num = num/10;
            sum = sum + digit;
        }
        return sum;
    }
}
