package zuoye;

import java.util.*;

public class Solution2 {
    public static int[] most(int []a){
        List<Integer> list = new ArrayList<>();
        int n =a.length;
        Arrays.sort(a);
        int []res = new int[2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            for (int j = i; j < n; j++) {
                if (temp == a[j]) count++;
            }
            list.add(a[i]);
            list.add(count);
            count=0;
        }
        int max = 0;
        for (int i = 1; i < n; i+=2) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if(max == list.get(i)){
                res[0] = list.get(i-1);
                res[1] = list.get(i);
        }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] s = {1,2,2,2,3,5};
        int[] res =most(s);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
