package leetcood;

public class _402_移掉K位数字 {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";

        StringBuilder str = new StringBuilder(num);
        while(k>0){
            int index = 0;
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i) >= str.charAt(i-1)){
                    index = i;
                }else{
                    break;
                }
            }
                str.deleteCharAt(index);
                k--;
            }
        while (str.length()>1 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }
        return str.length()<1 ? "0" : str.toString();
    }
}
