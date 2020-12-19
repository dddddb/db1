import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        List<int[]> anslist = new ArrayList<>();
        boolean palced = false;
        for (int[] interval : intervals) {
            if (right < interval[0]) {
                if (!palced) {
                    anslist.add(new int[]{left, right});
                    palced = true;
                }
                anslist.add(interval);
            } else if (left > interval[1]) {
                anslist.add(interval);}
            else {
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }
            if (!palced) {
                anslist.add(new int[]{left, right});
            }
            int[][] ans = new int[anslist.size()][2];
            for (int i = 0; i < anslist.size(); i++) {
                ans[i] = anslist.get(i);
            }
            return ans;
        }

    }