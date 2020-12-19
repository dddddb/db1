package zuoye;

import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        int[] a = new int[]{0, 10};
        int n = 1;//序列长度
        int m = 1;//分割段数
        int mm = getMRange(a, n, m);
        System.out.println(mm);
    }

    private static int getMRange(int[] a, int n, int m) {
        int[][] dp = new int[100][100];
        for (int i = 1; i <= n; i++) {            //当j=1时表示整个序列的和
            dp[i][1] = dp[i - 1][1] + a[i];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 1; k <= i; k++) {    //最后一段的每一次的分组情况
                    int temp = Math.max(dp[k][j - 1], dp[i][1] - dp[k][1]);

                    if (temp < min) {        //寻找最小值并赋值
                        min = temp;
                    }
                }
                dp[i][j] = min;
            }
        }

        return dp[n][m];
    }
/*
    public static int getMin(int a[], int len) {
        int dp[][] = new int[a.length][len+1];
        for (int i = 1; i < a.length; i++) {
            dp[i][1] = dp[i - 1][1] + a[i-1];
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 2; j <= len; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 1; k < i; k++) {
                    if (min > Math.max(dp[i][1] - dp[k][1], dp[k][j - 1])) {
                        min = Math.max(dp[i][1] - dp[k][1], dp[k][j - 1]);
                    }
                }
                dp[i][j] = min;
            }
        }
        return dp[a.length-1][len];
    }

    public static void main(String[] args) {
//        int[]a = new int[]{9,8,7,6,5,4,3,2,1};
//        int[]a = new int[]{10};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(getMin(a,1));
    }*/
}
