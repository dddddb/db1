package zuoye;

import java.util.Scanner;

public class Solution5 {
    private static int n;
    private static int[] a;
    private static int[] b;
    private static boolean[][][] p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            n = sc.nextInt();
            a = new int[n + 1];
            b = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }

            int max1 = getMaxValue(a, n);
            int max2 = getMaxValue(b, n);
            int mx = max(max1, max2);  //单个作业完成任务所需时间最大值
            int mn = mx * n;  //所有任务完成时间上限

            p = new boolean[mn + 1][mn + 1][n + 1];

            int result = schedule(n, mn);

            System.out.println(result);
        }
    }

    /*
    假设p(i, j, k)表示前k个任务在机器A处理不超过时间i，在机器B处理不超过时间j内完成，为boolean型
    p(i, j, k) = p(i-ak, j, k-1) || p(i, j-bk, k-1)  前提是i>=ak, j>=bk
    p(i, j, 0) = 1
    最短处理时间为 min{max{i, j}}
    */
    private static int schedule(int n, int mn) {
        for (int i = 0; i <= mn; i++)
            for (int j = 0; j <= mn; j++) {
                p[i][j][0] = true;
                for (int k = 1; k <= n; k++)
                    p[i][j][k] = false;
            }
        for (int k = 1; k <= n; k++)
            for (int i = 0; i <= mn; i++)
                for (int j = 0; j <= mn; j++) {
                    if (i >= a[k])
                        p[i][j][k] = p[i - a[k]][j][k - 1];
                    if (j >= b[k])
                        p[i][j][k] = (p[i][j][k] || p[i][j - b[k]][k - 1]);
                }
        int opt = mn;
        int temp;
        for (int i = 0; i <= mn; i++)
            for (int j = 0; j <= mn; j++)
                if (p[i][j][n]) {
                    temp = max(i, j);
                    if (temp < opt)
                        opt = temp;
                }
        return opt;

    }

    //返回数组c[1,n]中的最大值
    private static int getMaxValue(int c[], int n) {
        int mx = c[1];
        for (int i = 2; i <= n; i++)
            if (c[i] > mx)
                mx = c[i];
        return mx;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
