import java.util.HashMap;
import java.util.Map;

public class lt1010 {
    public int numPairsDivisibleBy60_1(int[] time) {
        int ans = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        int target = 0;
        for (int i = 0; i < time.length ; i++){
            for (Map.Entry<Integer, Integer> entry : hmap.entrySet()){
                if ((entry.getKey() + time[i]) % 60 == 0){
                    ans = ans + entry.getValue();
                }
            }
            if (hmap.containsKey(time[i])){
                hmap.put(time[i],hmap.get(time[i])+1);
            } else {
                hmap.put(time[i], 1);
            }
        }
        return ans;
    }

    public int numPairsDivisibleBy60_2(int[] time) {
        if (time.length == 0) return -1;
        int count = 0;

        int[] remainders = new int[60];

        for (int t: time) {
            if (t % 60 == 0) {
                count += remainders[0];
            } else {
                count += remainders[60 - t%60];
            }
            remainders[t % 60] ++;
        }

        return count;
    }
}
