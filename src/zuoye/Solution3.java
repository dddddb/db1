package zuoye;

public class Solution3 {
    public static int count(int n, int m) {

        if (m == 1) return 1;
        if (n == m) return 1;
        else
            return count(n - 1, m - 1) + m * count(n - 1, m);



    }
        public static void main (String[]args){
            int res = count(4, 2);
            System.out.println(res);
        }
    }
