import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
示例 1：
输入：arr = [1,2,2,1,1,3]
输出：true
解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
示例 2：
输入：arr = [1,2]
输出：false
示例 3：
输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
输出：true
*/
public class Map1 {
    public boolean uniqueOccurrences(int[] arr) {
        // 键值对 <数组值，出现次数>
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(x)) {   // 已经存在，次数 +1
                map.put(x, map.get(x) + 1);
            } else {                    // 不存在，记录 1 次
                map.put(x, 1);
            }
        }
        // 判断是否有相同的出现次数
        Set<Integer> set = new HashSet<>();
        for (Integer i : map.keySet()) {
            if (!set.add(map.get(i))) { // 有
                return false;
            }
        }
        return true;    // 没有
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] arr = stringToIntegerArray(line);

            boolean ret = new Map1().uniqueOccurrences(arr);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
