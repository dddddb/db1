package zuoye;

import java.util.Scanner;

public class Solutio8 {
    private static int n,m;
    private static String str;
    private static int[][] f,ka;


    /*
    I(s,t): I的由从s位开始的t位数字组成的十进制数
    f(i,j): I(0,i)的最大j乘积
    f(i,j)=max{f(k,j-1)*I(k,i-k)} (1<=k<i)
    */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true){
            n = input.nextInt();
            m = input.nextInt();

            if(n < m || n==0){
                System.out.println(0);
                return;
            }

            str = input.next();
            if(n != str.length()){
                System.out.println(0);
                return;
            }

            f = new int[n+1][m+1];
            ka = new int[n+1][m+1];

            dynamic();
            out();
        }
    }

    private static void dynamic(){
        int i,j,k;
        int temp,maxt,tk=0;
        for(i=1; i<=n; i++)
            f[i][1] = conv(0,i);

        for(j=2; j<=m; j++)
            for(i=j; i<=n; i++){
                for(k=1,temp=0; k<i; k++){
                    maxt = f[k][j-1]*conv(k,i-k);
                    if(temp < maxt){
                        temp = maxt;
                        tk = k;
                    }
                }
                f[i][j] = temp;
                ka[i][j] = tk;
            }
    }
    private static int conv(int i, int j){
        String str1;
        if(i < j){
            str1 = str.substring(i,j);
        }else {
            str1 = str.substring(i,i+1);
        }
        return Integer.parseInt(str1);
    }

    private static void out(){
        System.out.println(f[n][m]);
        /*for(int i=m,k=n; i>=1&&k>0; k=ka[k][i],i--)
            System.out.println("f["+k+"]["+i+"]="+f[k][i]);*/
    }
}

