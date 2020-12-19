package zuoye;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public static List swap(int[] a, int k) {
        int n = a.length;
        int [] res = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = k; i < n; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < k; i++) {
            list.add(a[i]);
        }



        return list;
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int k = 3;

        System.out.println(swap(a,k));
    }


}
