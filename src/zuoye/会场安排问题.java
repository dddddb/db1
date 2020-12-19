package zuoye;

import java.util.Scanner;

public class 会场安排问题 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = -1;
        int geshu = 0;

        num = input.nextInt();// 输入待安排的活动个数


        int[] s = new int[num];
        int[] f = new int[num];
        for (int i = 0; i < num; i++) {
            s[i] = input.nextInt();
            f[i] = input.nextInt();
        }
        // 按照演出开始时间排序
        for (int i = 0; i < s.length; i++) {
            int temp1 = 0;
            int temp2 = 0;
            for(int j = i+1; j < s.length; j++) {
                if (s[i] > s[j]) {
                    temp1 = s[i];
                    s[i] = s[j];
                    s[j] = temp1;
                    temp2 = f[i];
                    f[i] = f[j];
                    f[j] = temp2;
                }
            }
        }

        // 双重循环得到安排的会场
        int[] anpai = new int[num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (anpai[j] < s[i]) {
                    anpai[j] = f[i];
                    break;
                }
            }
        }

        // 遍历安排的数值，找出被安排的个数
        for (int i = 0; i < num; i++) {
            if (anpai[i] != 0) {
                geshu++;
            }
        }
        System.out.println(geshu);
    }
}
