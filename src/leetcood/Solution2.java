package leetcood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public int[] sortArrayByParityII(int[] A) {
        /*int len = A.length;
        int[] res = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                res[j] = A[i];
                j += 2;
            }

        }
        int k = 1;
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 != 0) {
                res[k] = A[i];
                k += 2;
            }

        }
        return res;*/
    int n = A.length;
    int i = 1;
        for (int j = 0; j < n; j+=2) {
            if(A[j]%2 ==1){
                while (A[i] %2 ==1){
                    i+=2;
                }
                swap(A,i,j);
            }
        }
        return A;

    }
    public void swap(int [] A,int i ,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
