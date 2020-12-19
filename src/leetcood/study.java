package leetcood;

public class study {
    public static int sum(int a,int b ,int c){
        return a+b+c;
    }


    public static int sum1(int n){
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                s+=i;
            }
        }
        return s;
    }

    public static int sum2(int n){

        int sumo = 0;
        int sumj = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                sumo+=i;
            }else {
                sumj+=i;
            }
        }
        return sumo - sumj;
    }


    public static void solution(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int res = sum2(5);
        System.out.println(res);
        solution(5);
    }


}
