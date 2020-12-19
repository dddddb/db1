package leetcood;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        //i从1遍历到n,同时从头开始对比target元素
        // 当元素i在target里面时只记录push操作,然后target移到下一元素
        // 否则丢弃该元素,即push再pop
        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
            if (i < target[j]) {
                //当i小于target当前值时,丢弃当前元素,即记录push再pop
                list.add("Push");
                list.add("Pop");
            } else if (i == target[j]) {
                //当元素i在target出现时,记录push操作,并开始比较target下一元素
                list.add("Push");
                j++;
            }
        }
        return list;

    }
}
