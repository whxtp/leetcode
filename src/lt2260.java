import java.util.HashMap;
import java.util.Map;

public class lt2260 {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int len = cards.length;
        int ans = Integer.MAX_VALUE;
        int now;
        for (int i = 0; i< len; i++){
            if (hmap.containsKey(cards[i])){
                now = i - hmap.get(cards[i]) + 1;
                hmap.put(cards[i], i);
                ans = Math.min(now, ans);
            } else {
                hmap.put(cards[i], i);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else {
            return ans;
        }
    }
}
