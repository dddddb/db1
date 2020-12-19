import java.util.Scanner;

public class Juzhen
{
    public static int max(int[][] arr, int m, int n){
        int[][] res = new int[m][n];
        res[0][0] = arr[0][0];
        for(int i=1;i<m;i++){
            res[0][i]=res[0][i-1]+arr[0][i];
        }
        for(int i=1;i<n;i++){
            res[i][0]=res[i-1][0]+arr[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                res[i][j]=arr[i][j]+Math.max(res[i-1][j],res[i][j-1]);
            }
        }
        return res[m-1][n-1];


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m =3,n=3;
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(max(arr,m,n));
    }
}
