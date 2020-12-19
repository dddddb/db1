import sun.awt.image.SunVolatileImage;

class showInfo1 {
    public static void main(String[] args) {
//        Person person1 = new Person("张三",18,180,"西邮",false,2238);
        /*System.out.println(person1);*/
        Person.showInfo("张三",18,180,"西邮",false,2238);
    }
}
class Solution1 {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        int left = 0;
        int right = len - 1;
        //从左边往右边找，一直找到山峰为止
        while (left + 1 < len && A[left] < A[left + 1])
            left++;
        //从右边往左边找，一直找到山峰为止
        while (right > 0 && A[right - 1] > A[right])
            right--;
        //判断从左边和从右边找的山峰是不是同一个
        return left > 0 && right < len - 1 && left == right;
    }
}
