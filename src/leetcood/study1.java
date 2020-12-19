package leetcood;

public class study1 {
    public static void  shuzu1(int n){
        for (int i = 0; i <= n; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

    public static  void shuzu2(int[] a){

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.println(a[i]);
        }

        /*int left =0;
        int right = a.length-1;
            while (left<=right){
                int temp;
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
            return a;*/
    }

    public static int[] shuzu3(int[] a){
        int left =0;
        int right = a.length-1;
        while (left<=right){
            int temp;
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;

    }

    public  static  void shuzu4(int [] a,int n){
        for (int i = 0; i < a.length; i++) {
            if(a[i] ==n){
                System.out.println(i);
            }
        }
    }

    public static int shuzu5(int []a ){
        int max = a[0];
        for (int i = 0; i <a.length; i++) {
            if(a[i]>max) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int [] res = new int[]{11, 32,55, 47,79,23};
        /*int []r =shuzu3(res);
       *//* for(int i : r){
            System.out.println(i);*/
//       shuzu4(res,32);

        System.out.println(shuzu5(res));

    }


}
