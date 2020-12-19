package zuoye;
/*子集和问题*/

import java.util.Scanner;
public class SubSet {
    public int getSum1(boolean[] visited, int[] A) {
        int sum = 0;
        for(int i = 0;i < A.length;i++) {
            if(visited[i])
                sum += A[i];
        }
        return sum;
    }

    public void getSubSet1(boolean[] visited, int[] A, int m, int step) {
        if(step == A.length) {
            if(getSum1(visited, A) == m) {
                for(int i = 0;i < A.length;i++) {
                    if(visited[i])
                        System.out.print(A[i]+" ");
                }
                System.out.println();
            }
            return;
        }
        visited[step] = true;
        getSubSet1(visited, A, m, step + 1);
        visited[step] = false;
        getSubSet1(visited, A, m, step + 1);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        SubSet test = new SubSet();
        int n = in.nextInt();
        int[] A = new int[n];
        boolean[] visited = new boolean[n];
        for(int i = 0;i < n;i++) {
            A[i] = in.nextInt();
            visited[i] = false;
        }
        test.getSubSet1(visited, A, 10, 0);
    }

}
