package zuoye;

public class n后问题_排列树 {
    static int resultCount = 0;

    private static boolean place(int[] arr, int s) {//判定s行arr[s]位置上的皇后，与1至s-1行上各皇后的位置是否满足约束条件
        for(int i = 0; i < s; i++) {
            if((arr[i] == arr[s]) || (Math.abs(i-s) == Math.abs(arr[i]-arr[s]))) {
                return false;
            }
        }
        return true;
    }

    public static void tria(int[] arr, int i, int n) {//棋盘为n*n，函数从第i行起求解皇后的布局
        if(i >= n) {
            ++resultCount;
        } else {
            for(int j = 0; j < n; j++) {
                arr[i] = j;
                if(place(arr, i)) {
                    tria(arr, i+1, n);//结点满足约束条件，则递归进入下一层继续遍历，否则跳过
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] queen = new int[8];
        tria(queen, 0, 8);

        System.out.println(resultCount);
    }
}
