import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(len ==0){
            return res;
        }
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs (int[] nums, int len, int depth,
                      List<Integer> path, boolean[] used, List<List<Integer>> res){
        if(depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i =0;i<len;i++){
            if(!used[i]){
                path.add(nums[i]);
                used[i] = true;

                dfs(nums ,len, depth+1, path, used, res);
                used[i] = false;
                path.remove(path.size()-1);

            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }

}
