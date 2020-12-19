/*
给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
字符（'a' - 'i'）分别用（'1' - '9'）表示。
字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
返回映射之后形成的新字符串。
题目数据保证映射始终唯一。
示例 1：
输入：s = "10#11#12"
输出："jkab"
解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
示例 2：
输入：s = "1326#"
输出："acz"
示例 3：
输入：s = "25#"
输出："y"
示例 4：
输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
输出："abcdefghijklmnopqrstuvwxyz"
*/

public class Map2 {
    public String freqAlphabets(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //如果字符串长度小于3，或者循环到最后两个时，就不会出现#
            if (s.length() < 3 || i >= s.length() - 2) {
                //拿到char后加48变成对应字母的ASCII码
                builder.append((char)(s.charAt(i) + 48));
                //进入下一次循环
                continue;
            }
            //判断当前下标加二后的下标上是不是#
            if (s.charAt(i+2) != '#') {
                //不是的话就是0-9
                builder.append((char) (s.charAt(i) + 48));
            } else {
                //是的话就是10# - 26#
                //分割出数字，转成int再加上96变成对应字母的ASCII码
                builder.append((char)(Integer.parseInt(s.substring(i, i+2)) + 96));
                //下标往后移两位
                i += 2;
            }
        }
        return builder.toString();
    }

}
