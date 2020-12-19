package zuoye;

import java.util.Scanner;

public class Solution6 {
    public static int maxsum(int[][] arr){

        int len = arr.length - 1;
        int[] max = arr[len];
        for (int i = len-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                max[j] = Math.max(max[j], max[j + 1]) + arr[i][j];
            }
        }
        return max[0];


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        int m =3,n=5;
        int[][] arr = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};*/
        int n = in.nextInt();
        int [][] arr = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = in.nextInt();
            }


        }

        System.out.println(maxsum(arr));
    }
}
