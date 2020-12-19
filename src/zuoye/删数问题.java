package zuoye;

public class 删数问题 {
    public static int del(int a,int b){
        StringBuffer sb = new StringBuffer(a+"");

        int i=0,j=0;
        for(i=0;i<b;i++) {
            /*
             * 若各位数字递增，则删除最后一个数否则删除第一个减区间的数*/
            for(j=0;j<sb.length()-1&&sb.charAt(j)<=sb.charAt(j+1);j++)
            {
            }
            sb.delete(j,j+1);


        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int a =178543;
        int b =4;
        System.out.println(del(a,b));
    }
}
