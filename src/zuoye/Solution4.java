package zuoye;

public class Solution4 {
    static int count = 0;
    public static void count2(int n){
        if (n==1) count++;
        for (int i = 2; i <= n; i++) {
            if (n%i==0){
                count2(n/i);
            }
        }

    }

    public static void main(String[] args) {
        count2(12);
        System.out.println(count);
    }
}
