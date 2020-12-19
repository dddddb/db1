package zuoye;

import java.util.Scanner;
/*5
50 43 1 58 60
87 22 5 62 71
62 98 97 27 38
56 57 96 73 71
92 36 43 27 95*/

public class 工作分配问题 {
    public static int sum = 0,n;
    public static int [] [] num ;
    public static boolean []  b;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        num = new int [n+1][n+1];
        b = new boolean [n+1];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                num[i][j]=sc.nextInt();
            }
        }
        f(1);
        System.out.println(min);
    }
    public static void f(int a){
        if(a==n+1){
            if(sum<min){
                min=sum;
            }
            return;
        }
        for (int i = 1; i <=n; i++) {
            if(!b[i]){
                sum+=num[a][i];
                b[i]=true;
                f(a+1);
                sum-=num[a][i];
                b[i]=false;
            }
        }
    }
}
