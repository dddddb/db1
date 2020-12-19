package leetcood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int t =0;
        boolean b = false;
        if(n < 3) return true;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] > nums[i+1]) {
                t++;
                if (t > 1) break;
                if (i - 1 >= 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return t<=1;

        }
}


